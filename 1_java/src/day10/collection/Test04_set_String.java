package day10.collection;

import java.util.HashSet;
import java.util.Set;

public class Test04_set_String {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("hello1");
		set.add("hello3");
		set.add("hello5");
		set.add("hello8");

		System.out.println(set);
		Book b = new Book("java", 900);
		Book b2 = new Book("java", 900);
		System.out.println(new Book("java", 900).equals(new Book("java", 900)));
		System.out.println(b.equals(b2));
	}
}
