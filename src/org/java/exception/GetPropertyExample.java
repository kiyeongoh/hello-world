package org.java.exception;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String osName = System.getProperty("os.name");
	    String userName = System.getProperty("user.name");
	    String userHome = System.getProperty("user.home");

	    
	    System.out.println("�ü�� �̸� :" + osName);
	    System.out.println("����� �̸� :" + userName);
	    System.out.println("����� Ȩ ���丮 :" + userHome);
	    
	}

}
