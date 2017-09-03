package org.java_tutorials;

public class ExceptionExam3 {
	public static void main(String[] args){
		int i = 0;
		int j = 0;
		try{
		int k = divide(i,j);
		System.out.println(k);
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
	
	public static int divide(int i,int j) throws IllegalArgumentException{
		if(j == 0){
		 throw new IllegalArgumentException("0À¸·Î");
		}
		int k = i / j;
		return k;
	}

}
