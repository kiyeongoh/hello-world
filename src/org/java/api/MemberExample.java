package org.java.api;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Member original = new Member("blue","홍길동","12345",25,true);
      
      Member cloned = original.getMember();
      cloned.password = "67890";
      
      System.out.println("복제 객체의 필드값");
      
      System.out.println("ID : " + cloned.id);
      System.out.println("Name : " + cloned.name);
      System.out.println("password : " + cloned.password);
      System.out.println("age : " + cloned.age);
      System.out.println("adult : " + cloned.adult);
      
      System.out.println();
      
      System.out.println("원복 객체의 필드값");
      System.out.println("ID : " + original.id);
      System.out.println("Name : " + original.name);
      System.out.println("password : " + original.password);
      System.out.println("age : " + original.age);
      System.out.println("adult : " + original.adult);
}
}
