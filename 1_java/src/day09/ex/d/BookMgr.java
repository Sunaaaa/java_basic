package day09.ex.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BookMgr {

	private Book[] bookList = null;

	int count = 0;

	public BookMgr() {

		bookList = new Book[10];
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

	// 중복체크

	public void addBook(Book book) {


		if (count == bookList.length) {
			Book[] temp = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
		}

		for (int i = 0; i < count; i++) {
			if(bookList[i].equals(book)) {
				System.out.println("중복");
				return;
			}
		}
		
		bookList[count] = book;

		count++;

		System.out.printf("새로운 책 [ 제목 : %s  가격 : %d ] 가 등록되었습니다.%n", book.getTitle(), book.getPrice());

	}

	// 제목과 가격 찍기

	public void printBookList() {

		System.out.println("=== 책 목록 ===");

		for (int i = 0; i < count; i++) {

			System.out.printf("책 [ 제목 : %s  가격 : %d ]%n", bookList[i].getTitle(), bookList[i].getPrice());

		}

	}

	public void printTotalPrice() {

		System.out.println("=== 책 가격의 총합  ===");

		int sum = 0;

		for (int i = 0; i < count; i++) {

			sum += bookList[i].getPrice();

		}

		System.out.println("책 가격의 총합 :" + sum);

	}

}
