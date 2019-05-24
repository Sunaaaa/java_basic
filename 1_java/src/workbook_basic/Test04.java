package workbook_basic;

public class Test04 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ((ch >= 'a')&&(ch <= 'z'))||((ch >= 'A')&&(ch <= 'Z'));
		System.out.println(b);
	}
}
