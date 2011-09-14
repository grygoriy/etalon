package com.ca.etalon.validator

import com.ca.etalon.test.motivation.MotivationProcessedQuestion

/**
 * User: Grygoriy Mykhalyunyo
 * Date: 9/5/11
 * Time: 7:05 AM
 */
class MotivationTestValidator {

    boolean validate(Map<Long, Integer> answers, List<MotivationProcessedQuestion> questions) {
        boolean hasErrors = false
        questions.each {item ->
            def answer = answers[item.question.id]
            if (answer < 0 || answer > 5) {
                item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
                hasErrors = true;
            }
            item.answer = answer
        }

        return hasErrors
    }

}
