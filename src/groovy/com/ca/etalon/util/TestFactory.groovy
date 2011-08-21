package com.ca.etalon.util

import com.ca.etalon.test.actuality.ActualProcessedQuestion
import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.test.interestmap.IMProcessedQuestion
import com.ca.etalon.test.interestmap.IMTest
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.tests.actualization.ActualQuestion

import com.ca.etalon.tests.yovayshy.YovayshyQuestion
import com.ca.etalon.test.yovayshy.YovayshyProcessedQuestion
import com.ca.etalon.test.lidership.LidershipTest
import com.ca.etalon.tests.lidership.LidershipQuestion
import com.ca.etalon.test.lidership.LidersiProcessQuestion
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.tests.motivation.MotivationQuestion
import com.ca.etalon.test.motivation.MotivationProcessedQuestion
import grails.util.Environment
import com.ca.etalon.tests.interestmap.IMQuestion

/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Aug 19, 2009
 * Time: 4:26:01 PM
 * To change this template use File | Settings | File Templates.
 */

class TestFactory {

  static TestProcess getTestProcessTamplate() {
    TestProcess testProcess = new TestProcess()
    testProcess.imTest = getIMTest()
    testProcess.actualTest = actualTest
    testProcess.yovayshyTest = yivayshyTest
    return testProcess
  }

  static TestProcess updateWithExtraTest(TestProcess testProcess) {
    testProcess.lidershipTest = lidershipTest;
    testProcess.motivationTest = motivationTest;
    return testProcess;
  }

  private static ActualTest getActualTest() {
    def questions = ActualQuestion.list()
    def processedQuestions = questions.collect {new ActualProcessedQuestion(question:it, answer: isTestEnv() ? 1 : 0 )}

    new ActualTest(questions: processedQuestions)
  }
  
  private static IMTest getIMTest() {
    def questions = IMQuestion.list()
    def processedQuestions = questions.collect  { new IMProcessedQuestion(question: it, answer: isTestEnv() ? 1 : 0)}

      new IMTest(processedQuestions: processedQuestions)
  }

  private static YovayshyTest getYivayshyTest() {
    def questions = YovayshyQuestion.list()
    def processedQuestions =
                        questions.collect { new YovayshyProcessedQuestion(question:it, answer: isTestEnv() ? 1 : 0) }

    new YovayshyTest(processedQuestions:processedQuestions)
  }

  private static LidershipTest getLidershipTest() {
    def questions = LidershipQuestion.list();
    def processQuestions =
                    questions.collect {new LidersiProcessQuestion(lidershipQuestion:it, answer: isTestEnv() ? 1 : 0)}

    new LidershipTest(lidersiprocessQuestions:processQuestions)
  }

  private static MotivationTest getMotivationTest() {
    def questions = MotivationQuestion.list()
    def processedQuestions =
            questions.collect { new MotivationProcessedQuestion(motivationQuestion:it, answer: isTestEnv() ? 1 : 0) }

    new MotivationTest(motivationProcessedQuestions:processedQuestions)
  }

   private static boolean isTestEnv() {
        Environment.currentEnvironment == Environment.DEVELOPMENT
    }

}