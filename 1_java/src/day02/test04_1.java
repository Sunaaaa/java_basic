package day02;

public class test04_1 {
	public static void main(String[] args) {
		
		byte a =10;
		byte b = 20;
//		byte c = a+b; // ERROR  : a+b는 이미 int로 형변환 되어 계산됨 = 결과 값은 int
		byte c = (byte) (a+b); // 결과 값 자체를 byte 로 명시적 변환 
		
		System.out.println(10.0d == 10.0f);	//TRUE
		System.out.println(0.1d == 0.1f);	//FALSE : 끝 자리의 숫자가 약간 다름 
		System.out.println(10%8);
		System.out.println(10%-8);
		System.out.println(-10%8);
		System.out.println(-10%-8);
		System.out.println((char)'A'+'A');
	}
}
