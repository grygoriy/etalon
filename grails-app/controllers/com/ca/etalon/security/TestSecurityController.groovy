package com.ca.etalon.security

import com.ca.etalon.User


class TestSecurityController {

    def springSecurityService

    def validateMajorTest = {
      return [password:""]
    }

    def submitValidateMajorTest = {
      String password = params.password
      User user = User.findByLogin(SecurityUtils.subject.principal);
      if (user.password == springSecurityService.encodePassword(password)) {
        session[session.validationKey] = true
        redirect(controller: "test", action:session.testRedirect)
      } else {
        flash.message = "Ви ввели не правильний пароль"
        render(view:"validateMajorTest", model:[password:""])
      }

    }
}
