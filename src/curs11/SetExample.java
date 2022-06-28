package curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>(); 
		
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		
		set.add("Rosu");
		
		boolean verificaSet =  set.isEmpty();
		System.out.println(verificaSet);
		
		set.add("galebn");
		set.add("negru");
		set.add("verde");
		
		for(String culoare : set) {
			System.out.println(culoare);
		}
		
		set.remove("verde");
		
		System.out.println("-----------------------");
		
		for(String culoare : set) {
			System.out.println(culoare);
		}
		System.out.println("-----------------------");

		set.add("Alb");
		for(String culoare : set) {
			System.out.println(culoare);
		}
		
		System.out.println(set.contains("negru"));
		
		
		System.out.println("-----------------------");
		set.clear();
		for(String culoare : set) {
			System.out.println(culoare);
		}
	}

}
