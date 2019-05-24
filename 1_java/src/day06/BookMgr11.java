package day06;

public class BookMgr11 {
	private Book[] booklist = new Book[6];

	public BookMgr11() {
		

	}

	
	public BookMgr11(Book[] books) {
		this.booklist = books;
	}

	public void addBook(Book b) {
		/*
		 * if (booklist == null) booklist[0] = b;
		 */
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i] == null) {
				booklist[i] = new Book(b.getTitle(), b.getPrice());
				System.out.println("책이 추가되었습니다.");
			}
		}		
	}

	public void printBookList() {
		if (booklist != null) {
			for (int i = 0; i < booklist.length; i++) {
				System.out.println(booklist[i].getTitle());
				if(booklist[i]==null)break;
			}
		} else
			System.out.println("책 목록이 비어있습니다.");
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i<booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("=== 책 가격의 총합 ===");
		System.out.printf("전체 책 가격의 합 : %d %n", sum);
	}
	
}
