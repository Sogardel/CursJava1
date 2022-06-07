package curs7;

public class Square extends Shape{

	public Square(String color, String name) {
		super(color, name);
		
	}

	public Square() {
		
	}



	String shapeName = "Square";
	String shapeColor = "Negru";
	


	
	public void displayShapeDetails() {
		System.out.println("Shape name is  :" + super.shapeName + " and the color is :" + shapeColor );}

}
