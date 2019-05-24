package day07;

public class Student extends Person{
	private int id;

	public Student() {}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(String name, int age,  int id) {
//		super();
		super.setName(name);
		super.setAge(age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.printf("이  름 : %s  나  이 : %d  학  번 : %s %n",super.getName(), super.getAge(), this.id);
	}
	

}
