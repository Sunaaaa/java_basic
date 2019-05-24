package day09;

public class Test01_em {
	public static void main(String[] args) {
		Object msg1 ="Hola Java";
		String msg2  ="Hola Java";
		
		System.out.println(msg1.toString());
		System.out.println(msg2);
		System.out.println("msg1과 msg2 비교" + msg1.equals(msg2));
		
		Object emp1 = new Employee("홍길똥","기술부");
		Employee emp2 = new Employee("홍길똥","기술부");
		Employee emp3 = new Employee("홍길똥이","기술부");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println("emp1과 emp2 비교" + emp1.equals(emp2));
		System.out.println("emp3과 emp2 비교" + emp3.equals(emp2));
	}
}
