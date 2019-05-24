package day07.ex;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.printf("이름 : %s  나이 : %d",name, age);
	}
	
	
}
