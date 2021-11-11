package oop.exercises.graph;

public class UseGraph {

	public static void main(String[] args) {
		Graph<String> sGraph = new OrientedGraph<>();

		sGraph.addNode("a");
		sGraph.addNode("b");
		sGraph.addNode("c");
		sGraph.addNode("d");
		sGraph.addNode("e");

		sGraph.addEdge("a", "b");
		sGraph.addEdge("b", "c");
		sGraph.addEdge("c", "d");
		sGraph.addEdge("d", "e");
		sGraph.addEdge("c", "a");
		
		System.out.println(sGraph);

		System.out.println(sGraph.nodeSet());
		System.out.println(sGraph.linkedNodes("c"));
		System.out.println(sGraph.getPath("b", "a"));
	}

}
