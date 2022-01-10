package oop.inheritance;

public class E {
	protected int i;
	
	void m() {
		this.i++;
		System.out.println(this);
		this.n();
	}
	
	void n() {
		this.i = this.i + 10;
	}
	
	public String toString() {
		return "[Classe E] ";
	}
	
}

class F extends E {
	void n() {
		this.i = this.i + 100;
	}
	
	public String toString() {
		return "[Classe F] ";
	}
}