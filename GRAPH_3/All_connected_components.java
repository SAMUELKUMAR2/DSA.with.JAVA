package GRAPH_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class All_connected_components {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	// Creating Node
	public All_connected_components(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public void TotalComponent() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		
		int component = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			ArrayList<Integer>arr1=new ArrayList<>();
			
			component++;
			
			 qq.add(src);

			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// ignore if visited exist
				if (visited.contains(r)) {
					continue;
				}

				// visited mark
				visited.add(r);
				// work(checking condition)
				arr1.add(r);
				// add neighbor
				for (int child : map.get(r).keySet()) {
					if (!visited.contains(child)) {
						qq.add(child);
					}
				}
				
			}
			arr.add(arr1);
		}
		System.out.println("Total Component = "+component);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	public void Display() {
		for(int node:map.keySet()) {
			System.out.println(node+"-->"+map.get(node));
		}
	}
	
}
