package org.java_inter;

public interface RemoteControl {
	public int MAX_VOLUMN = 10;
	public int MIN_VOLUMN = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int  volume);
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리합니다");
		}else{
			System.out.println("무음해제합니다");
		}
	}

	
	static void changeBattery(){
		System.out.println("건전지를 교환합니다");
	}
}
