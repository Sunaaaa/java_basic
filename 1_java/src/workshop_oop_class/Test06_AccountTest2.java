package workshop_oop_class;

public class Test06_AccountTest2 {

	public static void main(String[] args) {
		Account[] a = new Account[5];
		double ir=0.0;
		
		for (int i = 0; i < a.length; i++) {
			a[i]= new Account("221-0101-211"+(i+1),100000, 4.5);
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i].accountInfo();
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			a[i].setInterestRate(3.7);
		}
		for (int i = 0; i < a.length; i++) {
			a[i].accountInfo();
			ir = a[i].calculateInterest();
			System.out.printf("이자 : %.1f 원 ",ir);
			System.out.println();
		}
	}

}