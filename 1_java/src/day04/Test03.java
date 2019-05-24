package day04;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String msg="hello java programming ~~~~~~~~~~";
		
		char[] c;
//		c= new char[10];
		c= new char[msg.length()];
		
		int cnt=0;
		for(int i=0; i<c.length; i++) {
			c[i]=msg.charAt(i);
		}
		System.out.println("=================================");
		for(char data:c) {
			System.out.println(data);			
		}
		System.out.println(Arrays.toString(c));
		
		//n1보다 2배 큰 크기의 n2
		int[] n1= {1,2,3};
		int[] n2= new int[n1.length*2];
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.arraycopy(n1, 0, n2, 1, n1.length);
		System.out.println(Arrays.toString(n2));
		
		for	(int data:n2) {
			System.out.println(data);			
		}
		
		char[] s= "SQL".toCharArray();
		System.out.println(Arrays.toString(s));
		
		String[] s3 = {"java", "sql", "cent os", "R", msg};	//String 변수도 넣을 수 있음
		for (String data : s3) {
			if (data.length()>5) {
				System.out.println(data);
			}
		}
	}
}