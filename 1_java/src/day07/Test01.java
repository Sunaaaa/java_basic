package day07;

public class Test01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("아반떼", "블루우우우우우우우");
		Car c3 = new Car(c2);

		c1.print();
		c2.print();
		c3.print();

		c1 = null;
		c2 = null;
		c3 = null;
		
		Car c4 = new Car(null);
		c4.print();
	}
}

class Car {
	String color;
	String kind;

	public Car() {
	}

	public Car(String color, String kind) {
		this.color = color;
		this.kind = kind;
	}

	public Car(Car c) {
		this(c.color, c.kind);	
	}

	public void print() {
		System.out.printf("자동차 [ %s , %s ] %n", kind, color);
	}

}
