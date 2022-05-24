package curs6;

import java.util.Iterator;

public class FindIndexofElementInArray {

	/**
	 * Avem un array 
	 * Ne trebuie o metoda pentru a afla care este indexul unui element
	 * printam care este elementul si indexul
	 * rezolvare cu FOR
	 * rezolvare cu FOR EACH
	 * rezolvare cu WHILE
	 * Ex raspuns : index pentru elementul 8 este 3
	 */
	
	//ce stim
	int[] numbers = {3, 5, 7, 8, 9, 2};
	// ce nu stim ? 
	// elementul 
	// index
	
	public void findIndexUsingFor(int element) {
		
		for(int i=0;i<numbers.length; i++) {
			
			if(element == numbers[i]) {
				System.out.println("index pentru elementul " +element +" este :"+ i);
			}
		
		}	
	}
	
	public void findIndexUsingForEach(int element) {
		int index =0;
		for(int nr : numbers) {
			
			if(nr == element) {
				System.out.println("index pentru elementul " +element +" este :"+ index );
			}
			index++;	
		}
		
		/*
		 * Iterator<Integer> index = numbers.iterator()
		 * while(numbers.hasNext()){
		 * 	Sysout....
		 * }
		 * 
		 */	
		
	}
	
	public void findIndexUsingWhile(int element) {
		int i = 0;
		
		while(i<numbers.length) {
			
			if(element == numbers[i]) {
				System.out.println("index pentru elementul " +element +" este :"+ i);
			}
			i++;
		}	
	}
	
	public static void main(String[] args) {

		FindIndexofElementInArray obj = new FindIndexofElementInArray();
		obj.findIndexUsingFor(8);
		System.out.println("-------------------");
		obj.findIndexUsingForEach(8);
		System.out.println("-------------------");
		obj.findIndexUsingWhile(8);

	}

}
