package curs2;

public class MethodExample {

	/**
	 * poti calcula mai multe camere
	 * calculeaza aria unor camere
	 * calculeaza nr total de mp
	 */
	
	int nrTotal;
	
	
	public static void main(String[] args) {
		//Room1
		int lenght = 3;
		int width = 4;
		int room1area =  lenght * width;
		System.out.println(room1area);
		
		//Room2 
		int lenght2 = 5;
		int width2 = 6;
		int room2area =  lenght2 * width2;
		System.out.println(room2area);
		
		int nrTotal =  room1area + room2area;
		System.out.println(nrTotal);	
		
		MethodExample sufragerie =  new MethodExample();
		MethodExample bucatarie =  new MethodExample();
		MethodExample hol =  new MethodExample();


		System.out.println(sufragerie.calculateArea2(4, 4));
		//System.out.println(sufragerie.calculateArea(3, 3));
		System.out.println(bucatarie.calculateArea2(2, 2));
		System.out.println(hol.calculateArea2(4, 7));
		
		System.out.println(calculateTotal(sufragerie.calculateArea2(4, 4), bucatarie.calculateArea2(2, 2)));
	
		sufragerie.calculateArea(4, 4);
		bucatarie.calculateArea(2, 2);
		
		System.out.println(calculateTotal(sufragerie.nrTotal, bucatarie.nrTotal));

		int calcTotal = calculateTotal2(sufragerie.nrTotal, bucatarie.nrTotal, 28, 45, 6);
		System.out.println(calcTotal);
	}
	
	public void calculateArea(int lenght, int width) { //calculateArea() > nrTotal > 34
		nrTotal = lenght * width;
	}

	public int calculateArea2(int lenght, int width) {  //calculateArea2() > 34
		int nrTotaliMp = lenght * width;
		return nrTotaliMp;
	}

	public static int calculateTotal(int area1, int area2) {
		int result  = area1 + area2;
		return result;
	}
	//calculateTotal2(sufragerie, bucatarie, hol)
	public static int calculateTotal2(int...rooms) {
		int result = 0;
		for(int room : rooms) {
			result = result + room;
			//result = 0 + 16
			//result = 16 + 4;
			//result = 20 + 28;
		}
		
		return result;
	}
	
	
}
