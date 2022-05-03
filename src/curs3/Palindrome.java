package curs3;

public class Palindrome {
	
	// radar
	// masina
	
	//cuvant
	//cuvantIntros
	//cuvant.equals(cuvantIntros) ==> palindrome
	
	//cuvant = radar
	//cuvantItros = ""
	//for(int i = 0; i<5; i++){
	//    char x =cuvant.charAt(i) 
	//	cuvantIntros = cuvantIntros + x;
		// "" = "" + r;
		//r = r+a;
		//ra = ra+d;
	//
	//}
	
	public void checkIfWordIsPalindrome(String cuvant) {
		
		//cuvant = radar
		//cuvant.lenght = 5
		//radar
		//01234
		
		String cuvantIntros = "";
		
		for(int i = cuvant.length()-1;i>=0; i--) {
			
			cuvantIntros =  cuvantIntros + cuvant.charAt(i);
			
		}
		
		System.out.println("Cuvantul original este :" + cuvant);
		System.out.println("Cuvantul intros este :" + cuvantIntros);
		
		if(cuvantIntros.equals(cuvant)) {
			System.out.println("Cuvantul este palindrome");
		}else {
			System.out.println("Cuvantul NU este palindrome");

		}
		
		
	} 
	

}
