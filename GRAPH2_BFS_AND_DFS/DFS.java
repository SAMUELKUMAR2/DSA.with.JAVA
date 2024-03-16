package GRAPH2_BFS_AND_DFS;

import java.util.*;

public class DFS {
HashMap<Integer, HashMap<Integer,Integer>>map ;
public DFS(int v) {
	this.map = new HashMap<>();
	for (int i = 1; i <=v; i++) {
		map.put(i, new HashMap<>());
	}
	
}
public void AddEdge(int v1, int v2,int cost) {
	map.get(v1).put(v2,cost);
	map.get(v2).put(v1, cost);
}
public void Display() {
	for(int v:map.keySet()) {
		System.out.println(v+"-->"+map.get(v));
	}
}

public boolean DFS(int src ,int des) {
	Stack<Integer> st = new Stack<>();
	HashSet<Integer>visited = new HashSet<>();
	st.push(src);
	while(!st.isEmpty()) {
		//remove
		int r = st.pop();
		//ignore
		if(visited.contains(r)) {
			continue;
		}
		//visited mark
		visited.add(r);
		//work
		if(r==des) {
			return true;
		}
		//add children
		for(int child:map.get(r).keySet()) {
			st.push(child);
		}
	}
	return false;
}

//Dft- depth first traversal

public void DFT() {
	Stack<Integer> st = new Stack<>();
	HashSet<Integer>visited = new HashSet<>();
	for(int node:map.keySet()) {
		st.push(node);
		
		if(visited.contains(node)) {
			continue;
		}
	
	while(!st.isEmpty()) {
		//remove
		int r = st.pop();
		//ignore
		if(visited.contains(r)) {
			continue;
		}
		//visited mark
		visited.add(r);
		//work
		System.out.print(r+" ");
		//add children
		for(int child:map.get(r).keySet()) {
			st.push(child);
		}
	}
}}
}
