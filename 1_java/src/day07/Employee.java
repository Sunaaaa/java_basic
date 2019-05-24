package day07;

public class Employee extends Person{
	private String dept;

	public Employee() {}
	public Employee(String name, int age, String dept) {
//		super();
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.printf("이  름 : %s  나  이 : %d  학  번 : %s%n",super.getName(), super.getAge(),  this.dept);
	}
	
}
