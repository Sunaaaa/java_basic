package day02;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
	int num = -90;
	System.out.println("양수 음수  0 판별후 출력");
	System.out.print("num 은 ");
	System.out.println( num>0?"양수":num<0?"음수":"0 \n");

	char ch = 'A';
	char lowerCase = ((ch >= 'A') && (ch <= 'Z')?(char)(ch+32):ch);
	char lowerCase2 = ((ch >= 'a') && (ch <= 'z')?ch: (char)(ch+32));
	String lowerCase3 = (((ch >= 'A') && (ch <= 'Z')||(ch >= 'a') && (ch <= 'z'))?(ch >= 'a') && (ch <= 'z')?String.valueOf(ch): String.valueOf((char)(ch+32)):"알파벳이 아님");
	
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);

	Scanner sc = new Scanner(System.in);
	System.out.print("***윤년 판별하기***\n");
	System.out.print("년도를 입력하세요.\n");
	int year= Integer.parseInt(sc.nextLine());
	
	String yoon = ((year%4)==0) && ((year%100)!=0)||((year%400)==0)?"윤년이 맞습니다." :"평년 입니다.." ;
	
	System.out.println( year + " 는 "+ yoon);
	sc.close();
	sc = null;
	
	}
		
}















