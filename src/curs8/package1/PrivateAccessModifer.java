package curs8.package1;

public class PrivateAccessModifer {

	/**
	 * Scopul este limitat la clasa in care se afla
	 * clasa sau interfata nu pot declarate ca private
	 * 
	 * Aceasi clasa : yes
	 * subclass aceasli pachet : no
	 * alta clasa acelasi pachet : no
	 * subclasa alt pachet : no
	 * alta clasa alt pachet : no
	 * 
	 */
	
	private String mesaj ="Private";
	
	
	private PrivateAccessModifer() {}
	
	
	public static void main(String[] args) {

	}

}
