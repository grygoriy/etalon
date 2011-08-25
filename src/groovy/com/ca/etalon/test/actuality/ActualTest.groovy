package com.ca.etalon.test.actuality


import com.ca.etalon.test.IdLabel

class ActualTest {

  List<ActualProcessedQuestion> questions;

  boolean processErrors(String[] answers) {
    boolean hasErrors = false
    def i = 0
    questions.each { ActualProcessedQuestion item ->
      if ('' == answers[i]) {
        hasErrors = true
        item.errorMessage = 'Будь ласка вибереріть відповіть зі списку'
      } else if (!(Integer.valueOf(answers[i]) > 0 && Integer.valueOf(answers[i]) <= 4)) {
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

  static List<IdLabel> getActualityAnswers() {
    def answers = []

    answers.add(new IdLabel(id: 1, answer: 'не згідна / не згідний'))
    answers.add(new IdLabel(id: 2, answer: 'частково не згідна / не згідний'))
    answers.add(new IdLabel(id: 3, answer: 'частково  згідна / згідний'))
    answers.add(new IdLabel(id: 4, answer: 'згідна / згідний'))

    return answers
  }
}
