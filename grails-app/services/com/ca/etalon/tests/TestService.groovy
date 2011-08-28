package com.ca.etalon.tests

import com.ca.etalon.result.HollandResult
import com.ca.etalon.result.IMResult
import com.ca.etalon.result.LidershipResult
import com.ca.etalon.result.TestResults
import com.ca.etalon.result.Yovayshy.SphereResult
import com.ca.etalon.result.Yovayshy.YovayshyResult
import com.ca.etalon.result.motivaton.MotivationResult
import com.ca.etalon.result.motivaton.VectorResult
import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.test.holland.HollandType
import com.ca.etalon.test.lidership.LidershipTest
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.test.motivation.MotivationVector
import com.ca.etalon.test.yovayshy.YovayshyAnswer
import com.ca.etalon.test.yovayshy.YovayshySphere
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.tests.interestmap.JobName
import com.ca.etalon.util.TestFactory
import com.ca.etalon.util.TestProcess
import static com.ca.etalon.test.motivation.MotivationVector.InternalIndividual
import static com.ca.etalon.test.motivation.MotivationVector.InternalSocial
import static com.ca.etalon.test.motivation.MotivationVector.ExternalNegative
import static com.ca.etalon.test.motivation.MotivationVector.ExternalPositive
import grails.plugin.springcache.annotations.Cacheable

class TestService {
  static profiled = true
  boolean transactional = true

    @Cacheable("templateCache")
    def getTestTemplate() {
          TestFactory.testProcessTamplate

    }

    def extendTest(TestProcess testProcess) {
      TestFactory.updateWithExtraTest(testProcess);
    }

    def persistExtendedTests(TestProcess testProcess) {
      def testResult = TestResults.findById(testProcess.testResultId)
      testResult.lidershipResult = getLidershipResult(testProcess)
      testResult.motivationResult = getMotivationResult(testProcess)
      testResult.hollandResults = getHollandResult(testProcess)
      testResult.save()
      return testResult
    }

    def persistTest(TestProcess process) {
      TestResults testResult
      if (process.testResultId != null) {
        testResult = TestResults.findById(process.testResultId) 
      } else {
        testResult = new TestResults()
      }

      if (testResult == null) {
          testResult = new TestResults()
      }

      testResult.studentName = process.userName
      testResult.school = process.school
      testResult.save()
      process.testResultId = testResult.id

      testResult.imResults = getIMResults(process, testResult)
      testResult.actualityResults = getActualityResult(process)
      testResult.yovayshyResult = getYovayshyResult(process)
      testResult.save()

      return testResult
    }
                                

    private Integer getActualityResult(TestProcess process) {
      def result = 0;
      def ceil = ActualTest.actualityAnswers.size()
      process.actualTest.questions.each {
        result += it.question.isReverted ? revertAnswer(it.answer, ceil) : it.answer
      }
      return result
    }


   /**
    * provides a reverted value of an answer presented as int number
    * @answer: answer that should me revered
    * @ceil: should be maximum value of an answer
    * @return
    *         reverted value of an answer, using ceil as max possible value <br/>
    *         Commonly it would be
    *         <ul>
    *           <li>1 -> ceil</li>
    *           <li>2 -> ceil-1</li>
    *           <li>...</li>
    *         </ul>
    * Example: Ceil = 4 <BR/>
    *         <ul>
    *           <li>1 -> 4</li>
    *           <li>2 -> 3</li>
    *           <li>3 -> 2</li>
    *           <li>4 -> 1</li>
    *         </ul>
    *
    */
    private Integer revertAnswer(Integer answer, Integer ceil) {
      return ceil - (answer-1)
    }

    private Set<IMResult> getIMResults(TestProcess process, TestResults testResults) {
      def imResults = new HashSet()
      def jobNames = JobName.list()
      jobNames.each {jobName ->
        IMResult imResult = getResultsForCategory(jobName, process)
        if (imResult.result != 0) {
          imResult.results = testResults
          imResult.save()
          imResults << imResult
        }
      }
      return imResults
    }

  private IMResult getResultsForCategory(JobName jobName, TestProcess process) {
    def byCategories = process.imTest.processedQuestions.findAll { it.question.category.id == jobName.id }
    //todo : try to change it to amount = byCategories.*answer.sum()
    int amount = 0
    byCategories.each {item ->
      amount += item.answer
    }
    
    return new IMResult(category: jobName, result: amount)
  }

  private LidershipResult getLidershipResult(TestProcess process) {
    LidershipTest lidershipTest = process.lidershipTest
    Integer score = 0;

    //todo : try to change it to collection summ
    lidershipTest.lidersiprocessQuestions.each {question ->
      if (question.answer == question.lidershipQuestion.keyCase) {
        score += question.answer
      }

    }

    String message;
    if (score <= 25) {
      message = 'якості лідера виражені слабко'
    } else if (score >= 26 && score <= 35){
      message = 'якості лідера виражені середньою мірою'
    } else if (score >= 36 && score <= 40) {
      message = 'лідерські  якості виражені сильно'
    } else {
      message = 'людина як лідер схильна до диктату'
    }

    return new LidershipResult(score:score, message:message).save()
  }

  private MotivationResult getMotivationResult(TestProcess process) {
    MotivationTest motvationTest = process.motivationTest
    List<VectorResult> vectorResults = getVectorResult(motvationTest)
    MotivationResult motivationResult = new MotivationResult(speciality:motvationTest.speciality
                                                           , vectorResults:vectorResults).save()
    return motivationResult
  }


  @SuppressWarnings('ExplicitHashSetInstantiation')
  private Set<HollandResult> getHollandResult(TestProcess process) {
    List<HollandQuestion> hollandQuestions = process.hollandQuestions
    Map<HollandType, Integer> result = [:]
      result.with {
          put(HollandType.Realistic, 0)
          put(HollandType.Artistic, 0)
          put(HollandType.Investication, 0)
          put(HollandType.Social, 0)
          put(HollandType.Comerce, 0)
          put(HollandType.Conventional, 0)
      }

    hollandQuestions.each {
      Integer score = result.get(it.type)
      score++
      result.put(it.type, score)
    }

    def hollandResults = result.entrySet().collect(new HashSet()){new HollandResult(type:it.key,score:it.value).save()}
    return hollandResults
  }

  private List<VectorResult> getVectorResult(MotivationTest motivationTest) {
    Integer internalIndividual = 0;
    Integer internalSocial = 0;
    Integer externalNegative = 0;
    Integer externalPositive = 0;

    motivationTest.motivationProcessedQuestions.each  {
      switch (it.motivationQuestion.motivationVector) {
        case InternalIndividual :
          internalIndividual++;
          break;
        case InternalSocial :
          internalSocial++;
          break;
        case ExternalNegative :
          externalNegative++
          break;
        case ExternalPositive :
          externalPositive++
          break;
      }
    }

    return [
        new VectorResult(motivationVector:InternalIndividual, score:internalIndividual).save(),
        new VectorResult(motivationVector:InternalSocial, score:internalSocial).save(),
        new VectorResult(motivationVector:ExternalNegative, score:externalNegative).save(),
        new VectorResult(motivationVector:ExternalPositive, score:externalPositive).save()
        ]
  }

  private YovayshyResult getYovayshyResult(TestProcess process) {
    Map<YovayshySphere, Integer> score = [:]
    YovayshySphere.each {score.put(it, 0)}

    YovayshyTest test = process.yovayshyTest
    test.processedQuestions.each {
      YovayshyAnswer answer = YovayshyTest.getAnswerById(it.answer)
      Integer scoreA = score.get(it.question.keyOnA) + answer.scoreA
      score.put(it.question.keyOnA, scoreA)

      Integer scoreB = score.get(it.question.keyOnB) + answer.scoreB
      score.put(it.question.keyOnB, scoreB)
    }

    def yovayshyResult = new YovayshyResult(proffecionalSphere:test.proffecionalSphere
                                            ,proffecionalIntrests:test.proffecionalIntrests)
                                          .save();

    score.entrySet().each {new SphereResult(sphere:it.key, score:it.value, yovayshyResult:yovayshyResult).save()}
    return yovayshyResult;
  }
}