package workshop_oop_class;

//결과 화면과 동일하게 다시 해보기 ==> 결과 값은 나옴
public class Test03 {
	public static void main(String[] args) {
		if(Integer.parseInt(args[0])>5 || Integer.parseInt(args[0])<1) {
			System.out.println("1~5 사이의 정수를 입력하세요.");
			return;
		}
		
		int sum=0;
		for (int i =Integer.parseInt(args[0]); i <= 10; i++) {
			if(!(i%3==0 || i%5==0)) {
				sum+=i;
				System.out.print(i +" ");
			}
		}
		System.out.println();
		
		System.out.println(sum);
	}
}
