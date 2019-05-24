package day08;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public void print() {
		System.out.printf("사각형의 면적은 %.1f %n", super.area);
	}
	
	@Override
	public void calculationArea() {
		super.area = (this.width * this.height);
//		System.out.println((this.width * this.height));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}

