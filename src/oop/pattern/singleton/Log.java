package oop.pattern.singleton;

public class Log {
	
	private static final Log LOG = new Log();
	
	private Log() {}
	
	public static Log getLog() {
		return LOG;
	}
	
	public void add(final String message) {
		System.err.println(message);
	}
}
