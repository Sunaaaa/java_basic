package day02;

import java.util.Scanner;
// 스캐너

public class Test03_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("국어, 영어, 수학 정보를 입력하세요.");
		System.out.println("입력 예시 )  90 90 70 입력 후 엔터");
		int k1 =sc.nextInt();
		int k2 =sc.nextInt();
		int k3 =sc.nextInt();
		sc.nextLine();  //  ** 중요 : int 뒤에 남은 엔터 처리 
		
		System.out.println("\n******** 입력정보 확인 ******** \n");
		System.out.printf("이름 : %s , 나이 : %d %n%n", name, age);
		System.out.printf(" 국어 : %d,  영어 : %d, 수학 : %s , 평균 : %.2f %n%n", k1, k2, k3, (k1+k2+k3)/3.);
		System.out.println("****************************************** \n");

		sc.close();
		sc =null;
	}

}
