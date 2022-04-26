package curs1;

public class CalculatorSalariu {

	int nrLucrate = 40;
	
	
	public static void main(String[] args) {

		Tester tester1 =  new Tester();
				
		tester1.setNume("Oana");
		tester1.setRatePerHour(25);
		
		System.out.println(tester1.getNume());
		System.out.println(tester1.getRatePerHour());

		Tester tester2 =  new Tester();
		
		tester2.setNume("Ion");
		tester2.setRatePerHour(20);
		
		System.out.println(tester2.getNume());
		System.out.println(tester2.getRatePerHour());
		
		
		CalculatorSalariu calc =  new CalculatorSalariu();
		System.out.println(calc.calculeazaSalariu(tester1.getRatePerHour()));
		
		System.out.println("Salariul lui " + tester1.getNume() + " este de " + calc.calculeazaSalariu(tester1.getRatePerHour()) );
		
		
	}
	
	public int calculeazaSalariu(int rateHour) {
		
		int salariu = nrLucrate * rateHour;
				
				
		return salariu;
	}

}
