package org.java_inter;

public interface RemoteControl {
	public int MAX_VOLUMN = 10;
	public int MIN_VOLUMN = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int  volume);
	
	default void setMute(boolean mute){
		if(mute){
			System.out.println("���� ó���մϴ�");
		}else{
			System.out.println("���������մϴ�");
		}
	}

	
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�");
	}
}
