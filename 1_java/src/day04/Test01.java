package day04;

import java.util.Arrays;

//학생 이름 -> 성적 -> 전체 평균 출력 
public class Test01 {
	public static void main(String[] args) {
		int count;

//		System.out.println(count);	--> 초기화 하지 않아서 ERROR 발생

		double m = 0.0;
		int[] jumsu; // 배열 선언
		jumsu = new int[5]; // 생성 -> int 타입의 5개 공간

		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 77;
		jumsu[3] = 70;
		jumsu[4] = 50;

		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
			;
		}

		System.out.println();
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu));

		int[] num = { 88, 55, 77, 99, 77, 33 };
		System.out.println(Arrays.toString(num));

		String[] names;
		names = new String[5];
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		names[3] = "";

		System.out.println(Arrays.toString(names));

		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += jumsu[i];
		}
		m = sum / names.length;

		for (int i = 0; i < names.length; i++) {
			if (names[i] != null && names[i].length() > 0) {
//				System.out.println(names[i].charAt(0)+"** : " + jumsu);
				System.out.printf("%s ** : %3d %n", names[i].charAt(0), jumsu[i]);
			} else
				System.out.printf("이름 없음 : %3d %n", names[i], m);

		}

		System.out.println("학생 평균 점수" + m);

		/*
		 * for (int i=0; i < names.length; i++) { m+=jumsu[i]; } m /= names.length;
		 * System.out.println(m);
		 */
	}
}
