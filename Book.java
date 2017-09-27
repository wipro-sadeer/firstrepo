
public class Book {

	private String bookTitle;
	private String authour;
	private int isbnCode;
	private double originalPrice;
	private double finalPrice;
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public int getIsbnCode() {
		return isbnCode;
	}
	public void setIsbnCode(int isbnCode) {
		this.isbnCode = isbnCode;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Book(String bookTitle, String authour, int isbnCode,
			double originalPrice, double finalPrice) {
		//super();
		this.bookTitle = bookTitle;
		this.authour = authour;
		this.isbnCode = isbnCode;
		this.originalPrice = originalPrice;
		this.finalPrice = finalPrice;
	}
	public Book(String bookTitle, String authour, int isbnCode,
			double originalPrice) {
		//super();
		this.bookTitle = bookTitle;
		this.authour = authour;
		this.isbnCode = isbnCode;
		this.originalPrice = originalPrice;
	}
	public Book(String bookTitle, String authour) {
		//super();
		this.bookTitle = bookTitle;
		this.authour = authour;
	}
	public double getDiscountedPrice(int employeeNum){
		return this.finalPrice*0.8;
	}
	public double getDiscountedPrice(String nash){
		return this.finalPrice*0.9;
	}
	
}
