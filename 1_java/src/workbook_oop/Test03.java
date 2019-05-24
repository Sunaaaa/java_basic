package workbook_oop;

public class Test03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{5,5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
		};
		
		int tot =0, cnt=0;
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				tot += arr2[i][j];	
				cnt++;
			}
		}
		
		System.out.printf("sum = %d %n avg = %f",tot, (double)tot/cnt);
		

	}

}
