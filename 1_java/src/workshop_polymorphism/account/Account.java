package workshop_polymorphism.account;

// 다시 
public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double CalculateInterest() {
		return this.balance * this.interestRate / 100;
	}

	public void deposit(double money) throws Exception {
		if (money < 0)
			throw new Exception();
		balance += money;
	}

	public void withdraw(double money) throws Exception {
		try {
			if (money < 0)
				throw new Exception();
			balance -= money;
			if (balance < money)
				throw new Exception();
			balance -= money;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	@Override
	public String toString() {
		return " [계좌 정보  " + account + ",  " + balance + ",  " + interestRate + "]";
	}

}
