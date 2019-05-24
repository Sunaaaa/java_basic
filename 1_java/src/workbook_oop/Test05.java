package workbook_oop;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.nextLine();
		
		Calc cal = new Calc();
		double avg = cal.calcSum(a, b, c, d)/4.;
		System.out.printf("Sum : %d %n Avg : %.2f %n",cal.calcSum(a, b, c, d), avg);

		switch((int)(avg/10)) {
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8 : case 7 :
			System.out.println("B학점");
			break;
		case 6 : case 5 :
			System.out.println("C학점");
			break;
		case 4 : case 3 :
			System.out.println("D학점");
			break;
			default : System.out.println("F학점");
			break;
		}
		sc.close();		
		sc= null;

	}
}
