package GRAPH_3;

import java.util.*;

	

public class Is_Graph_Bipartite {
	
	public class Pair{
		int vrt;
		 int d;
		 public Pair(int vrt,int d) {
			 this.vrt = vrt;
			 this.d = d;
		 }
	}
	
	public class Solution {
	    public boolean isBipartite(int[][] graph) {
	    	HashMap<Integer, HashMap<Integer,Integer>>map = new HashMap<>();
	    	for(int i =0;i<graph.length;i++) {
	    		map.put(i, new HashMap<>());
	    	}
	    	for(int i =0;i<graph.length;i++) {
	    		for(int j = 0;j<graph[i].length;j++) {
	    			map.get(i).put(graph[i][j], 4);
	    		}
	    	}
	    	//checking 1:a-cyclic
	    	//2:in cyclic-- NO odd-length cycle
	    	return isCycle(map);
	    	
	    }
	    public boolean isCycle(HashMap<Integer, HashMap<Integer,Integer>>map) {
	    	//bp-BipartitePair
	    	LinkedList<Pair> qq = new LinkedList<>();
	    	HashMap<Integer,Integer> visited = new HashMap<>();
	    	
	    	for(int src:map.keySet()) {
	    		if(visited.containsKey(src)) {
	    			continue;
	    		}
	    		Pair bp = new Pair(src, 0);
	    		qq.add(bp);
	    		
	    		while(!qq.isEmpty()) {
	    			Pair r = qq.remove();
	    			if(visited.containsKey(r.vrt) && r.d!=visited.get(r.vrt) ) {
	    				return false;
	    			}
	    			visited.put(r.vrt, r.d);
	    			
	    			//add children
	    			for(int child:map.get(r.vrt).keySet()) {
	    				if(!visited.containsKey(child)) {
	    					Pair a = new Pair(child,r.d+1);
	    					qq.add(a);
	    				}
	    			}
	    		}
	    		
	    	}
	    	
	    	return true;
	    }
	}

//	public static void Main(String[] args) {
//		int graph[][] = {{1,3},{0,2},{1,3},{0,2}};
//		Is_Graph_Bipartite g =  new Is_Graph_Bipartite();
//		Solution v = new Solution();
//		v.isBipartite(graph);
//		
//	}
}
//1:a-cyclic
//2:in cyclic-- NO odd-length cycle
//