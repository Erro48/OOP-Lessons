package oop.inheritance;

public class A {
	protected int i;
	
	public A(int i) {
		System.out.println("A() ... prima " + this.i);
		this.i = i;
		System.out.println("A() ... dopo " + this.i);
	}
}

class B extends A {
	protected String s;
	
	public B(String s, int i) {
		super(i);
		System.out.println("B() ... prima " + this.s + " " + this.i);
		this.s = s;
		System.out.println("B() ... dopo " + this.s + " " + this.i);
	}
}
