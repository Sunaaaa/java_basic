package workshop_polymorphism.account;

public class AccountTest {
	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203", 500000.0, 7.3);
		
		System.out.println(account.toString());
		try {
			account.deposit(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("이자 : %.1f",account.CalculateInterest());

	}
}
