package day08;

import static java.lang.System.out;

import day08.Animal;
import day08.Dog;
import day08.Fish;

import static java.lang.Math.PI;
//import static java.lang.Math.random;
//import static java.lang.Math.*;

public class Test01 {
	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.random());
		out.println(Math.PI);
		out.println(PI);
//		System.out.println(random());

		System.out.println("=====================");

		Fish f = new Fish("쿠피");

		Dog d = new Dog("허스키", "케리");

		exec(f);
		exec(d);
		
		
	}
	
	public static void exec(Animal a) {
		a.breath();
		a.print();
	}
}
