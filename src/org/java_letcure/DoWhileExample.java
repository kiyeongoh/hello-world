package org.java_letcure;
import java.util.Scanner;
public class DoWhileExample {
	public static void main(String[] args){
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ���  q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inputstring;
		
		do{
			System.out.println(">");
			
			inputstring = scanner.nextLine();
			System.out.println(inputstring);
		}while(!inputstring.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
		
		}

}
