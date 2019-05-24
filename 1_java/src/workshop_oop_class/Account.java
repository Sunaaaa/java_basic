package workshop_oop_class;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void accountInfo() {
		System.out.printf("계좌 정보 : %s  현재 잔액 : %d 이자율 : %.1f %% ",this.account, this.balance, this.interestRate);
	}
	
	public double calculateInterest() {
		return this.balance * this.interestRate/100;
	}
	
	public void deposite(int money) {
		if(money!=0)this.balance+=money;
	}
	
	public void withdraw(int money) {
		if(money<=this.balance) {
			this.balance-=money;
		}
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
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void print () {
		System.out.printf("계좌 정보 : %s  현재 잔액 : %d %n",this.account, this.balance);
	}
	
}
