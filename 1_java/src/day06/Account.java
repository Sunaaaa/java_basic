package day06;

/**
 * 
 * @author student
 * @slicer
 * 
 * 
 */
public class Account {
	private String account;
	private int balance;

	public Account(String account, int balance) {
		this.setAccount(account);
		this.setBalance(balance);
	}
	
	public Account() {
		this("000", 0);
//		this.setAccount("000");
//		this.setBalance(0);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0)	this.balance = balance;
	}

	public int deposite(int money) {
		if (money > 0) {
			this.balance += money;
		}
		return 0;
	}

	public int withdraw(int money) {
		if (balance >= money) {
			this.balance -= money;
			return money;
		}
		System.out.println("잔고 부족");
		return 0;
	}

	// 계좌이체
	/**
	 * 
	 * @param from  이체 금액을 보내는 계좌
	 * @param to    이체 금액을 받는 계좌
	 * @param money 이체 금액
	 */
	public static void transfer(Account from, Account to, int money) {

		from.deposite(money);
		to.withdraw(money);
		// to.withdraw(from.deposite(money));
	}

	public void print() {
		System.out.printf(" [ 계좌번호 : %20s , 잔고 : %d ]%n", account, balance);
	}
}
