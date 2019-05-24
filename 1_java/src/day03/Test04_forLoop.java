package day03;



//for Loop 문

public class Test04_forLoop {
	public static void main(String[] args) {
		for(int i=0; i<5;i++) {
			System.out.println(i + "Hola");			
		}
		
		int i=10;
		while(i>5) {
			System.out.println(i + "Hola2");		
			i--;
		}
		
		
		do {
			System.out.println("Hola3");
			i--;
		}while(i>5);

		boolean flag = false;
		while(!flag) {
			i--;
			System.out.println("loop~~~~~~~~~~~~~~~~~");
			if (i==0) flag = !flag;
		}
	}
}
