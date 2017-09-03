package org.java_letcure;

public class Exercise04 {
	public static void main(String[] args){
	  while(true){
		int num1 =(int)(Math.random()*6 + 1);
		int num2 =(int)(Math.random()*6 + 1);
		
		int num3 = num1 + num2;
		
		System.out.println("("+num1 + ","  + num2 + ")");
		
		if (num3 == 5){
			break;
		}
		
	}
	}
}
