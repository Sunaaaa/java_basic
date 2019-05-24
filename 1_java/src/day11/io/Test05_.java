package day11.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05_ {
	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		
		BufferedReader bis = null;
		BufferedWriter bos = null;

		String filename = "c://lib/dbinfo.txt";
		// IO횟수
		int count = 0;
		int read = 0;
		try {
			
			fis = new FileReader(filename);
			fos = new FileWriter("c://lib/copy.txt");
			
			bis = new BufferedReader(fis);
			bos = new BufferedWriter(fos);

			System.out.println("++++ 파일 복사 시작 ++++");
			while ((read = bis.read()) != -1) {
				bos.write(read);
				count++;
			}
			bos.flush();
			System.out.println("IO 횟수 : " + count);
			System.out.println("++++ 파일 복사 완료 ++++");

		} catch (FileNotFoundException e) {
			System.out.println("복사할 파일을 준비해 주세요");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (bis != null)bis.close();
				if (bos != null)bos.close();
				if (fis != null)fis.close();
				if (fos != null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 완료");
	}
}
