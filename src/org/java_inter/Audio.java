package org.java_inter;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
	  System.out.println("Audio �� �մϴ�");
	}

	@Override
	public void turnOff() {
		  System.out.println("Audio �� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
	 if(volume>RemoteControl.MAX_VOLUMN){
		 this.volume = RemoteControl.MAX_VOLUMN;
	 }else if(volume<RemoteControl.MIN_VOLUMN){
		 this.volume = RemoteControl.MIN_VOLUMN;
	 }else{
		 this.volume = volume;
	 }
     System.out.println("����  Audio ����:" + volume);		
	}

	
}
