package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		map.put(0, "negru");
		map.put(101, "galben");
		map.put(2, "alb");
		
		System.out.println(map);
	
		Map<Integer, String> map2 = new HashMap<>();
		
		map2.put(33, "Rosu");
		map2.put(44, "Maro");
		map2.put(22, "Albastru");
		
		System.out.println(map2);
		
		map.putAll(map2);
		
		System.out.println("Updated map :" + map);

	}

}
