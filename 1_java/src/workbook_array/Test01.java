package workbook_array;

public class Test01 {
	public static void main(String[] args) {
		int inx = 15;
		if (inx > 10 && inx < 20) {
			System.out.println("true");
		}

		char ch1 = ' ';
		if (!(ch1 != ' ' || ch1 != '\t')) {
			System.out.println("true");
		}

		char ch2 ='x';
		if (ch1=='x' || ch1=='X') {
			System.out.println("true");
		}

		char ch3 = '0';
		if (ch3 >= '0' && ch3 <= '9') {
			System.out.println("true");
		}

	}
}
