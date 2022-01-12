package oop.exceptions;

public class CountDownDevice extends AbstractDevice {

	private int remainUses;
	
	public CountDownDevice(final int uses) {
		this.remainUses = uses;
	}
	
	@Override
	protected boolean onFails() {
		this.remainUses--;
		return this.remainUses <= 0;
	}

}
