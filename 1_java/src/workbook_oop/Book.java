package workbook_oop;

public class Book {
	
	private String bookName;
	private int bookprice;
	private double bookDiscountRate;

	public Book() {}

	public Book(String bookName, int bookprice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookprice() {
		return this.bookprice-(this.bookprice*(this.bookDiscountRate)/100);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}
