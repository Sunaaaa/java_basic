package day07;

//SingleTon
public class test02 {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println( s1 == s2);
		System.out.println( s1);
		System.out.println( s2);

		s1.a = 10;
		
		System.out.println( s1.a );
		
	}
}

class Singleton{
	public static int a =10;
	static Singleton s = new Singleton();	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (s==null) {
			return new Singleton();			
		}
		else return s;
	}
}
