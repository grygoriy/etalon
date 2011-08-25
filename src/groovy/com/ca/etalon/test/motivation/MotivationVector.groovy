package com.ca.etalon.test.motivation
/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Oct 4, 2009
 * Time: 9:23:56 PM
 * To change this template use File | Settings | File Templates.
 */

public enum MotivationVector {
  InternalIndividual ('внутрішні індивідуально значимі мотиви'),
  InternalSocial('внутрішні соціально значимі  мотиви'),
  ExternalPositive('зовнішні позитивні мотиви'),
  ExternalNegative('зовнішні негативні мотиви')

  String message;

  def MotivationVector(message) {
    this.message = message;
  }
}