package org.java_tutorials;

public class ExceptionExam2 {
	public static void main(String[] args){
		int i = 10;
		int j = 0;
		try{
		int k = divide(i,j);
		System.out.println(k);
		}catch(Exception e){
			System.out.println("0으로 나눌수 없습니다" + e.toString());
		}
	}
    public static int divide(int i,int j) throws ArithmeticException{
    	int k = i/j;
    	return k;
    }
}
