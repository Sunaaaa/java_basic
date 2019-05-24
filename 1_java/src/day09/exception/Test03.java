package day09.exception;

public class Test03 {
	public static void main(String[] args){
		System.out.println("start");

		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+"----------------");			
		try {
				Thread.sleep(1000);				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}		
		System.out.println("end");
	}
}
