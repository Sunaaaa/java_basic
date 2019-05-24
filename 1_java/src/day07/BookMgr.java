package day07;

public class BookMgr {

	private Book[] booklist;
	private int count = 0;

	public Book[] getBooklist() {
		return booklist;
	}

	public BookMgr() {
		// this(10);
		booklist = new Book[3];
	}

	public BookMgr(int a) {
		this.booklist = new Book[a];
	}

	public void addBook(Book b) {
		if (count == booklist.length) {
			Book[] temp = new Book[booklist.length * 2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		booklist[count] = b;
		count++;
	}

	public void printTotalPrice() {
		int sum = 0;
		System.out.println("===책 가격===");
		for (int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.printf("전체 책 총 금액 : %d", sum);
	}

	public void printBooklist() {
		System.out.println("===책 목록===");
		for (int i = 0; i < count; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}

	public void search(String title) {
//		String sear = title.equalsIgnoreCase();
		for (int i = 0; i < count; i++) {
			if(	booklist[i].getTitle().equalsIgnoreCase(title)) {
								
			}
		}
	}

	// 검색 => 알파벳 대소문자 구분
}
