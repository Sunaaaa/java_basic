package util;

//import java.util.Arrays;

public class Util {

	/*
	 * public static void sort(int[] a) { int tmp = 0; for (int i = 0; i < a.length
	 * - 1; i++) { int k = i; for (int j = i + 1; j < a.length; j++) { if (a[k] >
	 * a[j]) { k = j; } } // i와 min이 같은 경우는 swap을 하지 않는 조건 추가 if (a[i] != a[k]) {
	 * tmp = a[i]; a[i] = a[k]; a[k] = tmp; } } }
	 */
	
	public static int[] sort(int[] n) {
		int[] a=n.clone();
		int tmp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[k] > a[j]) {
					k = j;
				}
			}
			// i와 min이 같은 경우는 swap을 하지 않는 조건 추가
			if (i!=k) {
				tmp = a[i];
				a[i] = a[k];
				a[k] = tmp;
			}
		}return a;
	}
}
