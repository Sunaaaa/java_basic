package workshop_polymorphism;

public class Calculator {
	public double plus(int a, int b) {
		return (double) (a + b);
	}

	public double minus(int a, int b) {
		return (double) (a - b);
	}

	public double multiplication(int a, int b) {
		return (double) (a * b);
	}

	public double divide(int a, int b) {
		double d =0.0;
		try {
			d = (double)(a/b);

		} catch (Exception e) {
			System.out.println("EXCEPTION이 발생하였습니다. 다시 입력해 주세요.");
			return 0.0;
		}return d;
	}

}
