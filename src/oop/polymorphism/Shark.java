package oop.polymorphism;

public class Shark implements Animal {

	@Override
	public void speak() {
		System.out.println("Glup glup");
	}

	@Override
	public void eat() {
		System.out.println("I eat everything");
	}

	@Override
	public boolean isTame() {
		return false;
	}

	@Override
	public void sleep(int hours) {
		System.out.println("I do not sleep");
	}

}
