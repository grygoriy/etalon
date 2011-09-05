package com.ca.etalon.validator

import com.ca.etalon.test.interestmap.IMProcessedQuestion

/**
 * User: Grygoriy Mykhalyunyo
 * Date: 9/4/11
 * Time: 11:54 PM
 */
class IMTestValidator {

    def validate(Map<Long, Integer> answers, List<IMProcessedQuestion> processedQuestions) {
        boolean hasErrors = false
        processedQuestions.each { IMProcessedQuestion item ->
            def answer = answers[item.question.id]
            item.answer = answer
            if (!(answer >= -2 && answer <= 2)) {
                item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
                hasErrors = true;
            }
        }
        return hasErrors
    }
}
