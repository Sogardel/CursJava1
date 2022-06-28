package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductOwner");
		
		System.out.println("contains key : " +map.containsKey("D"));
		System.out.println("contains value : " + map.containsValue("Tester"));
		System.out.println("--------------------");
		
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		
		for(String value : map.values()) {
			
			System.out.println(value);
		}
		System.out.println("--------------------");

		System.out.println(map.get("M"));
		
		map.remove("M");
		System.out.println("--------------------");

		for(String key: map.keySet()) {
			System.out.println(key);
		}
	}

}
