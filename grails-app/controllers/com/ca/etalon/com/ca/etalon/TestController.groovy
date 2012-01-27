package com.ca.etalon.com.ca.etalon

import com.ca.etalon.School
import com.ca.etalon.tests.TestService
import com.ca.etalon.test.motivation.MotivationTest
import com.ca.etalon.tests.holland.HollandQuestion
import com.ca.etalon.test.holland.HollandVector
import com.ca.etalon.tests.TestFactoryService
import grails.plugin.springcache.annotations.Cacheable

import com.ca.etalon.test.actuality.ActualTest
import com.ca.etalon.test.yovayshy.YovayshyTest
import com.ca.etalon.result.TestResults

import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap

class TestController {

    TestService testService

    TestFactoryService testFactoryService

    def imTestValidator

    def actualTestValidator

    def yovayshyTestValidator

    def lidershipTestValidator

    def motivationTestValidator

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
            results.save()
            session.testId = results.id
            redirect(action: 'interestsMap')
            return
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
        Map<Long, Integer> answers = getAnswerMap(params)

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
            return [actuality: testFactoryService.actualTest, actualityAnswers:testFactoryService.actualityAnswers]
        } else {
            redirect(controller: 'test', action: 'start')
            null
        }
    }

    def submitActuality = {
        def test = testFactoryService.actualTest
        Map<Long, Integer> answers = getAnswerMap(params)

        boolean hasErrors = actualTestValidator.validate(answers, test.questions)
        if (hasErrors) {
            render(view: 'actuality', model: [actuality: test,
                                              hasErrors: hasErrors,
                                              actualityAnswers:testFactoryService.actualityAnswers])
        } else {
            testService.persistActualityTest(session.testId, test)
            redirect(action: 'yovayshy')
        }
    }

    @Cacheable("testPageCache")
    def yovayshy = {
        if (session.testId) {
            return [yovayshyTest: testFactoryService.yovayshyTest, yovayshyAnswers:YovayshyTest.getAnswers()]
        } else {
            flash.message = 'Ви повинні почати тест з початку'
            redirect(controller: 'test', action: 'start')
            null
        }
    }

    def submitYovayshy = {
        def test = testFactoryService.yovayshyTest
        Map<Long, Integer> answers = getAnswerMap(params)

        boolean hasErrors = yovayshyTestValidator.validate(answers, test.processedQuestions)
        if (hasErrors) {
            render(view: 'yovayshy', model: [yovayshyTest: test,
                                             hasErrors: hasErrors,
                                             yovayshyAnswers:YovayshyTest.getAnswers()])
        } else {
            testService.persistYovayshy(session.testId, test)
            redirect(action: 'result')
        }
    }

    def result = {
        session.passMain = false
    }

    @Cacheable("testPageCache")
    def lidership = {
        return [lidership: testFactoryService.lidershipTest]
    }

    def submitLidership = {
        def test = testFactoryService.lidershipTest
        Map<Long, Integer> answers = getAnswerMap(params)

        boolean hasErrors = lidershipTestValidator.validate(answers, test.lidersiprocessQuestions)

        if (hasErrors) {
            render(view: 'lidership', model: [lidership: test, hasErrors: hasErrors])
        } else {
            testService.persistLidershipTest(session.testId, test)
            redirect(action: 'motivation')
        }
    }

    @Cacheable("testPageCache")
    def motivation = {
        return [motivation: testFactoryService.motivationTest, motivationAnswers: testFactoryService.motivationAnswers]
    }

    def submitMotivation = {
        MotivationTest test = testFactoryService.motivationTest
        Map<Long, Integer> answers = getAnswerMap(params)
        boolean hasErrors = motivationTestValidator.validate(answers, test.motivationProcessedQuestions)
        test.speciality = params.speciality

        if (hasErrors) {
            render(view: 'motivation', model: [motivation: test
                                                , hasErrors: hasErrors
                                                , motivationAnswers: testFactoryService.motivationAnswers])
        } else {
            testService.persistMotivationTest(session.testId, test)
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
                hollandQuestions << HollandQuestion.findById(i)
            }
        }

        testService.persistHollandTests(session.testId, hollandQuestions)
        redirect(action: 'result')
    }

    private Map<Long, Integer> getAnswerMap(GrailsParameterMap params) {
        Map<Long, Integer> answers = [:]
        params.each {
            if (it.key.toString().startsWith('answer')) {
                answers.put(Long.valueOf(it.key.toString().substring(6)), it.value != null ? Integer.valueOf(it.value) : null);

            }
        }
        return answers
    }


}
