package day08;

public interface Movable {
	public void move();
}

interface Drawable {
	void draw();
}

interface MovableAndDrawable extends Movable, Drawable{
	
}
/*
class Circle extends Object implements MovableAndDrawable{

	public void print() {}
	@Override
	public void move() {
		System.out.println("Circle Move");
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Draw");
		
	}
}

class Rectangle extends Object implements MovableAndDrawable{

	public void print() {}
	@Override
	public void move() {
		System.out.println("Rect Move");
	}
	
	@Override
	public void draw() {
		System.out.println("Rect Draw");
		
	}
}
*/