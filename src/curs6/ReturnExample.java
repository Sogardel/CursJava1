package curs6;

public class ReturnExample {

	
	public static void main(String[] args) {

		ReturnExample obj =  new ReturnExample();
		obj.caluclateNr(3, 20);
		obj.calculateNr(4, 20);
		
		System.out.println("-------------------------");
		//System.out.println(obj.caluclateNr(3, 20));
		System.out.println(obj.calculateNr(4, 20));
		
		//int sum =  2 + obj.caluclateNr(3, 20);
		int sum2 =  2 + obj.calculateNr(4, 20);
	}
	
	public void caluclateNr(int num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	
	public int calculateNr(int num1, int num2) {
		
		
		return num1 + num2;
	}
	
	/*
	 * ContactPage.class --> pageObjects --> locatori si metode din pagina de contacts
	 * 
	 *  public ContactPage navigateToContacts(){
	 *  
	 *   return new ContactPage();
	 *   
	 *  }
	 *  HOmePage homePage = new HomePage();
	 *  homePage.clickOnContactsLink;
	 *   ConatctPage contactPage =  new ContactPage()
	 *   
	 *   
	 *    contactPage = navigateToContacts();
	 *    contactPage....
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

}
