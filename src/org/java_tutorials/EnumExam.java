package org.java_tutorials;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args){
	  String gender1;
	  gender1 = EnumExam.MALE;
	  gender1 = EnumExam.FEMALE;
	  
	  gender1 = "boy";
	  
	  Gender gender2 ;
	  gender2 = Gender.MALE;
	  gender2 = Gender.FEMALE;

	  
	  System.out.println(gender1);
	}

}

enum Gender{
	MALE,FEMALE;
}
