package org.java.api;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String ssn = "010624-1230123";
	 
	 char sex = ssn.charAt(7);
	 
	 switch (sex) {
	 case '1':
	    System.out.println("�����Դϴ�");
	    break;
	 case '3':
	    System.out.println("�����Դϴ�");
	    break;
	 case '2':
	 case '4':
	    System.out.println("�����Դϴ�");
	    break;
	 }

	}

}
