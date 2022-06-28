package curs11;

public class TwoDimensionArray {

	public static void main(String[] args) {

		//int[] array = new int[2];  {1, 2} 
		int[][] array = { {1, 2},{3, 4} };
		
		
		/*        column0    column1
		 *  row0     1           2
		 *  
		 *  row1     3           4
		 * 
		 */
		
		//System.out.println(array[0][1]);
		//System.out.println(array[1][1]);
		
		for(int i = 0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
			  System.out.print(array[i][j] + " ");	
			}
			
			System.out.println();	
		}
		
		System.out.println("--------------------------------------");
		
		/*							col0       col1       col2      col3
		 * textArray -->    row0    alb			negru	  verde     galben
		 * 					
		 * 					row1
		 * 
		 * 
		 */
		
		String[][] textArray =  new String[2][4];
		textArray[0][0] = "Alb";
		textArray[0][1] = "Negru";
		textArray[0][2] = "Verde";
		textArray[0][3] = "Galben";
		
		textArray[1][0] = "Iasi";
		textArray[1][1] = "Alba";
		textArray[1][2] = "Cluj";
		textArray[1][3] = "Oradea";

		//row
		System.out.println("ROW :" + textArray.length);
		//columns
		System.out.println("COL :" + textArray[0].length);
		
		for(int i = 0; i<textArray.length; i++) {
			
			System.out.println( "ROW : ");
			
				for(int j = 0; j< textArray[i].length; j++) {
					
					System.out.println(" Column :" + textArray[i][j] + " ");
				}	
		}
		
		//T[][] array =  new T[][] --> { {String, int, boolean}, {String, int, boolean} }
		
		
	}

}
