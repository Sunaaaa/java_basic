package day03;

import java.util.Scanner;

//성적 입력 -  Switch 문

public class Test02_switch {
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
		char grade = ' ';
/*		switch ((int)m) {
		case 100 :case 99 :case 98 : grade = 'A'; 
			break;
		
		case 89 :case 88 : grade = 'B';
			break;

		case 79 :case 78 :case 70 : grade = 'C';
			break;

		case 69 :case 60 : grade = 'D';
			break;

		default : grade = 'F';
			break;
		}*/
		switch ((int)avg/10) {
		case 10:case 9: grade = 'A'; 
		break;		
		case 8: grade = 'B';
		break;
		case 7: grade = 'C';
		break;
		case 6: grade = 'D';
		break;

		default : grade = 'F';	//59이하는 모두 F이므로 default로 처리
			break;
		}
		System.out.printf("당신의 등급은 %c 입니다. %n", grade);

		//스캐너 자원반납 코드
		if (sc!=null) {
			sc.close();
			sc= null;
		}
		
		System.out.println("Application STOP");
	} 
	
}























