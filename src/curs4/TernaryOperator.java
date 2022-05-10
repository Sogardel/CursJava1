package curs4;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		int num3 = 2;
		
		//int x = (num1>num2)?num1:(num2<num3?num2:num3);
		
		int x = (num1>num2)?num2:num1;
		
		/*
		 * Este (num1>num2) : true ? -Daca da, atunci num2 va f atribuit lui X
		 * Este (num1>num2) : False ? -atunci num1 va f atribuit lui X
		 *  ? :
		 * 
		 * 
		 */
		
		System.out.println("Valoarea lui x cu operator conditional :" + x);
		
		if(num1>num2) {
			System.out.println("Valoarea lui x in IF/ELSE : " + x);
		}else {
			System.out.println("Valoarea lui x in IF/ELSE : " + x);
		}
		
		
		
	}

}
