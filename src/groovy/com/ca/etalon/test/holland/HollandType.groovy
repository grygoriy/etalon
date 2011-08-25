package com.ca.etalon.test.holland

/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Nov 6, 2009
 * Time: 11:29:04 PM
 */
public enum HollandType {
  Realistic('Реалістичний тип'),
  Artistic('Артистичний  тип'),
  Investication('Дослідницький тип'),
  Social('Соціальний  тип'),
  Comerce('Підприємницький'),
  Conventional('Конвенціональний')

  String message

  def HollandType(message) {
    this.message = message;
  }
}