package curs8.package2;

import curs8.package1.ProtectedAccesModifier;

public class SubClassProtectedAccesModifier extends ProtectedAccesModifier{

	//* Sublcasa in alt pachet : yes
	
	
	public static void main(String[] args) {
		
		
		SubClassProtectedAccesModifier obj = new SubClassProtectedAccesModifier();
		obj.printMesaj();

	}

}
