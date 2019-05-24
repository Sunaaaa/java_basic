package day09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("C://lib/bookdata.txt"));){
			
			while(sc.hasNextLine()) {
				String data= sc.nextLine();
				String[] bookdata = data.split("/");
				String title = bookdata[0];
				int price = Integer.parseInt(bookdata[1]);
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("bookdata.txt 파일을 준비해 주세요!");
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("bookdata parsing error");
			System.out.println(e.getMessage());
		}
	}
}
