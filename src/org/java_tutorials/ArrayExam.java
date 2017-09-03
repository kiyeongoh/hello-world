package org.java_tutorials;

public class ArrayExam {
	public static void main(String[] args){
		int[] array1  = new int[100];
		
		array1[0] = 50;
		array1[10] = 100;
		
		int value = array1[10];
		
		System.out.println(value);
		
		int[] array2 = new int[]{1,2,3,4};
		
		int[] array3 = {1,2,3,4};
		
		System.out.println(array3[3]);
	}

}
