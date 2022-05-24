package curs6;

import java.util.Iterator;

public class ForEachExample {

	public static void main(String[] args) {
		
		String[] cities =  {"Iasi", "Arad", "Cluj", "Alba"};
		
		
		for(int i = 0; i<cities.length; i++) {
			
			System.out.println(cities[i]);
		
		}
		
		System.out.println("---------------------------------------");
		
		for(String oras: cities) {
			
			System.out.println(oras);
		}
				
	}

}
