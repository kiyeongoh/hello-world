package org.java_inter;

public class Television implements RemoteControl {
	
	private int volume;

	public void turnOn(){
		System.out.println("TV를 켭니다");
	}
	
	public void turnOff(){
		System.out.println("TV 를 끕니다");
	}
	
	public void setVolume(int volume){
		if(volume>RemoteControl.MAX_VOLUMN){
			this.volume = RemoteControl.MAX_VOLUMN;
		}else if(volume<RemoteControl.MIN_VOLUMN){
			this.volume = RemoteControl.MIN_VOLUMN;
		}else{
			this.volume = volume;
		}
		
	System.out.println("현재 TV 볼류:" + volume);
}  
}