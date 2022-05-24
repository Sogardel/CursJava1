package curs6;

public class ArrayExample2 {
	
	public static void main(String[] args) {
		
		Fructe obj = new Fructe("Mar", 150);
		obj.printDetails();
		
		Fructe[] fructe = new Fructe[4];
		fructe[0] = new Fructe("Banana", 256);
		fructe[1] = new Fructe("Cireasa", 15);
		fructe[2] = new Fructe("Para", 180);
		fructe[3] = obj;
		
		fructe[2].printDetails();
		
		
		//Array care contine obiecte String --> String[] numeArray --> for(String element : numeArray)
		
		//Array care contine obiecte Fructe
		//		Fructe[] fructe = new Fructe[4];
		//      Fructe[] fructe = {null, null, null, null};
		//      Fructe[] fructe = {fructe[0], fructe[1], fructe[2], fructe[3]};
		//      fructe[0] = new Fructe("Banana", 256);
		//	     Fructe[] fructe = {obiectBanana, fructe[1], fructe[2], fructe[3]};
		//		fructe[1] = new Fructe("Cireasa", 15);
		//	     Fructe[] fructe = {obiectBanana, obiectCireasa, fructe[2], fructe[3]};

		//for(Fructe obj : fructe) {  
		//     	  obj.printDetails(); -->		fructe[0].printDetails(); --> fructe[0] == obiectBanana
		//			obiectBanana.nume = "Avocado";
					
		//
		//}
		
		
		
		for(Fructe fruct: fructe) {
			
			fruct.printDetails();
		}
		
	}

}
