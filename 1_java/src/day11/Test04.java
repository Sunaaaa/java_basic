package day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test04 {
	public static void main(String[] args) {
		String[] names = {"hong GD", "lee JK","Ko", "javains"};
		List<String> nn = Arrays.asList(names);
		
		nn.forEach(t-> System.out.println(t.toUpperCase()));
		System.out.println();
		System.out.println("=====");
		
		nn.stream().filter(t->t.length()>5).forEach(t-> System.out.print(t.toUpperCase()+" , "));
		System.out.println();
		System.out.println("=====");
		

		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
		System.out.println();
		System.out.println("=====");
		
	}
}
