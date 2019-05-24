package day07.ex;

public class Test03 {
	public static void main(String[] args) {
		Person stu = new Student("홍길동", 20, 200201);
		Person tea = new Teacher("이순신", 30, "JAVA");
		Person em = new Employee("유관순", 40, "교무과");
		Object a ="";
		Test03.personPrint(stu);

		
	}
	
	public static  void personPrint(Person e ){
		e.print();
	}
}
