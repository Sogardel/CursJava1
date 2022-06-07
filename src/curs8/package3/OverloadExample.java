package curs8.package3;

public class OverloadExample {

	public static void main(String[] args) {

		
		System.out.println(multiply(2, 3));
		System.out.println(multiply(2.5, 3.6));
		System.out.println(multiply(2, 3));

		
		
		
		System.out.println(1);//data type int
		System.out.println("1");// data type string
		System.out.println('1');// data type char
		System.out.println(1);//data type double
		
		
	}

	/**
	 * Method that multiplies two integer numbers
	 * @param a -int 
	 * @param b -int
	 * @return - sum of multiplication
	 */
	public static int multiply(int a , int b) {
		
		return a*b;
	}
	
	public static double multiply(double a , double b) {
		
		return a*b;
	}
	

}
