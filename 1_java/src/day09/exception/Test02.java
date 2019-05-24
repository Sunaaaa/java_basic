package day09.exception;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("start");
		
//		throw new ArrayIndexOutOfBoundsException();
		
		try {
			throw new Exception("예외 발생");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
