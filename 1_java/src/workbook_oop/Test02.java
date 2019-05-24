package workbook_oop;

//배열에 담긴 모든 값의 총합과 평균
public class Test02 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30,},
		};
		int tot =0, cnt=0;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				tot += arr2[i][j];	
				cnt++;
			}
		}
		
		System.out.printf(" total = %d %n average = %.2f",tot, (double)tot/cnt);

	}

}
