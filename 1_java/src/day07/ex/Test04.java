package day07.ex;

public class Test04 {
	public static void main(String[] args) {
//		String[] name;
//		int[] age;

		Person[] p = { new Student("홍길동", 20, 200201), new Student("임길동", 20, 200201),  new Teacher("이선생", 42, "SQL"),
				new Student("박길동", 20, 200203), new Teacher("고선생", 30, "JAVA"), new Student("김길동", 20, 200202),
				new Employee("유관순", 40, "교무과") };

		for (Person data : p) {
			personPrint(data);
		}
		/*
		 * for(Person data :p) { Test03.personPrint(data); }
		 */
		
		//p 배열에서 Student 만 출력
		System.out.println();
		System.out.println("-------학생/교사/직원 구분 명단 List--------");
		for (Person data : p) {
			if(data instanceof Student) {
				System.out.printf(" [학생] 이름 : %s**, 나이 : %d, 학번 : %s%n", data.getName().substring(0, 1), data.getAge(), ((Student) data).getId());							
				//Student s = (Student)p[i];	--> s로 Student의 자원 접근 가능
				
			}
//			if(data instanceof Teacher) {
//				System.out.printf(" [교사] 이름 : %s**, 나이 : %d, 학번 : %s%n", data.getName().charAt(0), data.getAge(), ((Teacher) data).getSubject());							
//			}
//			if(data instanceof Employee) {
//				System.out.printf(" [직원] 이름 : %s**, 나이 : %d, 학번 : %s%n", data.getName().substring(0, 1), data.getAge(), ((Employee) data).getDept());							
//			}
		}
	}

	public static void personPrint(Person e) {		
		e.print();
	}
}
