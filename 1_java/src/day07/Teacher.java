package day07;

public class Teacher extends Person{
	private String subject;

	public Teacher() {}
	
	public Teacher(String name, int age, String subject) {
//		super();
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.printf("이  름 : %s  나  이 : %d  학  번 : %s%n",super.getName(), super.getAge(), this.subject);
	}
	
}
