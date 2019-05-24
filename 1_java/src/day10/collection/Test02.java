package day10.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		list.add("sql");
		list.add("hello");
//		list.sort(null);
		String[] a = new String[list.size()];
		a = list.toArray(a);

		System.out.println("배열");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		
		Collections.sort(list);
		System.out.println(list);
	}
}
