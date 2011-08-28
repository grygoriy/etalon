package com.ca.etalon.com.ca.etalon

import com.ca.etalon.School
import com.ca.etalon.tests.TestService
import com.ca.etalon.util.TestProcess
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.test.holland.HollandVector

class TestController {

  TestService testService
  def defaultAction = 'start'

  def start = {
    String name = '';
    return [student:name]
  }

  def submitInitials = {
    def testProcess = testService.testTemplate
    session.test = testProcess;
    testProcess.userName = params.student
    def school = School.findById(params.schoolId)
    if (school != null) {
      testProcess.school = school
      redirect(action:'interestsMap')
    } else {
      flash.message = 'Виберіть школу'
      render(view:'start', model:[name:params.student])
    }

  }

  def interestsMap = {
    if(session.test) {
        return [imTest:session.test.imTest]
    } else{
        flash.message = 'Ви повинні почати тест з початку'
        redirect(controller:'test', action:'start')
        null
    }
  }

  def sumbitInterestMap = {
    TestProcess testProcess = session.test
    boolean hasErrors = testProcess.imTest.processErrors(params.answer)
    if (hasErrors) {
      render(view:'interestsMap', model:[imTest:testProcess, hasErrors:hasErrors])
    } else {
      testService.persistTest(testProcess)
      redirect(action:'actuality')
    }
  }

  def actuality = {
    if(session.test) {
        return [actuality:session.test.actualTest]
    } else{
        flash.message = 'Ви повинні почати тест з початку'
        redirect(controller:'test', action:'start')
        null
    }
  }

  def submitActuality = {
    TestProcess testProcess = session.test
    boolean hasErrors = testProcess.actualTest.processErrors(params.answer)
    if (hasErrors) {
      render(view:'actuality', model:[actuality:session.test.actualTest, hasErrors:hasErrors])
    } else {
      testService.persistTest(testProcess)
      redirect(action:'yovayshy')
    }
  }

  def yovayshy = {
    if(session.test) {
        return [yovayshyTest:session.test.yovayshyTest]
    } else{
        flash.message = 'Ви повинні почати тест з початку'
        redirect(controller:'test', action:'start')
        null
    }
  }

  def submitYovayshy = {
    TestProcess testProcess = session.test
    boolean hasErrors = testProcess.yovayshyTest.processErrors(params.answer)
    if (hasErrors) {
      render(view:'yovayshy', model:[yovayshyTest:session.test.yovayshyTest, hasErrors:hasErrors])
    } else {
      testService.persistTest(testProcess)
      redirect(action:'result')
    }
  }

  def result = {
    session.passMain = false
  }
 
  def lidership = {
    TestProcess testProcess = session.test
    testProcess = testService.extendTest(testProcess)

    return [lidership:testProcess.lidershipTest]
  }

  def submitLidership = {
    TestProcess testProcess = session.test
    boolean hasErrors = false
    testProcess.lidershipTest.lidersiprocessQuestions.each {processedQuestion ->
      String answer = (String) params['answer'+processedQuestion.lidershipQuestion.id]
      if (answer != null && ['1','2'].any{it == answer}) {
        processedQuestion.answer = Integer.valueOf (answer)
        processedQuestion.errorMessage = ''
      } else {
        processedQuestion.errorMessage = 'Вкажіть будь-ласа відповідь'
        hasErrors = true;
      }
    }

    if (hasErrors) {
      render(view:'lidership', model:[lidership:testProcess.lidershipTest, hasErrors:hasErrors])
    } else {
      testService.persistExtendedTests(testProcess)
      redirect(action:'motivation')
    }
  }

  def motivation = {
    TestProcess testProcess = session.test
    return [motivation:testProcess.motivationTest]
  }

  def submitMotivation = {
    TestProcess testProcess = session.test
    MotivationTest motivationTest = testProcess.motivationTest
    boolean hasErrors = testProcess.motivationTest.processErrors(params.answer)
    motivationTest.speciality = params.speciality
    
    if (hasErrors) {
      render(view:'motivation', model:[motivation:motivationTest, hasErrors:hasErrors])
    } else {
      testService.persistExtendedTests(testProcess)
      redirect(action:'holland')
    }
  }

  def holland = {
    List<HollandQuestion> hollandQuestions = HollandQuestion.list()
    List<HollandQuestion> iLikeIt = []
    List<HollandQuestion> iCanDoItt = []
    List<HollandQuestion> proffetion = []

    hollandQuestions.each {
      switch (it.vector) {
        case HollandVector.ILikeIt:
            iLikeIt.add(it);
            break;
        case HollandVector.ICanDoIt:
          iCanDoItt.add(it);
          break;
        case HollandVector.Proffetion:
          proffetion.add(it);
          break;
      }
    }

    return [iLikeIt:iLikeIt, iCanDoIt:iCanDoItt, proffetion:proffetion]
  }

  def submitHolland = {
    Integer idMax = HollandQuestion.count();
    List<HollandQuestion> hollandQuestions = []
    for (int i = 0; i<= idMax; i++) {
      String value = (String) params["question$i"]
      if (value != null && value == 'on') {
        HollandQuestion question = HollandQuestion.findById(i)
        hollandQuestions.add(question)
      }
    }
    TestProcess testProcess = session.test
    testProcess.hollandQuestions = hollandQuestions

    testService.persistExtendedTests(testProcess)
    session.test = null
    redirect(action:'result')
  }

}
