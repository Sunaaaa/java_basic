package day07.ex;

import day07.ex.Person;

public class Employee extends Person{
	private String dept;

	public Employee() {}
	public Employee(String name, int age) {
		super(name, age);
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
//		super.setName(name);
//		super.setAge(age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override	
	public void print() {
		super.print();
		System.out.printf("[직원] 학  번 : %s%n", this.dept);
	}
	
}
