package day08_ex;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
		super();
	}
	public Circle(double r) {
		this.radius = r;
	}
	public Circle(String name, double r) {
		super(name);
		this.radius = r;
	}
	
	public void print() {
		System.out.printf("원의 면적은 %.13f %n", super.getArea());
	}
	
	@Override
	public void calculationArea() {
		super.setArea(radius * radius * Math.PI);
		//	super.area = Math.PI*this.radius* this.radius ;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}

