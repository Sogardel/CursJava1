package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	/**
	 * Citeste 2 numnere de la tastatura 
	 * verifica daca ambele nr sunt pozitive
	 * verifica daca fiecare numar este pozitiv
	 * verifica care dintre cele 2 este cel mai mic
	 * 
	 */
	
	public static void main(String[] args) {
		//avem nevoie de 2 variabile de tip int
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert first number :");
		num1 =  scan.nextInt();
		System.out.println("Please insert second number :");
		num2 =  scan.nextInt();	
		
		
		/*
		 * //verificam daca primul nr este pozitiv //variabila = expresie ?
		 * expersie2:experesie3 //result = num1>0 ? "Num 1 is positive" :
		 * "Num 1 is negative" //System.out.println(result); if(num1 >0) {
		 * System.out.println("Num 1 is positive"); }else {
		 * System.out.println("Num 1 is negative"); } //verifcam daca al doilea nr este
		 * pozitiv if(num2 >0) { System.out.println("Num 2 is positive"); }else {
		 * System.out.println("Num 2 is negative"); } //verificam daca ambele sunt
		 * pozitive if(num1>0 && num2>0) {
		 * System.out.println("Both numbers are postive"); }else {
		 * System.out.println("Not both numbers are positive"); } //verificam care este
		 * nr mai mic dintre cele 2 if(num1<num2) {
		 * System.out.println("Num1 is the smallest"); }else if(num1 == num2) {
		 * System.out.println("Numbers are equal"); }else {
		 * System.out.println("Num2 is the smallest"); }
		 */
		 
		String result;
		result = num1>0 ? "Number 1 is positive" : "Number 1 is negative";
		System.out.println(result);
		result  = num2>0 ?"Number 2 is positive" : "Number 2 is negative";
		System.out.println(result);
		result = (num1>0) && (num2>0) ? "Both numbers are positive" : "Not both numbers are positive";
		System.out.println(result);
		result = num1 == num2 ? "Numbers are equals" :num1<num2 ? "Number 1 is the smallest": "Number2 is the smallest";
		System.out.println(result);
		

	}

}
