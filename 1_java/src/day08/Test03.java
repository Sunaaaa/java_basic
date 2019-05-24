package day08;

//import java.util.Stack;

import day07.ex.Student;
import day07.ex.Person;

public class Test03 {
	public static void main(String[] args) {
		Object[] obj = {
			new Fish("쿠퍼"), 
			new Dog("시베리안 허스키", "케리"),
			"Hola Java",
			new Student("000", 22 , 1),				
			new Student("000", 22 , 2)				
		};
		
		for(Object a : obj) {
			exec(a);
		}
	}
	
	public static void exec(Object a) {	
		if(a instanceof Person)((Person)a).print();
		if(a instanceof Animal)((Animal)a).print();
//		else System.out.println("");
	}
}
