package day06;

import util.Calc;

public class AccountTest {
	public static void main(String[] args) {
//		Account a1 = new Account("123123123 123 123 123", 1000);
		Account a1 = new Account();
		a1.print();
		

//		Account b1 = new Account("2", 0);

		Account b1 = new Account();
		b1.print();
		
		Account.transfer(b1, a1, 1000);
		a1.print();
		b1.print();
		
		int s = Calc.add(2,4,6,8,10);
	}
}
