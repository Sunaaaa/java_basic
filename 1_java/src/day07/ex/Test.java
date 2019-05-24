package day07.ex;

import day07.ex.Employee;
import day07.ex.Person;
import day07.ex.Student;
import day07.ex.Teacher;

public class Test {

	public static void main(String[] args) {
/*
		Student s = new Student("홍길동", 20, 200201);
		s.print();

		Teacher t = new Teacher("이순신", 30, "JAVA");
		t.print();

		Employee e = new Employee("유관순", 40, "교무과'");
		e.print();
*/

		Person stu = new Student("홍길동", 20, 200201);
		Person tea = new Teacher("이순신", 30, "JAVA");
		Person em = new Employee("유관순", 40, "교무과'");
		
		stu.print();
		System.out.println();
		tea.print();
		System.out.println();
		em.print();
	}
}