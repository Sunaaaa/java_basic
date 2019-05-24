package day07;

public class Test04_Fish {
	public static void main(String[] args) {
		Fish f = new Fish("쿠피");
		
//		f.print();
//		f.breath();
		
		Dog d = new Dog("허스키","케리");
		
		Animal a = null;
		a=f;	 //모든 객체의 Data Type은 부모가 될 수 있다. 
		// d가 오면 폐, f가 오면 아가미
		a.breath();
		a.print();
	}
}
