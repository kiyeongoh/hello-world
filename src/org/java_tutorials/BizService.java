package org.java_tutorials;

public class BizService {
 public void bizMethod(int i) throws BizException{
	 System.out.println("����Ͻ� �޼ҵ� ����");

	if(i<0)
		throw new BizException("�Ż�����");
	 System.out.println("����Ͻ� �޼ҵ� ����");
 }
}
