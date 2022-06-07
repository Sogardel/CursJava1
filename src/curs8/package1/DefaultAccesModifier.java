package curs8.package1;

class DefaultAccesModifier {
	
	/**
	 * daca nu mentionam niciun acces modifier se considera default
	 * 
	 * Scopul lui este limitat la packetul in care se afla
	 * 
	 * Same class : yes
	 * Subclass in acelasi pachet : yes
	 * Alta clasa in acealsi pachet : yes
	 * 
	 * Subclasa in alt pachet : nu
	 * Alta clasa in alt pachet : nu
	 * 
	 * 
	 */
	
	String mesaj;
	
	void printMesaj() {
		System.out.println("Default modifier");
	}
	
	

}
