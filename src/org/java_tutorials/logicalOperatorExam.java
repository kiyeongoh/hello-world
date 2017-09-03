package org.java_tutorials;

public class logicalOperatorExam{
	public boolean isAgeTwenties(int age){
		boolean isTwenties = false;
		//이 아래 줄을 수정하세요.
		if( age>=20 ) {
			isTwenties = true;
		}
		else{
			isTwenties = false;
		}
    
    return isTwenties;//결과 테스트를 위한 코드입니다.
	}

	//아래는 실행을 위한 코드입니다. 수정하지 마세요.
	public static void main(String[] args){
		logicalOperatorExam exam = new logicalOperatorExam();
		exam.isAgeTwenties(19);
		exam.isAgeTwenties(25);
	}
}
