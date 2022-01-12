package oop.exceptions;

public interface Device {
	
	public void switchOn() throws DeviceOverException;
	
	public void switchOff();
	
	public boolean isSwitchedOn();
	
	public boolean isOver();
	
}
