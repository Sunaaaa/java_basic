package BookApp_v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BookMgr {

	private List<Book> bookList;
	private int count = 0;

	public BookMgr() {

		bookList = new ArrayList<Book>();
		Scanner sc = null;

		try {

			sc = new Scanner(new File("C://lib//bookdata.txt"));
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				StringTokenizer st = new StringTokenizer(data, "/");
				addBook(new Book(st.nextToken(),Integer.parseInt(st.nextToken())));
			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일을 준비해 주세요!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("bookdata parsing error");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("생성 ");
	}

	
	public void printBooklist() {
		System.out.println("===책 목록===");
		bookList.forEach((t)->System.out.printf("책 [ 이름 : %s  가격 : %d ]%n",t.getTitle(), t.getPrice()));
	}

	public void printTotalPrice() {
		double sum = bookList.stream().mapToInt(t->t.getPrice()).sum();

		System.out.println("===책 가격===");
		bookList.forEach(t->t.getPrice());

		System.out.printf("전체 책 총 금액 : %d", sum);
	}
	
	public void addBook(Book b) {
		
		for (int i = 0; i < count; i++) {
			if(bookList.get(i).equals(b)) {
				System.out.println("중복");
				return;				
			}
		}
		bookList.add(b);
		count++;
		System.out.printf("새로운 책 [ 제목 : %s  가격 : %d ] 가 등록되었습니다.%n", b.getTitle(), b.getPrice());
	}

	public void search(String title) {
//		String sear = title.equalsIgnoreCase();
		for (int i = 0; i < count; i++) {
			if(	bookList.get(i).getTitle().equalsIgnoreCase(title)) {
				printBook(bookList.get(i));								
			}
		}
	}

	public void printBook(Book b) {
		bookList.forEach(t-> System.out.printf("책 [ 제목 : %s  가격 : %d ] %n",t.getTitle(),t.getPrice()));
	}
	
	public List<Book> getBooklist() {
		return bookList;
	}

	public void setBooklist(List<Book> booklist) {
		this.bookList = booklist;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	

}