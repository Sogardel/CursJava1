package curs2;

public class TestRectangle {

	public static void main(String[] args) {

		
		Rectangle room = new Rectangle();
		//1. Declararea unei variabile de referinta 
		// Rectangle room
		//2. Crearea obiectului
		// new Rectangle()
		//3. legarea variabilei de obiectul creat
		// = 
		
		room.setLenght(5);
		//room.width = 3;
		room.setWidth(5);
		
		System.out.println(4); //int
		System.out.println("4");// String
		System.out.println('c'); //char
		
		
		Rectangle room1 = new Rectangle();
		//room1.setLenght(5);
		room1.setWidth(5);
		
		Rectangle room2 =  new Rectangle(3, 4);
		
		Rectangle room3 =  new Rectangle(3, 4, "Baie");
		
		

	}

}
