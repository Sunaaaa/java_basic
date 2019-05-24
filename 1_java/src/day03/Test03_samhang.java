package day03;

import java.util.Scanner;

//성적 입력 -   삼항연산자 문

public class Test03_samhang {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리 Application을 시작하려면 yes를 입력하세요. \n");
		String msg = sc.nextLine();
	
		
		if(!(msg!=null && msg.equalsIgnoreCase("yes"))) {
			System.out.println("Application stop");
			if (sc!=null) {
				sc.close();
				sc= null;
			}
			return;				
		}
		System.out.println("****Application start****\n");		
		System.out.println("성적을 입력하세요.\n");
		System.out.println("국어 영어 수학  \n 입력 예) 90 90 90 엔터");
		
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		String a = sc.nextLine();
		
		double avg=0.0;
		System.out.printf("국어 = %d,  영어 = %d, 수학 = %d %n", k1, k2, k3);
		System.out.printf("평균 = %.2f %n", avg = (k1+k2+k3)/3.);

		//등급 처리

		double m = 87;
		char grade =((avg >= 90) && (avg == 100))?'A': 
					((avg >= 80) && (avg < 90))?'B' : 
					((avg >= 70) && (avg < 80))?'C' : 
					((avg >= 60) && (avg < 70))? 'D' : 'F';
		
		System.out.printf("당신의 등급은 %c 입니다. %n", grade);

		//스캐너 자원반납 코드
		if (sc!=null) {
			sc.close();
			sc= null;
		}
		
		System.out.println("Application STOP");
	} 
}