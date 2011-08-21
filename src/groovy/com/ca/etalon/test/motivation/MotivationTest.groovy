package com.ca.etalon.test.motivation

import com.ca.etalon.test.IdLabel

/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Oct 4, 2009
 * Time: 9:40:41 PM
 * To change this template use File | Settings | File Templates.
 */

public class MotivationTest {
  List<MotivationProcessedQuestion> motivationProcessedQuestions
  Integer answer
  String speciality = ""

  static List<IdLabel> getAnswers() {
      [
        new IdLabel(id:5, answer:"дуже сильно вплинуло"),
        new IdLabel(id:4, answer:"сильно"),
        new IdLabel(id:3, answer:"середньо"),
        new IdLabel(id:2, answer:"слабо"),
        new IdLabel(id:1, answer:"ніяк  не вплинуло")
    ]
  }

  public boolean processErrors(String[] answers) {
    boolean hasErrors = false
    def i = 0
    motivationProcessedQuestions.each { MotivationProcessedQuestion item ->
      if ("" == answers[i].trim()) {
        hasErrors = true
        item.errorMessage = "Будь ласка вибереріть відповіть зі списку"
      } else if (!(Integer.valueOf(answers[i]) > 0 && Integer.valueOf(answers[i]) <= 5)) {
        item.errorMessage = "Будь ласка вибереріть відповіть зі списку"
        item.answer = Integer.valueOf(answers[i])
        hasErrors = true;
      } else {
        item.errorMessage = ""
        item.answer = Integer.valueOf(answers[i])
      }
      i++
    }
    return hasErrors

  }
}