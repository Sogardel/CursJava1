package curs9;

public class Exception4 {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			String name = null;
			System.out.println(name.length());
			
		}catch(NullPointerException e) {			
			System.out.println("Null pointer occured!");
			System.out.println(3/0);
			System.out.println("Aritmetic exception");
			//System.exit(0);
			
		}finally {
			
			//System.out.println(3/0);
			System.out.println("Finally block of code");
			
		}
		
		System.out.println("Outside try -catch");
		
		
	}

}
