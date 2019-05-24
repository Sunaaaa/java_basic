package day09.ex.d;

public class Prob9 {
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();

		mgr.printBookList();
		System.out.println();

		mgr.addBook(new Book("R",33000));
		System.out.println();

		mgr.printBookList();
		System.out.println();

		mgr.printTotalPrice();
	}
}
