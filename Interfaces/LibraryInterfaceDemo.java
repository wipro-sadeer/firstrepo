package Interfaces;

public class LibraryInterfaceDemo {

	public LibraryInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		KidUser kid = new KidUser(10,"Kids");
		KidUser kid2 = new KidUser(18,"Fiction");
		kid.registerAccount();
		kid2.registerAccount();
		
		kid.requestBook();
		kid2.requestBook();
		
		AdultUser ad = new AdultUser(5,"Kids");
		AdultUser ad2 = new AdultUser(23,"Fiction");
		ad.registerAccount();
		ad2.registerAccount();
		
		ad.requestBook();
		ad2.requestBook();
	}

}
