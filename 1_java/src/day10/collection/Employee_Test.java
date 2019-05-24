package day10.collection;

public class Employee_Test {
	public static void main(String[] args) {
				/*
		Employee<String> em = new Employee<String>("길똥", "2019001");
		System.out.println(em.number.substring(0, 4));

		Employee<Integer> em2 = new Employee<Integer>("길동이", 1);
		System.out.println(em2);

		Employee em3 = new Employee("홍길동이", 2019002);
		System.out.println(em3.number);
//		System.out.println(em3.number instanceof String ? ((String)em3.number).substring(0,4):"");
*/
		Employee<String, String> emp1 = new Employee<String, String>("길동이", "2019-001");
		System.out.println(emp1);
		Employee emp2 = new Employee();
		System.out.println(emp2);
	}
}
