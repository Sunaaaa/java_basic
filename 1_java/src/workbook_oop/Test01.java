package workbook_oop;

// 배열의 홀수 번째 정수의 합
public class Test01 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {
				sum+=arr[i];
			}
		}
		System.out.printf("sum = %d", sum);
	}
}
