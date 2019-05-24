package polymorphism;

public class Test_Car {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		
		fe.water();
		car = fe;
		((FireEngine)car).water();
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
