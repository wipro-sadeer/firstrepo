package Interfaces;

public class KidUser implements LibraryUser {
	private int age;
	String bookType;
	
	
	/*registerAccount function:
if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in
the console.
If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the
console.
requestBook function:
if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days”
should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console. */
	public KidUser() {
		// TODO Auto-generated constructor stub
	}
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		if(this.age < 12){
			System.out.println("You have successfully registered under a kid's account");
		} else if (this.age > 12){
			System.out.println("Sorry, age must be less than 12 to registrer as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Kids")){
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
