package GRAPH_3;

import java.util.HashMap;

public class IsValid_Tree {

//	int arr[][] = {{0,1},{0,2},{0,3},{1,4}};
	public boolean isValidTree(int node,int [][]edges) {
		HashMap<Integer, HashMap<Integer,Integer>>map = new HashMap<>();
		for(int i =0;i<node;i++) {
			map.put(i, new HashMap<>());
		}
		
		System.out.println(edges.length);
		
		//edge.length = rowNumber
		for(int i=0;i<edges.length;i++) {
			int v1 = edges[i][0];
			int v2 = edges[i][1];
			map.get(v1).put(v2, 1);
			map.get(v2).put(v1, 1);
			
		}
		return false;
			
	}
	

}
