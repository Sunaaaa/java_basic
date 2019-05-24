package day06;


public class BookMgr {

	private Book[] booklist;

	private int count;

	

	public BookMgr() {

		this(10);

	}

 

	public BookMgr(int s) {

		this.booklist = new Book[s];

		count = 0;

	}

 

	public BookMgr(Book[] b) {

		this.booklist = new Book[b.length];

		for(int i=0; i<booklist.length; i++) {

			booklist[i] = null;

		}

	}

	

	public void addBook(Book b) {

		booklist[count] = b;

		count++;

	}

	

	public void printBookList() {

		if(booklist[0]==null)System.out.println("비어있습니다.");

		for(int i=0; i<booklist.length; i++) {

			if(booklist[i]==null) {

				break;

			}

			System.out.println(booklist[i].getTitle());

		}

		

	}

	

	public void printTotalPrice() {

		int sum=0;

		for(int i=0; i<booklist.length; i++) {

			if(booklist[i]==null) {

				break;

			}

			sum+=booklist[i].getPrice();

		}		

		System.out.println("===책 가격의 총합===");

		System.out.printf("전체 책 가격의 합 : %d",sum);

	}

 

	public Book[] getBooklist() {

		return booklist;

	}

 

	public void setBooklist(Book[] booklist) {

		this.booklist = booklist;

	}

 

	public int getCount() {

		return count;

	}

 

	public void setCount(int count) {

		this.count = count;

	}

	

	

}

