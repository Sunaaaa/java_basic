package workbook_basic;

public class Test05 {
	public static void main(String[] args) {
		int fahrenheint = 100;
//		float celcius = (fahrenheint-32)/1.8f;
		float celcius = (5/9f * (fahrenheint-32));
		//5/9가 f 가 아니면 답은 0이나옴
		System.out.println("Fahrenheit : " + fahrenheint);
		System.out.println("Celcius : " + celcius);
	}
}
