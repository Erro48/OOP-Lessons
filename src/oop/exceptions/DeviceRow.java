package oop.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceRow {
	
	private List<Device> devices;
	
	public DeviceRow() {
		this.devices = new ArrayList<>();
	}
	
	public DeviceRow(final int size) {
		this.devices = new ArrayList<>(size);
	}
	
	public void addDevice(final Device device) {
		if (device == null) {
			throw new NullPointerException();
		}
		
		this.devices.add(device);
	}
	
	public void switchAllDevices(final boolean switchOn) {
		for (Device device : this.devices) {
			if (switchOn) {
				try {
					device.switchOn();
				} catch (DeviceOverException e) {
					System.err.println(e.getDevice() + " is over");
				}
			} else {
				device.switchOff();
			}
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		for (Device device : this.devices) {
			str += device.isOver() + " | ";
		}
		return str;
	}
	
}
