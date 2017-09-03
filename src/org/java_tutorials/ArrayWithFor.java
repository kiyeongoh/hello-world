package org.java_tutorials;

public class ArrayWithFor {
	public static void main(String[] args){
		int[] iarray = new int[100];
		int total = 0;
		
		iarray[0] = 1;
		iarray[1] = 2;
		
		System.out.println(iarray.length);
		
		for(int i=0;i<iarray.length;i++){
			iarray[i] = i + 1;
		}
		
		for (int i = 0;i < iarray.length; i++){
			total = total + iarray[i];
		}
		
		System.out.println(total);
	}

}
