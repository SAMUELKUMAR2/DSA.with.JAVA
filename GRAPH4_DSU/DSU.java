package GRAPH4_DSU;
import java.util.*;
public class DSU {

	public class Node{
		int val;
		int rank;
		Node Parent;
	}
	
	
	//creating a node which have value, rank and parent node.
	HashMap<Integer,Node> map = new HashMap<>();
	public void createSet(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.Parent = nn;
		map.put(v, nn);
	}
	//finding the representative of the vertex
	public int Find(int v) {
		Node nn = map.get(v);
		return find(nn).val;
	}
	//passing the location of v for finding parent or representative.
	private Node find(Node nn) {
		if(nn.Parent==nn) {
			return nn;
		}
		//recursion call
		Node n = find(nn.Parent);
		nn.Parent = n; //path Compression
		return n;
		
	}
	
	//Merging sets(Node).(Taking the union  of two sets).
	public void Union(int v1,int v2) {
		Node n1 =map.get(v1);
		Node n2 = map.get(v2);
		
		Node rn1 = find(n1);
		Node rn2 = find(n2);
		if(rn1.rank==rn2.rank) {
			rn1.Parent=rn2;
			rn2.rank++;;
		}
		else if(rn1.rank>rn2.rank) {
			rn2.Parent =rn1;
		}
		else {
			rn1.Parent =rn2;
		}
		
	}
//	public void display() {
//		for(int node:map.keySet()) {
//			Node n = map.get(node);
//			Node r = find(n);
//			System.out.println(node + "-rank "+r.rank+" -parent "+r.val);
//		}
//	}
	
}
