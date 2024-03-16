package GRAPH2_BFS_AND_DFS;

import java.util.*;

public class BFS {
// used to know path exist or not.
	HashMap<Integer, HashMap<Integer, Integer>> map;

	// Creating Node
	public BFS(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	// Adding Edges between two nodes with cost

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean BFS(int src, int dis) {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
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
			if (r == dis) {

				return true;
			}
			// add neighbor
			for (int child : map.get(r).keySet()) {
				if (!visited.contains(child)) {
					qq.add(child);
				}
			}

		}
		return false;
	}
	// BFT -- Breadth first Traversal

	public void BFT() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

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
				System.out.print(r + " ");
				// add neighbor
				for (int child : map.get(r).keySet()) {
					if (!visited.contains(child)) {
						qq.add(child);
					}
				}
			}
		}
	}

	//isCyclic using bft
	
	public boolean isCyclic() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			qq.add(src);

			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// ignore if visited exist
				if (visited.contains(r)) {
					System.out.println();
					return true;
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
		return false;
	}
	public void Display() {
		for (int key : map.keySet()) {
			System.out.println(key + "--" + map.get(key));
		}
	}

}
