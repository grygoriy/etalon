package com.ca.etalon.validator

import com.ca.etalon.test.actuality.ActualProcessedQuestion
import com.ca.etalon.test.yovayshy.YovayshyProcessedQuestion

/**
 * User: Grygoriy Mykhalyunyo
 * Date: 9/5/11
 * Time: 7:05 AM
 */
class YovayshyTestValidator {

    boolean validate(Map<Long, Integer> answers, List<YovayshyProcessedQuestion> questions) {
        boolean hasErrors = false
        questions.each {item ->
            def answer = answers[item.question.id]
            if (answer < 0 || answer > 4) {
                item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
                hasErrors = true;
            }
            item.answer = answer
        }

        return hasErrors
    }

}
