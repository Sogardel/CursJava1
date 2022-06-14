package curs9;

public class TestProduct {

	public static void main(String[] args) {

		//Product produs =  new Product();
		
		Laptop laptop =  new Laptop(20, 19, 4);
		System.out.println(laptop.calculatePrice());
		laptop.printProductRating();
		
		MobilePhone mobile = new MobilePhone(40, 19);
		System.out.println(mobile.calculatePrice());
		mobile.printProductRating();
	}

}
