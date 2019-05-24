package workshop_polymorphism.shape;

public class Rectangle extends Shape implements Resize{
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	public String toString() {
		return "[ 네모 : " + this.getArea() + "  " + super.getColors()+ "]";
	}

	@Override
	public double getArea() {
		return super.getWidth() * super.getHeight();
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		super.setWidth(super.getWidth()+size);
	}

}
