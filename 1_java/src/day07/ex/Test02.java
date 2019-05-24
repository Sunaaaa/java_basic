package day07.ex;

public class Test02 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 20, 200201);
		Teacher tea = new Teacher("이순신", 30, "JAVA");
		Employee em = new Employee("유관순", 40, "교무과");
		
		Test02.personPrint(em);

		
	}
	
	public static  void personPrint(Employee e ){
		e.print();		
	}
	public static  void personPrint(Student e ){
		e.print();		
	}
	public static  void personPrint(Teacher e ){
		e.print();		
	}
}
