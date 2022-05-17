package curs5;

public class DoWhileExample {

	public static void main(String[] args) {

		String[] array = {"zero", "one", "two", "three", "four"};
		
		int i =0;
		do {
			
			System.out.println(array[i]);
			i++;
			
		}while(i > array.length);
		
		//-------------------------------------------------------
		
		int j = 0;
		while(j > array.length) {
			
			System.out.println(array[j]);
			j++;
		}
		
	}

}
