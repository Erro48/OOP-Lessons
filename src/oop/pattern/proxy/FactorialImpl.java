package oop.pattern.proxy;

public class FactorialImpl implements Factorial{

	@Override
	public int factorial(int i) {
		return i == 0 ? 1 : i * factorial(i-1);
	}

}
