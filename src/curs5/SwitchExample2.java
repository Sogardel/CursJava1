package curs5;

import java.util.Scanner;

public class SwitchExample2 {
	
	static int number1;
	static int number2;
	static char operation;
	static int result;

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the first number:");
		number1 =  scan.nextInt();
		System.out.println("Please enter the operation :");
		operation =  scan.next().charAt(0);
		System.out.println("Please enter the second number:");
		number2 = scan.nextInt();
		
		//int result = 0;
		
		switch(operation) {
		
		case '+' :
			result =  number1 + number2;
			printResult();
			break;
		case '-' :
			result = number1 - number2;
			printResult();
			break;
		case '*' : 
			result =  number1 * number2;
			printResult();
			break;
		case 'x' :
			result =  number1 * number2;
			printResult();
			break;
		case '/' :
			result =  number1/number2;
			printResult();
			break;	
		default:
			System.out.println("Wrong operation inserted!");
			break;
		}		
	}
	
	public static void printResult() {
		
		System.out.println(number1 + " "+ operation + " "+ number2 + " = " + result );

	}

}
