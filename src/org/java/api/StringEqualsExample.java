package org.java.api;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2){
			System.out.println("���� ��ü ����");
		}else{
			System.out.println("�ٸ� ��ü ����");
		}
		
		if(strVar1.equals(strVar2)){
			System.out.println("���� ���ڿ� ����");
		}else{
			System.out.println("�ٸ� ���ڿ� ����");
		}

	}

}
