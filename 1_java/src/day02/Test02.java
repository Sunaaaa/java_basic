package day02;
//형변환
public class Test02 {
	public static void main(String[] args) {
		
//		int j = Integer.parseInt("90");
		double j = Integer.parseInt("90");
		double y = Double.parseDouble("89.9");
		double temp;
		System.out.printf("j = %.1f, y = %.2f %n",j, y);
		
		temp=j;
		j=y;
		y=temp;
		

		System.out.printf("j = %.1f, y = %.2f",j, y);
	}
}
