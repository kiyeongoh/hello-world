package org.java_inter;

public class Television implements RemoteControl {
	
	private int volume;

	public void turnOn(){
		System.out.println("TV�� �մϴ�");
	}
	
	public void turnOff(){
		System.out.println("TV �� ���ϴ�");
	}
	
	public void setVolume(int volume){
		if(volume>RemoteControl.MAX_VOLUMN){
			this.volume = RemoteControl.MAX_VOLUMN;
		}else if(volume<RemoteControl.MIN_VOLUMN){
			this.volume = RemoteControl.MIN_VOLUMN;
		}else{
			this.volume = volume;
		}
		
	System.out.println("���� TV ����:" + volume);
}  
}