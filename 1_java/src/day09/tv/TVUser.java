package day09.tv;

public class TVUser {

	public static void main(String[] args) {
		TV user1 = new STV();
		user1.powerOn();
		
//		user1 = new LTV();
		user1.powerOn();
		TV user2 = new LTV();
		tv(user1);
		tv(user2);
		
	}
	
	public static void tv(TV tv) {
		tv.powerOn();
	}
}
