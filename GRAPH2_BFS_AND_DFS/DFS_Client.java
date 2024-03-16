package GRAPH2_BFS_AND_DFS;

public class DFS_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS g = new DFS(9);
		g.AddEdge(1, 2, 5);
		g.AddEdge(1, 4, 7);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Display();
		System.out.println(g.DFS(1, 6));
		g.DFT();
	}

}
