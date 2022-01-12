package oop.exceptions;

public class DeviceOverException extends Exception {

	private final Device device;
	
	public DeviceOverException(final Device device) {
		this.device = device;
	}
	
	public Device getDevice() {
		return this.device;
	}
	
}
