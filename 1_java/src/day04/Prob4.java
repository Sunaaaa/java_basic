package day04;

import java.util.Arrays;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] num = new int[6]; for (int i = 0; i < num.length; i++) { num[i] = (int)
		 * (Math.random() * 6) + 1;
		 * 
		 * for (int k = 0; k < i; k++) { if (num[k] == num[i]) { i--; break; } }
		 * System.out.println(Arrays.toString(num)); }
		 * System.out.println(Arrays.toString(num));
		 * 
		 */	
		int[] num = {1,2,3,4,9,5};
		
		
		int tmp = 0, a=0;
		for (int i = 0; i < num.length - 1; i++) {
			int k=i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[k] > num[j]) {
					k=j;
				}
			}
			//i와 min이 같은 경우는 swap을 하지 않는 조건 추가
			if(num[i]!=num[k]) {
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
