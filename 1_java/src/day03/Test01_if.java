package day03;

import java.util.Scanner;

//성적 입력 -  If문

public class Test01_if {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적처리 Application을 시작하려면 yes를 입력하세요. \n");
//		String msg = "YES";
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

		char grade = ' ';
		
		if(avg >= 90 && avg <=100) grade = 'A';
		else if(avg >= 80 && avg <90) grade = 'B';
		else if(avg >= 70 && avg <80) grade = 'C';
		else if(avg >= 60 && avg <70) grade = 'D';
		else grade = 'F'; 
		
		System.out.printf("당신의 등급은 %c 입니다. %n", grade);

		switch (grade) {
		case 100 : grade = 'A'; 
		case 80 : grade = 'B';
		}
		System.out.printf("당신의 등급은 %c 입니다. %n", grade);

/*
		if (avg>= 90) {
			System.out.println("A등급 입니다. ");
		}else if(avg >= 80) {
			System.out.println("B등급 입니다. ");
		}else if(avg >= 70) {
			System.out.println("C등급 입니다. ");
		}else if(avg >= 60) {
			System.out.println("D등급 입니다. ");		
		}else System.out.println("E등급 입니다. ");
*/	
		//스캐너 자원반납 코드
		if (sc!=null) {
			sc.close();
			sc= null;
		}
		
		System.out.println("Application STOP");
	} 
	
}























