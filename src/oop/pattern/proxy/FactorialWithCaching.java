package oop.pattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class FactorialWithCaching implements Factorial {
	
	private final Factorial base = new FactorialImpl();
	private final Map<Integer,Integer> map = new HashMap<>();

	@Override
	public int factorial(int i) {
		return this.map.computeIfAbsent(i, base::factorial);
	}

}
