package org.java_tutorials;

public class OverflowExample {
 public static void main(String[] args){
	 int x = 1000000;
	 int y = 1000000;
	 long z = (long)x * y;
	 
	 System.out.println(z);
	 
 }
}
