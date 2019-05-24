package workbook_array;

public class Test05 {
	public static void main(String[] args) {
		int i=0, j=1, k=0, cnt=0;
		for(i=2; i<=9; i+=3) {
			for(int q=0;q<3;q++ ) {
				int c=0;
				for(j=1, k=i; c<3;k++) {
					System.out.printf("%d * %d =%2d ",k,j,k*j);
				}
				if(cnt%3==1)System.out.println();
			}
			if(cnt%3==0)System.out.println();
		}
		
	}
}
