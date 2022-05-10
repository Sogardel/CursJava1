package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {

	/*
	 * && --> short circuit
	 * &  --> and
	 * 
	 * (x!=0) & (1/x>5) --> evalueaza (x!=0) si dupa accea evalueaza (1/x>5) dupa accea aplica conditia & (and)
	 * (x!=0) && (1/x>5)--> evalueaza (x!=0) doar daca prima conditie este true evalueaza si (1/x>5)
	 * 
	 * a | b --> evalueaze A dupa accea evalueaza B dupa accea face | OR
	 * a || b --> evalueaza A si doar daca A este false evalueaza B
	 * 	
	 */
		
		
	int x = 0;
	
	if((x!=0) & (1/x>5) ) {
		
		System.out.println("True");
		
	}else {
		
		System.out.println("False");
	}	
	}

}
