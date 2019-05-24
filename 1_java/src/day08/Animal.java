package day08;

public abstract class Animal extends Object {
	String kind="동물의 종류"; 
	
	public Animal(){super();}
	public Animal(String kind) {
//		super(); //Object, 부모의 기본 생성자 ==> 생략가능(자동으로 추가됨)
		this.kind = kind;
	}
	public abstract void print();
	public abstract void breath();
}



