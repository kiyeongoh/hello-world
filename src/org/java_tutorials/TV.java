package org.java_tutorials;

public interface TV {
	public int MIN_VOLUMN = 0;
	public int MAX_VOLUMN = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
