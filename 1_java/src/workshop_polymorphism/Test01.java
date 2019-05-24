package workshop_polymorphism;

public class Test01 {
	public static void main(String[] args) {
	
		int data = Integer.parseInt(args[0]);
		if(data >=5 && data <=10) {
			Calc c = new Calc();
			System.out.println(c.calculate(data));			
		}
		else System.out.println("5~10 사이의 정수를 다시 입력하세요.");
	}
}
