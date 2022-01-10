package oop.polymorphism;

public class Bird implements Animal {

	@Override
	public void speak() {
		System.out.println("Cip Cip");
	}

	@Override
	public void eat() {
		System.out.println("I eat bird's food");
	}

	@Override
	public boolean isTame() {
		return true;
	}

	@Override
	public void sleep(final int hours) {
		System.out.println("I sleep for " + hours + " hour(s)");
	}

}
