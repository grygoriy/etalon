package com.ca.etalon.tests

import grails.util.Environment
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.test.motivation.MotivationProcessedQuestion
import com.ca.etalon.test.lidership.LidershipTest
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.test.yovayshy.YovayshyProcessedQuestion
import com.ca.etalon.tests.lidership.LidershipQuestion
import com.ca.etalon.test.lidership.LidersiProcessQuestion
import com.ca.etalon.tests.motivation.MotivationQuestion
import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.tests.actualization.ActualQuestion
import com.ca.etalon.test.actuality.ActualProcessedQuestion
import com.ca.etalon.test.interestmap.IMTest
import com.ca.etalon.tests.interestmap.IMQuestion
import com.ca.etalon.test.interestmap.IMProcessedQuestion
import com.ca.etalon.tests.yovayshy.YovayshyQuestion
import com.ca.etalon.test.IdLabel

class TestFactoryService {

    static transactional = true

 ActualTest getActualTest() {
    def questions = ActualQuestion.list()
    def processedQuestions = questions.collect {new ActualProcessedQuestion(question:it, answer: isTestEnv() ? 1 : 0 )}

    new ActualTest(questions: processedQuestions)
  }

  IMTest getIMTest() {
    def questions = IMQuestion.list()
    def processedQuestions = questions.collect { new IMProcessedQuestion(question: it, answer: isTestEnv() ? 1 : 0)}

    new IMTest(processedQuestions: processedQuestions)
  }

  YovayshyTest getYovayshyTest() {
    def questions = YovayshyQuestion.list()
    def processedQuestions = questions.collect {
        new YovayshyProcessedQuestion(question:it, answer: isTestEnv() ? 1 : 0)
    }

    new YovayshyTest(processedQuestions:processedQuestions)
  }

  LidershipTest getLidershipTest() {
    def questions = LidershipQuestion.list();
    def processQuestions = questions.collect {
        new LidersiProcessQuestion(lidershipQuestion:it, answer: isTestEnv() ? 1 : 0)
    }

    new LidershipTest(lidersiprocessQuestions:processQuestions)
  }

  MotivationTest getMotivationTest() {
    def questions = MotivationQuestion.list()
    def processedQuestions = questions.collect {
        new MotivationProcessedQuestion(motivationQuestion:it, answer: isTestEnv() ? 1 : 0)
    }

    new MotivationTest(motivationProcessedQuestions:processedQuestions)
  }

   boolean isTestEnv() {
        Environment.currentEnvironment == Environment.DEVELOPMENT
    }

    List<IdLabel> getIMAnswers() {
        [
          new IdLabel(id:1, answer:'дуже подобається'),
          new IdLabel(id:2, answer:'подобається'),
          new IdLabel(id:0, answer:'сумніваюсь'),
          new IdLabel(id:-1, answer:'не подобається'),
          new IdLabel(id:-2, answer:'дуже не подобається')
      ]
    }
}
