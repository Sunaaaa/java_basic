package day07.ex;

import day07.ex.Person;

public class Student extends Person{
	private int id;

	public Student() {}
	public Student(String name, int age) {
//		super(name, age);
	
	}

	/*
	public Student(int id) {
		super();
		this.id = id;
	}
*/
	public Student(String name, int age,  int id) {
		super(name, age);
//		super.setName(name);
//		super.setAge(age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override	
	public void print() {
		super.print();
//		System.out.printf("[학생] 학  번 : %s %n", this.id);
		System.out.printf("[학생] 학  번 : %s %n", this.id);
	}
	

}
