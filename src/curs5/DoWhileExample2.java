package curs5;

import java.util.Scanner;

public class DoWhileExample2 {
	
	
	/**
	 * intrebam utilizatorul un numar
	 * inmultim numarul cu 10
	 * printam rezultatul operatiei
	 * Intrebam alt numar, pana cand utilizatorul introduce numarul 0 si atunci iesim din program
	 */
	
	public static void main(String[] args) {
		
	int number;
	Scanner scan = new Scanner(System.in);
	
	
	do {
	System.out.println("Enter a number :");	
	number = scan.nextInt();
	System.out.println(number*10);

	}while(number != 0);
	
	System.out.println("You exit the program!");
	
	}

}
