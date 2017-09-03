package org.java_inter;

public class Car {
  Tire frontLeftTire = new HankooTire();
  Tire frontRightTire = new HankooTire();
  Tire backLeftTire = new HankooTire();
  Tire backRightTire = new HankooTire();
  
  void run(){
	  frontLeftTire.roll();
  }
}
