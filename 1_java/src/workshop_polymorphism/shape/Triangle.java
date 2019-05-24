package workshop_polymorphism.shape;

public class Triangle extends Shape implements Resize{
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	
	public String toString() {
		return "[ 세모 : " + this.getArea() + "  " + super.getColors()+ "]";
	}
	
	@Override
	public double getArea() {
		return super.getArea()/2;
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		super.setHeight(super.getHeight()+size);
	}
	
}
