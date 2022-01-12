package oop.exceptions;

public abstract class AbstractDevice implements Device {

	private boolean on;
	protected boolean over;
	
	public AbstractDevice() {
		this.on = false;
		this.over = false;
	}
	
	@Override
	public void switchOn() throws DeviceOverException {
		if (!this.on) {
			if (!this.isOver()) {
				this.over = this.onFails();
				this.on = !this.over;
			}
		}
		if (!this.on) {
			throw new DeviceOverException(this);
		}
	}

	@Override
	public void switchOff() {
		this.on = false;
	}

	@Override
	public boolean isSwitchedOn() {
		return this.on;
	}

	@Override
	public boolean isOver() {
		return this.over;
	}

	protected abstract boolean onFails();
	
}
