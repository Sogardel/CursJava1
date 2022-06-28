package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		//add element to list
		
		list.add("oana");
		list.add("ion");
		list.add("maria");
		list.add("gheorghe");
		
		System.out.println(list.size());

		list.add(0, "bogdan");
		
		System.out.println(list.size());
		
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume );
			
		}
		System.out.println("-------------------------");

		list.add(0, "Alina");

		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume );
			
		}
		System.out.println("-------------------------");
		
		//get element via index
		System.out.println(list.get(5));
	
		int index = 0;
		for (String nume : list) {
			System.out.println((index++) + nume);
		}
		
		System.out.println("-------------------------");

		//remove element
		list.remove(0);
		list.remove("gheorghe");
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume );
			
		}
		
		System.out.println("-------------------------");
		//remove all list elements
		list.clear();
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : " + nume );
			
		}
		
	}

}
