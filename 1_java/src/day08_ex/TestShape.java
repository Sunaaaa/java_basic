package day08_ex;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("원", 10.0);
		shape[1] = new Rectangle("직사각형", 10.0, 20.0);

		for (int i = 0; i < shape.length; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
	}
}
