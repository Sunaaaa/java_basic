package day08;

public class Test02 {
	public static void main(String[] args) {
//		Animal a = new Animal() ;
//		Animal[] animals = new Animal[3];
		Animal[] animals = {
				new Fish("쿠퍼"), new Dog("시베리안 허스키", "케리")
		};
		
		for(Animal a : animals) {
			exec(a);
		}
	}

	public static void exec(Animal a) {
		a.breath();
		a.print();
	}
}
