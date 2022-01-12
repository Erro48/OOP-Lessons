package oop.exceptions;

public class UseDeviceRow {

	public static void main(String[] args) {
		DeviceRow dr = new DeviceRow();

		dr.addDevice(new CountDownDevice(5));
		dr.addDevice(new CountDownDevice(10));
		dr.addDevice(new CountDownDevice(2));
		dr.addDevice(new CountDownDevice(0));

		dr.switchAllDevices(true);
		dr.switchAllDevices(false);
		dr.switchAllDevices(true);
		dr.switchAllDevices(false);
		dr.switchAllDevices(true);
		dr.switchAllDevices(false);
		dr.switchAllDevices(true);

		System.out.println(dr);
	}

}
