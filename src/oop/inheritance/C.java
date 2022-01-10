package oop.inheritance;

public class C {
	protected int i;
	
	void m() {
		System.out.println("C.m ... prima " + i);
		this.i++;
		System.out.println("C.m ... dopo " + i);
	}
}

class D extends C {
	
	public D(int i) {
		this.i = i;
	}
	
	void m() {
		super.m();
		System.out.println("D.m ... dopo " + this.i);
	}
}