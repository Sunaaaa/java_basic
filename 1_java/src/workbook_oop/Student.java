package workbook_oop;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}
	public Student(String n, int k, int e, int m,  int s) {
		this.name = n;
		this.korean = k;
		this.english = e;
		this.math = m;
		this.science = s;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public double getAvg() {
		return (this.english + this.korean + this.math + this.science)/4.;
	}
	public String getGrade() {
		switch((int)(this.getAvg()/10)) {
		case 10: case 9:
			return "A학점";
		case 8 : case 7 :
			return "B학점";
		case 6 : case 5 :
			return "C학점";
		case 4 : case 3 :
			return "D학점";
			default : 
				return "F학점";
		}
	}
}
