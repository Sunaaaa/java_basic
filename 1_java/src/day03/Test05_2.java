package day03;

public class Test05_2 {
	public static void main(String[] args) {
		
		int sum=0;
		

		System.out.println("*********구구단*********\n");
		
/*	
		for (int j=1; j<=9;j++) {
			for (int i=2; i<=9; i++) {
			System.out.printf(" %d * %d=%2d |", i, j, i*j);				
			}
			System.out.println("\n");
		}	*/
		
		OUT : for (int i=1; i<=9; i++) {
			for (int j=2; j<=9;j++) {
//				if(j==5)break;	//5단 이후는 처리하지 않고 나감
//				if(j==5)continue; //5단만 처리하지 않음, 5단이면 빠져나가서 j++수행한다.
//				if(j==5)break OUT; // OUT이라는 For loop를 빠져 나옴
				System.out.printf(" %d * %d=%2d |", j, i, i*j);				
			}
			System.out.println("\n");
		}
	}
}
