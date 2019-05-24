package day02;

import java.util.Date;
//데이터 타입
public class Test01 {
	public static void main(String[] args) {
		char j='a';
		j='A';
		
//		int  q = 'a'-'A';
//		System.out.println(q);
		System.out.println(j);
		
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d2 = d;
//		System.out.println(d2.toLocaleString());
		
//		d = null;
		String ss = new Date().toString();
		String sss = d.toLocaleString();
		
		System.out.println(ss);
		System.out.println(sss);
//		System.out.println(d);
//		System.out.println(d2);

		double pi = Math.PI;
		System.out.println(pi);
		double r = Math.random();
		int r1 = (int)(45 * Math.random())+1;
		System.out.println(r);
		System.out.println(r1);
//		System.out.println(Math.random());
		System.out.println(pi + "," + r + ","+ r1);

		System.out.printf("pi = %.2f, r = %.5f, r1 = %d %n", pi, r, r1);
		System.out.printf("pi = %.2f, r = %.5f, r1 = %d %n", pi, r, r1);

		String s1 = "Hola";

	}
}