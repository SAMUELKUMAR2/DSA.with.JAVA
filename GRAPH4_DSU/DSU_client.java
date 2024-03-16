package GRAPH4_DSU;

public class DSU_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSU set = new DSU();
		set.createSet(2);
		set.createSet(4);
		set.createSet(5);
		set.createSet(6);
		set.createSet(7);
		set.createSet(8);
		set.createSet(9);
		set.Union(2, 4);
		set.Union(6, 7);
		set.Union(8, 9);
		set.Union(7, 9);
		set.Union(2, 7);
		System.out.println(set.Find(6));
//		set.display();
	}

}
