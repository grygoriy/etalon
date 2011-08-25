package com.ca.etalon.test.interestmap

import com.ca.etalon.test.IdLabel

class IMTest {
  List<IMProcessedQuestion> processedQuestions

  boolean processErrors(String[] answers) {
    boolean hasErrors = false
    def i = 0
    processedQuestions.each { IMProcessedQuestion item ->
      if ('' == answers[i].trim()) {
        hasErrors = true;
        item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
      } else if (!(Integer.valueOf(answers[i]) >= -2 && Integer.valueOf(answers[i]) <= 2)) {
        item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
        item.answer = Integer.valueOf(answers[i])
        hasErrors = true;
      } else {
        item.errorMessage = ''
        item.answer = Integer.valueOf(answers[i])
      }
      i++
    }
    return hasErrors
  }

  static List<IdLabel> getIMAnswers() {
      [
        new IdLabel(id:1, answer:'дуже подобається'),
        new IdLabel(id:2, answer:'подобається'),
        new IdLabel(id:0, answer:'сумніваюсь'),
        new IdLabel(id:-1, answer:'не подобається'),
        new IdLabel(id:-2, answer:'дуже не подобається')
    ]
  }

}
  