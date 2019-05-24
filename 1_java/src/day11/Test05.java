package day11;

import java.util.ArrayList;
import java.util.List;

import day09.ex.Book;

public class Test05 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Java", 500));
		books.add(new Book("SQL", 5200));
		books.add(new Book("Servlet & Jsp", 2500));
		books.add(new Book("html5", 1500));
		books.add(new Book("Java", 500));
		books.add(new Book("Java", 500));

//		books.forEach(t->System.out.println(t.getTitle().charAt(0) + t.getTitle().substring(1, t) +"/" + t.getPrice()));
		books.forEach(t -> System.out.println(t.getTitle().charAt(0) + "** /" + t.getPrice()));
		System.out.println();

		books.stream().forEach(t -> System.out.println(t.getTitle().charAt(0) + "** /" + t.getPrice()));

		//중복제거
		books.stream().distinct().forEach(t -> System.out.println(t.getTitle().charAt(0) + "** /" + t.getPrice()));
		System.out.println();

		long cnt= books.stream().filter(t->t.getPrice()>=5000).count();
		System.out.println(cnt);
		
	//	books.stream().max((t,u)-> System.out.println());

		long sum= books.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println(cnt);
	}
}
