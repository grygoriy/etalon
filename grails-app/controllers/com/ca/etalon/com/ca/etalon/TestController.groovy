package com.ca.etalon.com.ca.etalon

import com.ca.etalon.School
import com.ca.etalon.tests.TestService
import com.ca.etalon.util.TestProcess
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.test.holland.HollandVector
import com.ca.etalon.tests.TestFactoryService
import grails.plugin.springcache.annotations.Cacheable
import com.ca.etalon.test.interestmap.IMTest
import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.result.TestResults
import com.ca.etalon.validator.IMTestValidator

class TestController {

    TestService testService

    TestFactoryService testFactoryService

    def imTestValidator

    def defaultAction = 'start'

    @Cacheable("testPageCache")
    def start = {
        String name = '';
        return [student: name]
    }

    def submitInitials = {
        TestResults results = new TestResults()

        results.studentName = params.student
        def school = School.findById(params.schoolId)
        if (school != null) {
            results.school = school
            redirect(action: 'interestsMap')
            results.save()
            session.testId = results.id
        } else {
            flash.message = 'Виберіть школу'
            render(view: 'start', model: [name: params.student])
        }
    }

    @Cacheable("testPageCache")
    def interestsMap = {
        if (session.testId) {
            return [imTest: testFactoryService.getIMTest(), imanswer:testFactoryService.IMAnswers]
        } else {
            flash.message = 'Ви повинні почати тест з початку'
            redirect(controller: 'test', action: 'start')
            null
        }
    }

    def sumbitInterestMap = {
        def processed = testFactoryService.IMTest
        Map<Long, Integer> answers = [:]
        params.each {
            if (it.key.toString().startsWith('answer')) {
                answers.put(Long.valueOf(it.key.toString().substring(6)), it.value != null ? Integer.valueOf(it.value) : null );

            }
        }

         boolean hasErrors = imTestValidator.validate(answers, processed.processedQuestions)
        if (hasErrors) {
            render(view: 'interestsMap', model: [imTest: processed,
                                                 hasErrors: hasErrors,
                                                 imanswer:testFactoryService.IMAnswers])
        } else {
            testService.persistIM(session.testId, processed.processedQuestions)
            redirect(action: 'actuality')
        }
    }

    @Cacheable("testPageCache")
    def actuality = {
        if (session.testId) {
            return [actuality: testFactoryService.actualTest, actualityAnswers:ActualTest.getActualityAnswers()]
        } else {
            redirect(controller: 'test', action: 'start')
            null
        }
    }

    def submitActuality = {
        def process = testFactoryService.actualTest
        boolean hasErrors = testProcess.actualTest.processErrors(params.answer)
        if (hasErrors) {
            render(view: 'actuality', model: [actuality: session.test.actualTest,
                                              hasErrors: hasErrors,
                                              actualityAnswers:ActualTest.getActualityAnswers()])
        } else {
            testService.persistActualityTest(testProcess)
            testProcess.actualTest = null
            redirect(action: 'yovayshy')
        }
    }

    @Cacheable("testPageCache")
    def yovayshy = {
        if (session.test) {
            session.test.yovayshyTest = testFactoryService.yovayshyTest
            return [yovayshyTest: session.test.yovayshyTest, yovayshyAnswers:YovayshyTest.getAnswers()]
        } else {
            flash.message = 'Ви повинні почати тест з початку'
            redirect(controller: 'test', action: 'start')
            null
        }
    }

    def submitYovayshy = {
        TestProcess testProcess = session.test
        boolean hasErrors = testProcess.yovayshyTest.processErrors(params.answer)
        if (hasErrors) {
            render(view: 'yovayshy', model: [yovayshyTest: session.test.yovayshyTest,
                                             hasErrors: hasErrors,
                                             yovayshyAnswers:YovayshyTest.getAnswers()])
        } else {
            testService.persistYovayshy(testProcess)
            testProcess.yovayshyTest = null
            redirect(action: 'result')
        }
    }

    def result = {
        session.passMain = false
    }

    @Cacheable("testPageCache")
    def lidership = {
        session.test.lidershipTest = testFactoryService.lidershipTest
        return [lidership: session.test.lidershipTest]
    }

    def submitLidership = {
        TestProcess testProcess = session.test
        boolean hasErrors = false
        testProcess.lidershipTest.lidersiprocessQuestions.each {processedQuestion ->
            String answer = (String) params['answer' + processedQuestion.lidershipQuestion.id]
            if (answer != null && ['1', '2'].any {it == answer}) {
                processedQuestion.answer = Integer.valueOf(answer)
                processedQuestion.errorMessage = ''
            } else {
                processedQuestion.errorMessage = 'Вкажіть будь-ласа відповідь'
                hasErrors = true;
            }
        }

        if (hasErrors) {
            render(view: 'lidership', model: [lidership: testProcess.lidershipTest, hasErrors: hasErrors])
        } else {
            testService.persistLidershipTest(testProcess)
            session.test.lidershipTest = null;
            redirect(action: 'motivation')
        }
    }

    @Cacheable("testPageCache")
    def motivation = {
        session.test.motivationTest = testFactoryService.motivationTest
        return [motivation: session.test.motivationTest]
    }

    def submitMotivation = {
        TestProcess testProcess = session.test
        MotivationTest motivationTest = testProcess.motivationTest
        boolean hasErrors = testProcess.motivationTest.processErrors(params.answer)
        motivationTest.speciality = params.speciality

        if (hasErrors) {
            render(view: 'motivation', model: [motivation: motivationTest, hasErrors: hasErrors])
        } else {
            testService.persistMotivationTest(testProcess)
            session.test.motivationTest = null
            redirect(action: 'holland')
        }
    }

    @Cacheable("testPageCache")
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

        return [iLikeIt: iLikeIt, iCanDoIt: iCanDoItt, proffetion: proffetion]
    }

    def submitHolland = {
        Integer idMax = HollandQuestion.count();
        List<HollandQuestion> hollandQuestions = []
        for (int i = 0; i <= idMax; i++) {
            String value = (String) params["question$i"]
            if (value != null && value == 'on') {
                HollandQuestion question = HollandQuestion.findById(i)
                hollandQuestions.add(question)
            }
        }
        TestProcess testProcess = session.test
        testProcess.hollandQuestions = hollandQuestions

        testService.persistHollandTests(testProcess)
        session.test = null
        redirect(action: 'result')
    }

}
