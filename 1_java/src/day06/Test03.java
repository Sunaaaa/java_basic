package day06;

public class Test03 {
	public static void main(String[] args) {
		int a = 300;
		int b = 10;
		
		day06.Test03.max(a,b);
		max(a,b);
		new Test03().min(a,b);
	}
	
	//메모리에 없는 메소드 --> 메모리에 띄워야 사용 가능 --> new Test03().max(a,b)
	//+ static 키워드 추가 -> max(a,b) 가능 (클래스 이름 생략)
	public static int max(int a, int b) {
		a=1;
		return a > b ? a : b;
	}

	public static int min (int a, int b) {
		return a < b ? a : b;
	}
}
