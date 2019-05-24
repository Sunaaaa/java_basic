package day05;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("이름을 입력해 주세요.");
		System.out.println(data);
		double sum=0, sum2=0;
		String jumsu = JOptionPane.showInputDialog("국어/영어/수학 정보를 입력해 주세요. 예) 90/90/77 ");
		for (int i = 0; i < jumsu.split("/").length; i++) {
			sum += Integer.parseInt(jumsu.split("/")[i]);
			sum2 += Double.parseDouble(jumsu.split("/")[i]);
			
		}
		System.out.printf("%.2f" ,sum/(jumsu.split("/").length));
		System.out.printf("%.2f" ,sum2/(jumsu.split("/").length));
	}

}
