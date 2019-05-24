package day04;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0;
		int[] num = new int[6];
		int ran = 0;
		L :for (int i = 0; i < num.length; i++) {
			ran = (int) (Math.random() * 45) + 1;
			
			for (int k = 0; k < i; k++) {
				if (num[k] == ran) {
					i--;
					continue L;					
				}
			}
			num[i] = ran;
			System.out.println(Arrays.toString(num));
			
		}
		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
		
		int tmp = 0;
		for (int i = 0; i < num.length - 1; i++) {
			int k=i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[k] > num[j]) {
					k=j;
				}
			}
			//i와 min이 같은 경우는 swap을 하지 않는 조건 추가
			if(i!=k
					) {
				tmp = num[i];
				num[i] = num[k];
				num[k] = tmp;
				a++;				
			}
			System.out.println(Arrays.toString(num));
		}

		System.out.println(Arrays.toString(num));
		System.out.println(a);
	}

}
