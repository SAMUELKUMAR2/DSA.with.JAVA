package GRAPH4_DSU;

import java.util.*;

import GRAPH_ALGO.Kruskal_Algo;

public class Kruskals {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Kruskals(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public class EdgePair {
		int v1;
		int v2;
		 int cost;
		 public EdgePair(int v1, int v2, int cost) {
			 this.v1 = v1;
			 this.v2 = v2;
			 this.cost = cost;
		 }
		 @Override
			public String toString() {
				return v1 +" -- "+v2+ " @ "+ cost;
			}
	}
	
	public ArrayList<EdgePair> AllEdgePair(){
		ArrayList<EdgePair> list = new ArrayList<>();
		for(int e1:map.keySet()) {
			for(int e2:map.get(e1).keySet()){
				int cost = map.get(e1).get(e2);
				EdgePair eg = new EdgePair(e1, e2, cost);
				list.add(eg);
				
			}
		}
		
		return list;
	}
	
	public void KruskalAlgorithm() {
		int ans = 0;
		//1- create disjoint set of node
		//2-  Sort the ArrayList based on cost
		//3- Union of sets
		DSU ds = new DSU();  //1
		for(int node:map.keySet()) {
			ds.createSet(node);
		}
		ArrayList<EdgePair> ll = AllEdgePair();
		//2
		Collections.sort(ll,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		
		//3
		for(EdgePair edge:ll) {
			int e1 = edge.v1;
			int e2 = edge.v2;
			int re1= ds.Find(e1);
			int re2 = ds.Find(e2);
			if(re1==re2) {
				// do nothing
			}
			else {
				System.out.println(edge);
				ans+=edge.cost;
				ds.Union(re1, re2);
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // vertex of node
		Kruskals ks = new Kruskals(n);
		int m = sc.nextInt(); // no of edges
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.AddEdge(v1, v2, cost);
		}
		ks.KruskalAlgorithm();
	}
}
