package workshop_polymorphism.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].toString());
		}

		System.out.println();
		System.out.println("사이즈 변결 후 정보");
		for (int i = 0; i < shape.length; i++) {
			shape[i].setResize(5);
			System.out.println(shape[i].toString());
		}
		
		

	}

}
