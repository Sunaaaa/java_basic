package day10.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04_set_Book {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("java", 900));
		set.add(new Book("sql", 190));
		set.add(new Book("dB", 90));
		set.add(new Book("spring", 49900));
		set.add(new Book("spring", 49900));
		set.add(new Book("sql", 190));
		set.add(new Book("sql", 190));
		set.add(new Book("sql", 190));
//		System.out.println(set);

		Set<Book> set1 = new TreeSet<Book>();
		set1.add(new Book("java", 900));
		set1.add(new Book("sql", 190));
		set1.add(new Book("dB", 90));
		set1.add(new Book("spring", 49900));
		set1.add(new Book("spring", 49900));
		set1.add(new Book("sql", 190));
		set1.add(new Book("sql", 190));
		set1.add(new Book("sql", 190));
//		System.out.println(set1);
		for (Book data:set1) {
			System.out.println(data);
		}
		
		//Iterator로 순회
		Iterator<Book> it = set1.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			//System.out.println(book);		
			if(book.getTitle().equalsIgnoreCase("Spring"))
				it.remove();
		}
		System.out.println(set1);
	}
}
