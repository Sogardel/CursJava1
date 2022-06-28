package curs11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesterArrayList {

	public static void main(String[] args) {

		Tester t1 = new Tester("Oana", 22, "QA");
		Tester t2 = new Tester("Ion", 33, "DEV");
		Tester t3 = new Tester("Maria", 25, "QA");
		
		List<Tester> testerList = new ArrayList<>();
		
		testerList.add(t1);
		testerList.add(t2);
		testerList.add(t3);

		System.out.println(testerList.get(0).nume);
	
		
		for(Tester t : testerList) {
			System.out.println(t.nume + " | " + t.age + " | " + t.departament );
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Tester> it =  testerList.iterator();
		while(it.hasNext()) {
			Tester tes =  it.next();
			System.out.println(tes.nume + " | " + tes.age + " | " + tes.departament );

		}
	}

}
