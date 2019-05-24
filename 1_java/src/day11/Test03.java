package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Test03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(70);
		list.add(97);
		list.add(75);
		list.add(87);
		list.add(49);

		for (Integer data : list) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("---------------------");

		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");
			}
		});
		/*
		System.out.println();
		System.out.println("---------------------");

		list.forEach((Integer t) -> System.out.print(t + " "));

		System.out.println();
		System.out.println("---------------------");
*/
		System.out.println();
		System.out.println("---------------------");

		list.forEach((t) -> System.out.print(t + " "));		
		System.out.println();
		System.out.println("---------------------");
		
		list.removeIf(i-> i%2==0);
		list.forEach((t) -> System.out.print(t + " "));
		
		System.out.println();
		System.out.println("---------------------");
		
		list.replaceAll(i->i*10);
		list.forEach((t) -> System.out.print(t + " "));
		list.replaceAll(new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		System.out.println();
		System.out.println("---------------------");

	}

}
