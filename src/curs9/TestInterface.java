package curs9;

public class TestInterface {

	public static void main(String[] args) {

		//Angajat angajat =  new Angajat();
		Tester tester = new Tester();
		tester.setName("Oana");
		tester.setEmail("oana@oana.com");
		
		System.out.println(tester.getName());
		System.out.println(tester.getDepartment());
		
		
		
	}

}
