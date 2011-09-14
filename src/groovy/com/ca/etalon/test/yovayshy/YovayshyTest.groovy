package com.ca.etalon.test.yovayshy

/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Sep 6, 2009
 * Time: 7:36:01 PM
 * To change this template use File | Settings | File Templates.
 */

class YovayshyTest {
  List<YovayshyProcessedQuestion> processedQuestions
  String proffecionalSphere
  String proffecionalIntrests

  private static Map<Integer, YovayshyAnswer> getYovayshyAnswerMap() {
    Map<Integer, YovayshyAnswer> result = new HashMap<Integer,YovayshyAnswer>(4)
    result.put(1, new YovayshyAnswer(id:1, label:'А', scoreA:3, scoreB:0));
    result.put(2, new YovayshyAnswer(id:2, label:'Б', scoreA:0, scoreB:3));
    result.put(3, new YovayshyAnswer(id:3, label:'Більш А ніж Б', scoreA:2, scoreB:1));
    result.put(4, new YovayshyAnswer(id:4, label:'Більш Б ніж А', scoreA:1, scoreB:2));

    return result

  }

  @SuppressWarnings('ExplicitHashSetInstantiation')
  static List<YovayshyAnswer> getAnswers() {
    yovayshyAnswerMap.entrySet()*.value
  }

  static YovayshyAnswer getAnswerById(Integer id) {
    return yovayshyAnswerMap.get(id)
  }
}