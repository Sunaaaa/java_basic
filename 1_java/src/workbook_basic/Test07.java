package workbook_basic;

public class Test07 {
	public static void main(String[] args) {
//		int i=54;
		int i = Integer.parseInt(args[0]);
		String result= (i%2==0)?"짝수":"홀수";
		System.out.println("선언 변수 " + i + " 일 때 결과 :\n숫자 " +i+ "는 " + result + "입니다.");
	}
}
