package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>(Arrays.asList("unu", "doi", "trei", "patru", "cinci"));
		
		System.out.println(arrayList.size());
		
		arrayList.add("sase");
		
		System.out.println(arrayList.size());
		
		for(String nr : arrayList) {
			System.out.println(nr);
		}
		
		System.out.println("--------------------------------");

		arrayList.subList(1, 4).clear();
		
		for(String nr : arrayList) {
			System.out.println(nr);
		}
		
		System.out.println("--------------------------------");

		//contains object
		String element = "sase";
		if(arrayList.contains(element)) {
			System.out.println("Contine elementul");
		}else {
			System.out.println("Nu contine elementul");

		}
		
		System.out.println("--------------------------------");
		//update element
		arrayList.set(0, "zero");
		
		for(String nr : arrayList) {
			System.out.println(nr);
		}
		
		System.out.println("--------------------------------");

		Iterator<String> iterator = arrayList.iterator();
		//System.out.println(iterator.next());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
