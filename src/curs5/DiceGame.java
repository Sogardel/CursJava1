package curs5;

import java.util.Scanner;

public class DiceGame {

	/**
	 * Facem un joc de zaruri in care avem urmatoarele reguli :
	 * daca userul da in total : 2, 6, 12 --> Pierde jocul --> break
	 * daca userul da in total : 7, 11 --> castiga jocul --> break
	 * daca userul da in total : 3, 10 --> repeta aruncarea automat --> continue
	 * daca da alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca o data.
	 * raspunsul trebuie sa fie boolean : true / false 
	 * 
	 */
	
	
	public static void main(String[] args) {
	
		boolean condition = true;
		
		/*
		 * double dice3 = Math.random()*6; //0.0--0.9... System.out.println(dice3); int
		 * dice4 = (int) (Math.random()*6+1); System.out.println(dice4);
		 */
		while(condition) {
			int dice1 =  (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1+ dice2;
			
			//logica jocului
			System.out.println("Ai dat :" + total);
			//case pierde
			//* daca userul da in total : 2, 6, 12 --> Pierde jocul --> break
			if(total == 2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau! Ai dat :" + total + " Ai pierdut!");
				break;
			}
			//case castiga
			//* daca userul da in total : 7, 11 --> castiga jocul --> break
			else if(total == 7 || total == 11) {
				System.out.println("Felicitari! Ai dat :" + total + " Ai castigat!");
				break;		
			}		
			//case mai da o data
			//* daca userul da in total : 3, 10 --> repeta aruncarea automat --> continue
			else if( total == 3 || total == 10) {
				System.out.println("Ai dat : " + total + " Automat mai dai o data!");
				continue;
			}
			//daca da alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca o data.
			System.out.println("Mai dai o data?");
			Scanner scan = new Scanner(System.in);
			condition =  scan.nextBoolean();	
			
		}
		
		System.out.println("Game over!");
		
		
	}

}
