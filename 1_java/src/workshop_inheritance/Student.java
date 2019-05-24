package workshop_inheritance;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getHeight() {
		return this.height;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
