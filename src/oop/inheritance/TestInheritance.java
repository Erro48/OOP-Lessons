package oop.inheritance;

public class TestInheritance {
	
	public static void main(String[] args) {
		B b = new B("prova", 5);
		/* Expected result
		 * 
		 * A() ... prima 0
		 * A() ... dopo 5
		 * B() ... prima null 5
		 * B() ... prima prova 5
		 * 
		 * */
		
		new D(5).m();
		/* Expected result
		 * 
		 * C.m() ... prima 5
		 * C.m() ... dopo 6
		 * D.m() ... dopo 6
		 * */
		
		F f = new F();
		f.i = 10;
		f.m();
		System.out.println("" + f.i);	// 21
	}
}
