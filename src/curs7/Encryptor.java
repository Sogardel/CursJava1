package curs7;

public class Encryptor {

	
	public static void main(String[] args) {
		
		Encryptor enc = new Encryptor();
		
		enc.decrypt(enc.encrypt("admin123"));
		//abc --> bcd
	}
	
	
	public String encrypt(String text) {
		String textEncripted = "";
		char letter = ' ';
		int letterInt = 0;
		
		System.out.println("String initial :" + text);
		
		
		for(int i=0; i< text.length(); i++) {
			
			letterInt = (int)text.charAt(i)+1;			
			//System.out.println(letterInt);
			letter = (char)letterInt;
			//System.out.println(letter);
			textEncripted = textEncripted + String.valueOf(letter);	
			
		}
		
		System.out.println("Text criptat :" + textEncripted);
		return textEncripted;
	}
	
	public String decrypt(String textEncrypted) {
		
		int letterInt = 0;
		char letter = ' ';
		String textDecripted = "";
		System.out.println("Text criptat initial :" + textEncrypted);

		for(int i=0; i< textEncrypted.length(); i++) {
			
			letterInt = (int)textEncrypted.charAt(i)-1;
			letter = (char)letterInt;
			textDecripted = textDecripted + String.valueOf(letter);
			
		}
		System.out.println("Text decriptat :" + textDecripted);

		return textDecripted;
	} 
	
	
}
