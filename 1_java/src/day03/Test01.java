package day03;

public class Test01 {
	public static void main(String[] args) {
		
		char ch = 'A';
		char lowerCase = ((ch >= 'A') && (ch <= 'Z')?(char)(ch+32):ch);
		char lowerCase2 = ((ch >= 'a') && (ch <= 'z')?ch:(char)(ch+32));		
		char lowerCase3= (!((ch >= 'A') && (ch <= 'Z')||(ch >= 'a') && (ch <= 'z'))?'N':(ch >= 'a') && (ch <= 'z')?ch:(char)(ch+32));		
//		String lowerCase4= (!((ch >= 'A') && (ch <= 'Z')||(ch >= 'a') && (ch <= 'z'))?"알파벳이 아님":(ch >= 'a') && (ch <= 'z')?String.valueOf(ch):String.valueOf(ch+32));		
		System.out.printf("%c를 소문자로 바꾸면 %c %n",ch, lowerCase);
		System.out.printf("%c를 소문자로 바꾸면 %c %n",ch, lowerCase2);
//		System.out.printf("%c를 소문자로 바꾸면 %c %n",ch, lowerCase3);
//		System.out.printf("%c --> %s %n",ch, lowerCase4);
		
/*		char a = 'A';
		char b = 'a';
		char c = 'A';
	//	System.out.printf("%c, %d, %s %n",c, (int)c, c );
		System.out.printf("%c -> %d, %s -> %d %n",'A', (int)'A', 'a', (int)'a' );
		System.out.printf("%c -> %d, %s -> %d %n",a, (int)a, b, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",a++, (int)a, b++, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",a++, (int)a, b++, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",a++, (int)a, b++, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",a++, (int)a, b++, (int)b );
/*		System.out.printf("%c -> %d, %s -> %d %n",a, (int)a, b, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",++a, (int)a, ++b, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",++a, (int)a, ++b, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",++a, (int)a, ++b, (int)b );
		System.out.printf("%c -> %d, %s -> %d %n",++a, (int)a, ++b, (int)b );
	*/	
	}
}
