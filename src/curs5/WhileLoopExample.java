package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	
	/**
	 * Program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul care ore a lucrat
	 * calculam daca a lucrat maxim 40 de ore pe saptamana si minim 1 ora pe saptamana respectiva
	 * daca introduce un numar invalid il rugam sa introduca din nou
	 * rate per hour este 15
	 */
	
	public static void main(String[] args) {
		
		//ce stim
		int maxNumberHoursWorked = 40;
		int ratePerHour = 15;
		
		//ce nu stim
		System.out.println("Cate ore ai lucrat saptamna aceasta ? ");
		Scanner scan = new Scanner(System.in);
		int hoursWorked =  scan.nextInt();
		
		/*
		 * boolean nrValid = false; if(hoursWorked <1 || hoursWorked >40) {
		 * System.out.println("Numar invalid!");
		 * 
		 * }else { nrValid = true; }
		 * 
		 * while(!nrValid) {
		 * 
		 * }
		 */
		
		//path pozitiv (nr valid) --> caluclez 
		
		//path negativ (nr invalid) --> intreb din nou
		
		//loop (while)
		
		//hoursWorked < 1 || hoursWorked > maxNumberHoursWorked --> 65(65 <1 || 65>40) --> condita 2 evalueaza True , intra in while
		
		//hoursWorked < 1 && hoursWorked > maxNumberHoursWorked --> 65 (65<1 && (and) 65>40) --> evalueaza pe false si nu intra in while
		
		//validarea
		while(hoursWorked < 1 || hoursWorked > maxNumberHoursWorked) {
			System.out.println("Numar invalid!");
			System.out.println("Te rog introdu un numar intre 1 si 40 :");
			hoursWorked =  scan.nextInt();
	
		}
	
		System.out.println("Nr ore lucrate este :" + hoursWorked * ratePerHour);		
		
	/*
	 * while(hoursWorked >=1 || hoursWorked <=maxNumberHoursWorked) {
	 * 
	 * System.out.println("Nr ore lucrate este :" + hoursWorked * ratePerHour); }
	 * System.out.println("Numar invalid!");
	 */

		
		
	}

}
