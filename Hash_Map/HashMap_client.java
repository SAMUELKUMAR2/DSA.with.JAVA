package Hash_Map;

public class HashMap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash_Map<String,Integer> map = new Hash_Map();
		map.put("Raj", 98);
		map.put("Anku",77);
		map.put("Ram", 83);
		map.put("Ankita", 23);
		map.put("kaju", 35);
		map.put("Pooja", 23);
		map.put("Shivam", 35);
		System.out.println(map);
		System.out.println(map.get("Ram"));
		System.out.println(map.remove("Pooja"));
		System.out.println(map);
		
		
	}

}
