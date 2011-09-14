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

import com.ca.etalon.test.yovayshy.YovayshyAnswer
import com.ca.etalon.test.yovayshy.YovayshySphere
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.tests.interestmap.JobName
import com.ca.etalon.util.TestProcess
import static com.ca.etalon.test.motivation.MotivationVector.InternalIndividual
import static com.ca.etalon.test.motivation.MotivationVector.InternalSocial
import static com.ca.etalon.test.motivation.MotivationVector.ExternalNegative
import static com.ca.etalon.test.motivation.MotivationVector.ExternalPositive
import com.ca.etalon.test.interestmap.IMProcessedQuestion
import org.apache.commons.logging.LogFactory
import junit.framework.TestResult

class TestService {
  static profiled = true
  static scope = 'prototype'

  boolean transactional = true
    private static final log = LogFactory.getLog(this)

    synchronized void persistMotivationTest(Long id, MotivationTest testProcess) {
        getMotivationResult(id, testProcess)
    }

    synchronized void persistLidershipTest(Long id, LidershipTest test) {
        def lidershipResult = getLidershipResult(test)
        log.debug("testid: $id lidershipResult $lidershipResult")
        TestResults.executeUpdate("update TestResults set lidershipResult = :results where id = :id",
                [results: lidershipResult, id: id])
    }

    synchronized void persistHollandTests(Long id, List<HollandQuestion> questions) {
      getHollandResult(id, questions)
    }

    synchronized def persistIM(Long id, List<IMProcessedQuestion> questions) {
        getIMResults(questions, id)
    }

    def synchronized persistActualityTest(Long id, ActualTest actualTest) {
        def result = getActualityResult(id, actualTest)
        log.debug("testid: $id ActualityResult $result")
        TestResults.executeUpdate("update TestResults set actualityResults = :results where id = :id",
                [results: result, id: id])
    }

    synchronized def persistYovayshy(Long id, YovayshyTest process) {
        def result = getYovayshyResult(process)
        log.debug("testid: $id YovayshyResult $result")
        TestResults.executeUpdate("update TestResults set yovayshyResult = :results where id = :id",
                [results: result, id: id])
    }


    private synchronized Integer getActualityResult(Long id, ActualTest actualTest) {
      def result = 0;
      def ceil = actualTest.questions.size()
      actualTest.questions.each {
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
    *           <li>2    -> 3</li>
    *           <li>3 -> 2</li>
    *           <li>4 -> 1</li>
    *         </ul>
    *
    */
    private Integer revertAnswer(Integer answer, Integer ceil) {
      return ceil - (answer-1)
    }

    private synchronized void getIMResults(List<IMProcessedQuestion> processedQuestions, Long id) {
      def imResults = new HashSet()
      def jobNames = JobName.list()
      jobNames.each {jobName ->
        IMResult imResult = getResultsForCategory(jobName, processedQuestions)
        if (imResult.result != 0) {
          imResult.testResultsId = id
          imResults << imResult.save()
        }
      }

    }

  private synchronized IMResult getResultsForCategory(JobName jobName, List<IMProcessedQuestion> processedQuestions) {
    def byCategories = processedQuestions.findAll { it.question.category.id == jobName.id }
    //todo : try to change it to amount = byCategories.*answer.sum()
    int amount = 0
    byCategories.each {item ->
      amount += item.answer
    }
    
    return new IMResult(category: jobName, result: amount)
  }

  private synchronized LidershipResult getLidershipResult(LidershipTest lidershipTest) {
    Integer score = 0;

    //todo : try to change it to collection summ
    lidershipTest.lidersiprocessQuestions.each {question ->
      if (question.answer == question.question.keyCase) {
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

  private synchronized MotivationResult getMotivationResult(Long id, MotivationTest motivationTest) {
    List<VectorResult> vectorResults = getVectorResult(motivationTest)
    MotivationResult motivationResult = new MotivationResult(speciality:motivationTest.speciality
                                                           , vectorResults:vectorResults
                                                           , testResultsId: id).save()
    return motivationResult
  }


  @SuppressWarnings('ExplicitHashSetInstantiation')
  private synchronized void getHollandResult(Long id, List<HollandQuestion> hollandQuestions) {
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
    result.entrySet().each {
            new HollandResult(type:it.key,score:it.value, testResultsId: id).save()
    }
  }

  private synchronized List<VectorResult> getVectorResult(MotivationTest motivationTest) {
    Integer internalIndividual = 0;
    Integer internalSocial = 0;
    Integer externalNegative = 0;
    Integer externalPositive = 0;

    motivationTest.motivationProcessedQuestions.each  {
      switch (it.question.motivationVector) {
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

  private synchronized YovayshyResult getYovayshyResult(YovayshyTest test) {
    Map<YovayshySphere, Integer> score = [:]
    YovayshySphere.each {score.put(it, 0)}

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