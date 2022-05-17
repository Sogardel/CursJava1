package curs4;

public class WhileLoopExample {
	
	
	public static void main(String[] args) {
		
		
		/*
		 * int i = 10;
		 * 
		 * while(i>0) { i--; System.out.println(i); // i--; } // }
		 * 
		 * 
		 * int j = 0; String[] array = {"one", "two", "three", "four"};
		 * 
		 * while(j<array.length) { //j++; System.out.println(array[j]); j++; }
		 */
		
		
		double dice =   Math.random();
		System.out.println(dice);
		
		int dice2 =   (int) (Math.random()*6);
		System.out.println(dice2);
		
		int dice3 =   (int) (Math.random()*6+1);
		System.out.println(dice3);
	}

}
