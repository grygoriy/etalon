package com.ca.etalon.test.yovayshy
/**
 * Created by IntelliJ IDEA.
 * User: grygoriy
 * Date: Oct 5, 2009
 * Time: 11:30:04 AM
 * To change this template use File | Settings | File Templates.
 */

public enum YovayshySphere {
  Art("сфера мистецтва")  ,
  Technical("сфера технічних інтересів"),
  Poepleware("сфера роботи з людьми"),
  Intelligence("сфера розумової праці"),
  Handwork("сфера фізичної праці"),
  Material("сфера матеріальних інтересів")

  String message

  def YovayshySphere(message) {
    this.message = message;
    
  }


}