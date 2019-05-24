package day02;

public class Prob2_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5 || x < 0 && x > 2);     //
		System.out.println( !('A' <= c && c <='Z') );     //F
		System.out.println('C'-c);                        //2
		System.out.println('5'-'0');                      //5
		System.out.println(c+1);                         //66
		System.out.println(++c);                          //'B'
		System.out.println(c++);                          //'B'
		System.out.println(c);                            //'C'
	}
} 