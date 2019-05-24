package day02;

import java.util.Scanner;

public class Test04_Operation {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
//		System.out.println(++num);
		System.out.println(num++);
//		System.out.println(num);
		
		Scanner sc = null;
		String msg = "Hola";
		String msg2 = "Hola";
		
		boolean flag = (num < 15) && (msg.length()>0);
		System.out.println(flag);
		
		System.out.println("***********************************************************");		
		System.out.println(num ==msg.length() );
		System.out.println(msg.equals(msg2));	//True
		System.out.println(msg==msg2);		//True
		System.out.println("***********************************************************");
		String s1 = new String("hola");
		String s2 = new String("hola");
		
		System.out.println(s1 ==s2 );	//False (s1과 s2의 주소 값 비교)
		System.out.println(s1.equals(s2));	//True (s1과 s2가 ref하는 값을 비교 )

		System.out.println(4  <<  2);
		System.out.println(4  >>  1);
		System.out.println(4  & 1);
		
		sc = new Scanner(System.in); 
		System.out.println("점수를 입력하세요.");
		int jumsu = sc.nextInt();
		sc.nextLine(); // 엔터 처리 
		
		System.out.println("***유효성 검증***");
		if( !( (jumsu >=0) &&( jumsu<=100) )) {
			System.out.println("유효하지 않은 점수");
			sc.close();
			return;
		}
		System.out.println( jumsu >=80?"Pass": "No Pass");
		sc.close();		
		sc= null;
		System.out.println("END");

		
	}

}
