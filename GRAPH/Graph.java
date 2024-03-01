package GRAPH;
import java.util.HashMap;
public class Graph {

	HashMap<Integer,HashMap<Integer,Integer>>map;
	
	//Creating Nodes
	public Graph(int v) {
		this.map = new HashMap<>();
		for(int i = 1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	//connecting edge between 2 node with cost
	
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	//Checking edge
	
	public boolean containEdge(int v1,int v2) {
		return map.get(v1).containsKey(v2) & map.get(v2).containsKey(v1);
		
	}
	
	// Checking Vertex
	
	public boolean containVertex(int v1) {
		return map.containsKey(v1);
	}
	
	// No of Edges
	
	public int noOfEdges() {
		int sum =0;
		for(int key:map.keySet()) {
			
			sum = sum+ map.get(key).size();
		}
		return sum;
	}
	
	// removeEdge
	
	public void removeEdge(int v1, int v2) {
		
		if(containEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}
	
	//removeVertex
	public void removeVertex(int v1) {
		for(int key:map.get(v1).keySet()) {
			map.get(key).remove(v1);
		}
		map.remove(v1);
	}
	
	//Display Graph
	
	public void Display() {
		for(int key:map.keySet()) {
			System.out.println(key +"-->"+map.get(key));
			
		}
	}

}
