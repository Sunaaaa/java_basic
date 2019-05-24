package day03;

import java.util.Scanner;

//성적 입력 -  If문

public class Test07_multiScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 2; i++) {
		while(true) {
			System.out.println("성적처리 Application \n");
			System.out.println("q를 입력하면 종료됩니다. \n");
			String msg = sc.nextLine();
			
			if(msg.equalsIgnoreCase("q")) {
				if (sc != null) {
					sc.close();
					sc = null;
				}
				break;
			}
			
			System.out.println("****Application start****\n");
			System.out.println("성적을 입력하세요.\n");
			System.out.println("국어 영어 수학  \n 입력 예) 90 90 90 엔터");

			int k1 = sc.nextInt();
			int k2 = sc.nextInt();
			int k3 = sc.nextInt();
//			String a = sc.nextLine();

			double avg = 0.0;
			System.out.printf("국어 = %d,  영어 = %d, 수학 = %d %n", k1, k2, k3);
			System.out.printf("평균 = %.2f %n", avg = (k1 + k2 + k3) / 3.);

			// 등급 처리

			char grade = ' ';

			if (avg >= 90 && avg <= 100)
				grade = 'A';
			else if (avg >= 80 && avg < 90)
				grade = 'B';
			else if (avg >= 70 && avg < 80)
				grade = 'C';
			else if (avg >= 60 && avg < 70)
				grade = 'D';
			else
				grade = 'F';

			System.out.printf("당신의 등급은 %c 입니다. %n", grade);
		}
		// 스캐너 자원반납 코드
		if (sc != null) {
			sc.close();
			sc = null;
		}

		System.out.println("Application STOP");
	}

}
