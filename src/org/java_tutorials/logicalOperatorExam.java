package org.java_tutorials;

public class logicalOperatorExam{
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		//�� �Ʒ� ���� �����ϼ���.
		if( age>=20 ) {
			isTwenties = true;
		}
		else{
			isTwenties = false;
		}
    
    return isTwenties;//��� �׽�Ʈ�� ���� �ڵ��Դϴ�.
	}

	//�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	public static void main(String[] args){
		logicalOperatorExam exam = new logicalOperatorExam();
		exam.isAgeTwenties(19);
		exam.isAgeTwenties(25);
	}
}
