package workbook_oop;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5);
		Book b2 = new Book("Java 2.0", 40000, 3);
		Book b3 = new Book("JSP Servlet", 60000, 6);
		 
		Book[] book= {b1, b2, b3};
		
		for (int i = 0; i < book.length; i++) {
				System.out.printf("%s %d원 %.1f %% %.1f %n",book[i].getBookName(), book[i].getBookprice(), book[i].getBookDiscountRate(), book[i].getDiscountBookprice());				
		}
		int sum=0;
		for (int i = 0; i < book.length; i++) {
			sum += book[i].getBookprice();
		}
		System.out.printf("책 가격의 합 :  %d 원 %n",sum);				

		double dsum=0.0;
		for (int i = 0; i < book.length; i++) {
			dsum += book[i].getDiscountBookprice();
		}
		System.out.printf("할인 된 책 가격의 합 :  %.1f 원 %n", dsum);				

	}
}
