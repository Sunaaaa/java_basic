package workshop_polymorphism;

import java.util.Scanner;

public class EvaluationTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("부서 이름과 5개의 점수를 입력하세요.");
		System.out.println("예 ) 금융사업부 80.0 90.0 99.0 70.0 100.0");
		Scanner sc = new Scanner(System.in);
		String dname = sc.next();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();

		System.out.println(dname);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
//		if (!sc.hasNext()) {
			if (a < 10 || a > 100 || b < 10 || b > 100 || c < 10 || c > 100 || d < 10 || d > 100 || e < 10 || e > 100) {
				System.out.println("5~100사이의 숫자로 다시 입력하세요.");
				sc.close();
				sc = null;
				return;
			}

			Department dept = new Department(dname, a, b, c, d, e);
			System.out.println(dept.getEvaluationA());
			System.out.println(dept.getEvaluationB());
			System.out.println(dept.getEvaluationC());
			System.out.println(dept.getEvaluationD());
			System.out.println(dept.getEvaluationE());

			sc.close();
			sc = null;
/*		} else {
			System.out.println("예시와 같이 다시 입력하세요.");
			sc.close();
			sc = null;
			return;

		}
*/	}

}
