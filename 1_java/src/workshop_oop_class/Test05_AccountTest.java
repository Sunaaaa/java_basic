package workshop_oop_class;

public class Test05_AccountTest {
	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		account.print();
		account.deposite(20000);
		account.print();
		double  ir = account.calculateInterest();
		System.out.printf("이자 : %.1f",ir);
	}
}
