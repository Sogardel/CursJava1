package curs8.package1;

public class ProtectedAccesModifier {
	
	/**
	 * Scopul lui este in acealsi pachet si subclase din pachete diferite
	 * clasele nu pot fi decalrate ca si protected
	 * 
	 * 
	 * Aceasi clasa: yes
	 * subclass in acealsi pachet : yes
	 * alta clasa in acelasi pachet : yes
	 * 
	 * Sublcasa in alt pachet : yes
	 * alta clasa in alt pachet : no
	 * 
	 * 
	 */
	
	protected String mesaj ="Protected access";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	

	public static void main(String[] args) {

		ProtectedAccesModifier obj = new ProtectedAccesModifier();
		obj.printMesaj();
		
		
	}

}
