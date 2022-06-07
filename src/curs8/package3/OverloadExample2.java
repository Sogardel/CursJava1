package curs8.package3;

public class OverloadExample2 {
	
	
	public static void main(String[] args) {
		
		System.out.println(days(1));
		System.out.println(days("L"));
		
	}

	public static String days(int day) {
		
		switch(day) {
		case 1:
			return "Luni";
		case 2:
			return "Marti";
		case 3:
			return "Miercuri";
		case 4:
			return "Joi";
		case 5 :
			return "Vineri";
		case 6:
			return "Sambata";
		case 7:
			return "Duminica";
		default:
			return "Nr invalid";
			
		}
		
	}
	
	public static int days(String day) {
		
		switch(day) {
		case "L":
			return 1;
		case "M":
			return 2;
		case "Mi":
			return 3;
		case "J":
			return 4;
		case "V" :
			return 5;
		case "S":
			return 6;
		case "D":
			return 7;
		default:
			return 0;
			
		}
		
		
	}
	
	
}
