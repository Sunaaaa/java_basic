package day06;

public class Test02 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccount("001");
		a1.setBalance(900);
		a1.print();
//		Account a2 = new Account();
		
		Account a2 = new Account("002",9000);
		a2.print();
		
//		String a = new String(new char[]{'a','b','c'});
//		System.out.println(a);
		Account a3 = new Account();
		a3.print();
	}
}
