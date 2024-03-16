package GRAPH2_BFS_AND_DFS;

import java.util.*;


public class IsConnected {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	// Creating Node
	public IsConnected(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public boolean isConnected() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		int component = 0;
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			component++;
			count++;
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
				
				// add neighbor
				for (int child : map.get(r).keySet()) {
					if (!visited.contains(child)) {
						qq.add(child);
					}
				}
			}
		}
		System.out.println("Total Component = "+component);
		return count==1;
	}
	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + "--" + map.get(key));
		}
	}
}
