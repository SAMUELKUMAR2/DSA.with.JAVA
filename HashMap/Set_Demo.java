package HashMap;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(32);
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(8);
		set.add(7);
		System.out.println(set);
		//contain
		System.out.println(set.contains(3));
		System.out.println(set.contains(322));
		//remove
		System.out.println(set.remove(4));
		System.out.println(set);
		
		//Tree Set
//		Set<Integer> set1 = new TreeSet<>();
//		set1.add(32);
//		set1.add(4);
//		set1.add(3);
//		set1.add(5);
//		set1.add(8);
//		set1.add(7);
//		System.out.println(set1);
		//LinkedSet
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(32);
		set2.add(4);
		set2.add(3);
		set2.add(5);
		set2.add(8);
		set2.add(7);
		System.out.println(set2);
		
		
	}

}
