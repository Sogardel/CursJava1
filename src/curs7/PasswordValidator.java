package curs7;

import java.util.Scanner;

public class PasswordValidator {

	
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli
	 * Reguli:
	 * 1.Parola trebuie sa contina 10 caractere
	 * 2.Parola trebuie sa contina o litera Upper case
	 * 3.Parola nu trebuie sa fie la fel ca username
	 * 
	 * Intrebam utilizatorul usernameul si parola
	 * Informam utilizatorul care sunt regulile
	 * -Dupa validam parola si informam utilizatorul ce nu a respectat din regulile de mai sus
	 * -Daca parola este valida printam: Parola propusa este valida!
	 *
	 * Spargem logica progrtamului in cat mai multe metode posibil
	 * logica de validare o tinem intr-un do-while
	 * 
	 */
	
	/*
	 * Identificam ce avem nevoie
	 * 
	 * --> ce stim
	 * 	Regulile --> metoda de informare!
	 * 	Trebuie sa intrebam uilizatorul pentru user si parola --> metoda 
	 * 
	 * --> ce trebuie sa aflam
	 *  metoda care valideaza parola
	 * 
	 * --> ce trebuie sa validam
	 * Regulie --> metoda de reguli 
	 */
	
	String username;
	//String password;
	boolean valid;
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		PasswordValidator validator = new PasswordValidator();
			
		validator.printPasswordRules();
		validator.getUsername();
		
		do {
			
			validator.checkPasswordRules(validator.getProposedPassword(), validator.username);
			
			
		}while(!validator.isValid());
		
		System.out.println("Parola propusa este valida!");

	}
	
	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa contina 10 caractere");
		System.out.println("Parola trebuie sa contina o litera Upper case");
		System.out.println("Parola nu trebuie sa fie la fel ca username");
	}
	
	public String getProposedPassword() {
		System.out.println("Introdu parola :");
		return scanner.nextLine();
	}
	
	public void getUsername() {
		System.out.println("Introdu username : ");
		username = scanner.nextLine();
		
		//return  scanner.nextLine();
	}
	
	
	public boolean isValid() {
		
		return valid;
	}
	
	
	public void checkPasswordRules(String password, String username) {
		valid = true;
		
		if(password.length() <10) {
			valid = false;
			System.out.println("Parola trebuie sa fie de cel putin 10 caractere!");
		}
		if(password.equals(password.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin o litera upper case");
		
		}
		if(password.equalsIgnoreCase(username)) {
			//password.toUpperCase().contains(username.toUpperCase())	
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca username");
		}
		
		
		
	}
	

}
