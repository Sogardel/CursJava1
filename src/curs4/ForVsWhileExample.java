package curs4;

import java.util.Scanner;

public class ForVsWhileExample {
	
	/*
	 * facem un program care ii cere utilizatorului numere
	 * inmulteste acele numere cu 10
	 * cand utilizatorul introduce 0 iesim din program
	 */
	
	
	public static void main(String[] args) {
		//rezolvareCuFor();
		rezolvareCuWhile();
	}

	
	public static void rezolvareCuFor() {
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please insert a number :");

		//int val = 0;	
		for(int i =scan.nextInt(); i!=0; i=scan.nextInt()) {
			 i*=10;
			 System.out.println("Please eneter a number");
			 System.out.println(i);
		}	
	}
	
	public static void rezolvareCuWhile() {
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please insert a number :");

		/*
		 * //int val = 0; for(int i =scan.nextInt(); i!=0; i=scan.nextInt()) { i*=10;
		 * System.out.println("Please eneter a number"); System.out.println(i); }
		 */
		
		int i =scan.nextInt();
		while(i!=0) {
			
			i*=10;
			System.out.println("Please eneter a number"); 
			System.out.println(i);
			i =scan.nextInt();
			
		}
		
		
	}
	
	
	
}
