package workbook_oop;

//배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤 값이 셋팅 되었는지 출력 & 배열 데이터의 총합과 평균
public class Test04 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		
		int tot =0;
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = (int)(Math.random()*10)+1;				
			System.out.print(arr3[i] + " ");
			tot += arr3[i];
		}System.out.println();

		System.out.printf(" sum = %d %n avg = %.1f",tot, (double)tot/arr3.length);
	}

}
