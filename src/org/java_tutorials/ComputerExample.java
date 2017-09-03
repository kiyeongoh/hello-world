package org.java_tutorials;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator1 calculator = new Calculator1();
		System.out.println("원면적 :" + calculator.areaCircle(r));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적 :" + computer.areaCircle(r)); 
	}

}
