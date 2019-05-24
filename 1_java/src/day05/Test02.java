package day05;

//import java.util.Arrays;

//클래스 
public class Test02 {
	public static void main(String[] args) {
		TV tv1 = new TV("BLACK", 8, true);
		TV tv2 = new TV();

		tv1.power();
		tv1.channelUp();
//		tv1.print();
//		tv1.color="BlACK";
		tv2.color = tv1.color;
		tv2.print();
		tv2.power();
//		tv2.print();

		System.out.println("====================================");
		/*
		 * TV[] tvs = new TV[5]; tvs[0] = tv1; tvs[1] = tv2;
		 */
//		System.out.println(Arrays.toString(tvs));
//		TV[] tvs = { tv1, tv2, null, null };
		
		TV[] tvs = null;
		tvs= new TV[]{tv1, tv2, null, null};

		for (int i = 0; i < tvs.length; i++) {
			if (tvs[i] != null) {
				tvs[i].print();
				System.out.println(tvs[i]);

			}
		}
	}
}
