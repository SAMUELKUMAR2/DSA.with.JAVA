package GRAPH;

public class Grap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.AddEdge(1, 2, 5);
		g.AddEdge(1, 4, 7);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Display();
		
		System.out.println("...Checking edges");
		System.out.println(g.containEdge(2, 3));
		System.out.println(g.containEdge(3, 2));
		System.out.println(g.containEdge(2, 5));
		
		System.out.println("...Checking vertex");
		System.out.println(g.containVertex(4));
		System.out.println(g.containVertex(8));
		
		g.noOfEdges();
		
		g.removeEdge(2, 3);
		System.out.println("..After removing vertex");
		g.removeVertex(6);
		g.Display();
		g.Display();
	}

}
