package com.ca.etalon.validator

import com.ca.etalon.test.lidership.LidersiProcessQuestion

/**
 * User: Grygoriy Mykhalyunyo
 * Date: 9/5/11
 * Time: 7:05 AM
 */
class LidershipTestValidator {

    boolean validate(Map<Long, Integer> answers, List<LidersiProcessQuestion> questions) {
        boolean hasErrors = false
        questions.each {item ->
            def answer = answers[item.question.id]
            if (answer < 1 || answer > 2) {
                item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
                hasErrors = true;
            }
            item.answer = answer
        }

        return hasErrors
    }

}
