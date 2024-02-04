package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<>();
		map.put("raj", 56);
		map.put("Anku",77);
		map.put("Ankit", 60);
		map.put("kunal", 43);
		map.put("Kaju", 77);
		map.put(null, 88);
		System.out.println(map);
		//get
		System.out.println(map.get("Shiv"));
		System.out.println(map.get("raj"));
		//ContainKey
		System.out.println(map.containsKey("Anku"));
		System.out.println(map.containsKey("ANkur"));
		//remove
		System.out.println(map.remove("Kaju"));
		System.out.println(map.remove("Aman"));
		System.out.println(map);
		
		// Tree Map
		TreeMap<String,Integer> map1 = new TreeMap<>();
		map1.put("raj", 56);
		map1.put("Anku",77);
		map1.put("Ankit", 60);
		map1.put("kunal", 43);
		map1.put("Kaju", 77);
//		map1.put(null, 88);  null pointer exception
		System.out.println(map1);
		
		// LinkedHash map
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
		map2.put("raj", 56);
		map2.put("Anku",77);
		map2.put("Ankit", 60);
		map2.put("kunal", 43);
		map2.put("Kaju", 77);
		map2.put(null, 88);  
		System.out.println(map2);
		
//		Set<String> s = map.keySet();
//		System.out.println(s);
//		for(String key:s) {
//			System.out.println(key +" "+ map.get(key));
			
			for(String key : map.keySet()) {
				System.out.println(key +" "+ map.get(key));
			}
		}
		
	}

