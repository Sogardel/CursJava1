package curs8.package3;

public class TestAnimal {

	public static void main(String[] args) {

		
		Animal animal =  new Animal();
	//	animal.makeSound();
		
		System.out.println("-----------------------");
		
	//	Deer bambi = new Deer();
	//	bambi.makeSound();
	//	bambi.eatGrass();
		
		System.out.println("-----------------------");

	//	Lion simba =  new Lion();
	//	simba.makeSound();
	//	simba.eatMeat();
		
		System.out.println("-----------------------");

		
		Animal simba = new Lion();
		simba.makeSound();
		((Lion) simba).eatMeat(); //Lion simba ! Animal simba
		feedAnimal(simba);

		simba = new Deer();
		simba.makeSound();
		((Deer)simba).eatGrass();
		feedAnimal(simba);
		
	}
	
	public static void feedAnimal(Animal obiect) {
		
		if(obiect instanceof Lion) {
			
			System.out.println("you are getting burgers!");
			
		}else if(obiect instanceof Deer) {
			
			System.out.println("you are getting salad!");
			
		}
		
	}
	
	
	

}
