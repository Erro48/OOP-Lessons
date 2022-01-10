package oop.polymorphism;

public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Bark!!");
	}

	@Override
	public void eat() {
		System.out.println("I eat dog's food");
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
