package day09.ex;

public class Prob9 {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();

		mgr.printBookList();

		mgr.addBook(new Book("Java Programming", 29000));
		mgr.printBookList();
		mgr.printTotalPrice();
	}
}
