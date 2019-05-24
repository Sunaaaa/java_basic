package day07;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMgr mgr = new BookMgr();
		
		mgr.addBook(new Book("JAVA Program", 500));
		mgr.addBook(new Book("JSP Program", 800));
		mgr.addBook(new Book("JAVA Program", 500));
		mgr.addBook(new Book("JSP Program", 800));
		mgr.addBook(new Book("JAVA Program", 500));
		mgr.addBook(new Book("JSP Program", 800));
		mgr.printBooklist();
		mgr.printTotalPrice();
	}

}
