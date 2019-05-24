package day06;

public class Prob6 {

	public static void main(String[] args) {
		Book b1 = new Book("Java Program", 100);
		Book b2 = new Book("JSP Program", 100);
		Book b3 = new Book("SQL Foundatals", 100);
		Book b4 = new Book("JDBC Program", 100);
		Book b5 = new Book("EJb Program", 100);
//		Book[] books = {b1,b2,b3, b4};

		BookMgr mgr = new BookMgr(20);
		mgr.addBook(b1);
		mgr.addBook(b2);
		mgr.addBook(b5);
		mgr.addBook(b3);
		mgr.addBook(b4);

		mgr.printBookList();
		mgr.printTotalPrice();
	}

}
