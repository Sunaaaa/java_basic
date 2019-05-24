package day07.ex;

import day07.ex.Person;

public class Teacher extends Person{
	private String subject;

	public Teacher() {}
	public Teacher(String name, int age) {
		super(name, age);
	}
	public Teacher(String name, int age, String subject) {
		super(name, age);
//		super.setName(name);
//		super.setAge(age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("[교사] 학  번 : %s%n", this.subject);
	}
	
}
