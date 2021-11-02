package oop.classe.gencollection11;

public class Edge<N> {
	
	private final N source;
	private final N target;
	
	public Edge(final N source, final N target) {
		this.source = source;
		this.target = target;
	}

	public N getSource() {
		return this.source;
	}

	public N getTarget() {
		return this.target;
	}
	
}
