package day05;

public class Account {
	private static String account="123-4567-458223";
	private int balance;

	public String getAccount() {
		return account;
	}

	public static void setAccount(String account) {
		Account.account = account;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void  deposite(int money) {
		if(money != 0 && money > 0) {
			this.balance += money;
			System.out.printf("%d 원이 입금되었습니다. %n", money);
		}else {
			System.out.println("입금에 실패했습니다. 올바른 액수를 입력하세요. ");			
		}
	}
	public void  withdraw(int money) {
		if(money != 0 && money > 0) {
			if(balance >=  money) {
				this.balance -= money;
				System.out.printf("%d 원이 출금되었습니다.%n ", money);				
			}else {
				System.out.println("잔액이 부족합니다. ");			
				System.out.println("계좌이체에 실패했습니다. ");			
			}
		}else {
			System.out.println("출금에 실패했습니다. 올바른 액수를 입력하세요. ");			
		}
	}
	
	public void transfer(Account account, int money) {
		String num = account.getAccount();
		if (money != 0 && money > 0) {
			if (balance >= money) {
				this.balance -= money;
				account.setBalance(account.getBalance()+money);
				System.out.printf("계좌번호 ' %s ' 로 %d원이 이체 되었습니다. %n", num, money);
			} else {
				System.out.println("잔액이 부족합니다. ");
				System.out.println("계좌이체에 실패했습니다. ");
			}
		} else {
			System.out.println("계좌이체에 실패했습니다. 올바른 액수를 입력하세요. ");
		}
	}

	public void showAccount() {
		System.out.printf(" [ 계좌번호 : %s , 잔고 : %d ]%n", this.account, this.balance );
	}
	
}
