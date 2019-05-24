package day03;

public class Prob3 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <sourceString.length(); i++) {
			if (!((sourceString.charAt(i) >= 'A') && (sourceString.charAt(i) <= 'Z')||(sourceString.charAt(i) >= 'a') && (sourceString.charAt(i) <= 'z'))) {
				sb.append(sourceString.charAt(i));
			}
			else if ((sourceString.charAt(i) >= 'a') && (sourceString.charAt(i) <= 'w')) {
					sb.append((char)(sourceString.charAt(i)+3));
				}else sb.append((char)(sourceString.charAt(i)-23));
		}
		encodedString = sb.toString();
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}
