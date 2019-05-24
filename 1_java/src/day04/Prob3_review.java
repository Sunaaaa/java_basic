package day04;

public class Prob3_review {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
//			c=((c >= 'a') && (c <= 'w'))?(char)(c+3):((c >= 'a') && (c <= 'w'))?(char)(c-23):c;
			c = ((c >= 'a') && (c <= 'w')) ? (char) ('a' + ((c - 'a') + 3) % 26) : c;
			sb.append(c);

		}
		encodedString = sb.toString();

		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}
