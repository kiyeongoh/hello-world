package org.java.api;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
      
      String[] names = text.split("&|,|-");
      
      for(String name:names){
    	  System.out.println(name);
      }
      		
	}

}
