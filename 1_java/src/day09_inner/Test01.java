package day09_inner;

class A {
	String name = "홍길똥";

	void print() {
		new B().print();
	}
	
	class B {
		void print() {
			System.out.println(name);
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.print();
		
		A.B b = new A().new B();
		b.print();
		
	}

}
