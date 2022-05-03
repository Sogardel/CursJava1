package curs2;

public class StaticVsNonStatic {
	
	public static final String IP_MASINA_1 = "1.2.3";
	
	//variabila de instanta
	public String prenume;
	
	//var statice /clasa
	public static String nume;
	public static String departamanet = "QA";
	
	
	public static void main(String[] args) {
		
		//System.out.println("Hello " + nume);
		
		//System.out.println(departamanet);
		//System.out.println(nume);
		
		
		StaticVsNonStatic obj =  new StaticVsNonStatic();
		//System.out.println(obj.prenume);
		
		
		StaticVsNonStatic person =  new StaticVsNonStatic();
		person.nume = "Oana";
		System.out.println("Person " + person.nume + "  " + departamanet );
		
		StaticVsNonStatic person1 =  new StaticVsNonStatic();
		person1.nume = "Ion";
		System.out.println("Person 1 " + person1.nume + "  " + departamanet );
		System.out.println("Person " + person.nume + "  " + departamanet );

		StaticVsNonStatic person2 =  new StaticVsNonStatic();
		person2.nume = "Gigi";
		departamanet = "HR";
		
		System.out.println("---------------------------------");
		System.out.println("Person " + person.nume + "  " + departamanet );
		System.out.println("Person 1 " + person1.nume + "  " + departamanet );
		System.out.println("Person 2 " + person2.nume + "  " + departamanet );

		
	}
	
	public void printeazaNume() {
		System.out.println("Hello  " + nume);
	}
	

	
	
	
	
	
	
	
	
	

}
