package workshop_inheritance;

public class Test01 {
	public static void main(String[] args) {

		char[] a = args[0].toCharArray();
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
