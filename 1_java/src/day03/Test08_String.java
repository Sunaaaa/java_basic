package day03;

public class Test08_String {
	public static void main(String[] args) {
		String msg = "hello java test !!!";
		String msg2 = "";
		StringBuilder sb = new StringBuilder();
		
//		System.out.println(msg.charAt(0) + "=>" + (char) (msg.charAt(0) - 32));
		System.out.println(msg);
		for (int i = 0; i < msg.length(); i++) {
			if (!((msg.charAt(i) >= 'A') && (msg.charAt(i) <= 'Z')||(msg.charAt(i) >= 'a') && (msg.charAt(i) <= 'z'))) {
				sb.append(msg.charAt(i));
			}
//			System.out.println(msg.charAt(i)+ "=>" + (char)(msg.charAt(i)-32));
//			System.out.print((char) (msg.charAt(i) - 32));
//			msg2 += (char)(msg.charAt(i) - 32);		// 나쁜 String  끼리의 더하기 연산
			else sb.append((char) (msg.charAt(i) - 32));
		}
		msg2 = sb.toString();
		System.out.println(msg2);

		// 소문자를 대문자로 변환 -> 변환한것을 다른 변수 (msg2)에 저장
		
		
		/*
		 * for (int i=0;i<msg.length();i++ ) { if((msg.charAt(i) >= 'a') &&
		 * (msg.charAt(i) <= 'z')) { msg.charAt(i); } }
		 * 
		 * String name = "홍길똥"; System.out.println(name);
		 * System.out.println(name.length()); System.out.println(name.charAt(0)+"**");
		 * System.out.println("**" + name.charAt(name.length()-1)); //
		 * System.out.println(name.charAt(1)+"**"); // System.out.printf("*%s*",
		 * name.charAt(1)); System.out.println(name.substring(1,3));
		 */
	}
}
