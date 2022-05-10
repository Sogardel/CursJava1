package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {

		//num++   -->Post increment
		//num =  num+1
		//++num  --> Pre increment
		//num = num+1
		System.out.println("----------------POST------------------------");

		int num = 10;
		System.out.println("Valoarea lui num inainte de increment :" + num);
		System.out.println("Valoarea lui num in post increment :" + num++); //num =  num+ 1 //num = 10+1
		System.out.println("Valoarea lui num DUPA post increment :" + num);
		
		System.out.println("----------------PRE------------------------");
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment :" + num2);
		System.out.println("Valoarea lui num in pre increment :" + ++num2); //num =  num+ 1 //num = 10+1
		System.out.println("Valoarea lui num DUPA pre increment :" + num2);		
		
		//pre increment
		++num;
		//post increment
		num++;
		//pre decrement 
		--num;
		//post decrement
		num--;
		
		//for(int x = 0; i<10; i++){}
		
		//int x = 0;
		//while(i<10){
		//i++;
		//sysprint(i)
		//i++;
		//}
		
		
		
		
	}

}
