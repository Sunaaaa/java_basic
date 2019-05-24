package workshop_oop_class;

//import java.util.Arrays;
// 배열 인덱스 다시 확인하기
import util.Calc;
public class Test02 {
	public static void main(String[] args) {
		
		int sum=Calc.calculate(Integer.parseInt(args[0]));
		int[] a = new int[5];
		for (int i = 0, j=0; i < Integer.parseInt(args[0]); i++) {
			if(i%2==0) {
				a[j]=i;
				j++;
			}
		}
		System.out.print("짝수 : ");
		for (int i = 1; i < a.length; i++) {
			if(a[i]==0)break;
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.printf("결과 : %d",sum);
	}
}
