package curs3;

import java.util.Scanner;

public class CheckOddOrEven {
	
	int number;
	
	public void checkIfNumberIsOddOrEven() {
		
		if(number % 2 == 0) {
			
			System.out.println(number + " : is even!");
			
		}else{
			
			System.out.println(number + " : is odd!");
		}
		
	}
	
	
	public void askTheUserForNumberToCheck() {
		System.out.println("Please insert a number : ");
		Scanner scan =  new Scanner(System.in);
		number = scan.nextInt();
		checkIfNumberIsOddOrEven();
		scan.close();
		
		
	}
	
	
	
	
	

}
