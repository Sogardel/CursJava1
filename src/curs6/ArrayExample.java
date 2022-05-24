package curs6;

public class ArrayExample {
	
	
	public static void main(String[] args) {
		
		String[] textArray = new String[5];
		//String[] textArray = {null, null, null, null, null}
		// index of array      :0    , 1  , 2   ,  3  , 4
		textArray[0] = "This";
		System.out.println(textArray[4]);
		//String[] textArray = {"This", null, null, null, null}
		textArray[1] = " is";
		//String[] textArray = {"This", "is", null, null, null}
		textArray[2] = " an";
		textArray[3] = "Array";
		textArray[4] = "!";

		
		
		for(String element : textArray) {
			System.out.print(element);
		}
		
		
		
		for(int i=0; i<textArray.length; i++ ) {
			
			System.out.print(textArray[i]);

		}
		
		/*
		 * try {
		 * 
		 * System.out.println(textArray[5]);
		 * 
		 * }catch(ArrayIndexOutOfBoundsException e ) {
		 * 
		 * System.out.println("Ai incercat sa accesezi un index in afara array-ului!");
		 * 
		 * }
		 */
		
		
	//	System.out.println("Test !!!");
		
	}

}
