package com.ca.etalon

import grails.plugins.springsecurity.Secured

@Secured(["ROLE_ADMINISTRATOR"])
class SchoolController {
  def scaffold = School
    
}
