package org.java.api;

public class ObjectExample {
	public static void main(String[] args){
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		
		System.out.println(result);
		
		boolean result1  = (obj1 == obj2);
		System.out.println(result1);
	}

}
