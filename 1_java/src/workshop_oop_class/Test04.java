package workshop_oop_class;

public class Test04 {
	public static void main(String[] args) {
//	while(true)
		if (Integer.parseInt(args[0]) > 5 || Integer.parseInt(args[0]) < 1 
				|| Integer.parseInt(args[1]) > 5 || Integer.parseInt(args[1]) < 1) 
		{
			System.out.println("숫자를 확인하세요.");
			return;
		}
		int[][] a = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]= (int)(Math.random()*5)+1;
			}
		}
		
		double sum=0.0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.printf("sum=%.1f %n",sum);
		System.out.printf("avg=%.1f",sum/a.length);
		
		
	}
}
