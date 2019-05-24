package day06;
import day06.BlockTest;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("start ...");	
		BlockTest blockTest = null;
//		BlockTest b = new BlockTest();
		System.out.println("------");	
//		BlockTest c = new BlockTest();
		System.out.println("end ...");	
	}
}
class BlockTest{

	static {
		System.out.println("초기화 {	2.}");
	}
	{
		System.out.println("초기화 {	1}");
	}

	public BlockTest() {
		System.out.println("BlockTest() 생성자");
	}
}