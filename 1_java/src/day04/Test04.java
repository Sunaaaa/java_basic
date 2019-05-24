package day04;

// 문자열의 내용을 역순으로 출력
public class Test04 {
	public static void main(String[] args) {
		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };
	
		for (String data : strData) {
			if (strData.length != 0) {
				for (int i = data.length() - 1; i >= 0; i--) {
					System.out.print(data.charAt(i));
				}
				System.out.print("\n");
			}
		}
	}
}
