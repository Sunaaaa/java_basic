package BookApp;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookMgr mgr = new BookMgr();
		Scanner sc = new Scanner(System.in);
		
		A : while (true) {
			System.out.println("=====================================");
			System.out.println("********* Book Application **********");
			System.out.println("=====================================\n");
			System.out.println("원하는 메뉴 번호를 입력하세요..\n");
			System.out.println("1. 입    력\n2. 수    정\n3. 삭    제\n4. 검    색\n5. 목록보기\n6. 종    료\n");
			System.out.println("*************************************");
			System.out.print("==> ");

			String input = sc.nextLine();
			
			if (input==null || input.length()==0) {
				input = "99";
			}
			switch (input.charAt(0)) {
			case '1':
				System.out.println("추가할 책 제목과 가격을 입력하세요.  \n 입력 예) java 7000");
				
				Scanner s1 = new Scanner(System.in);
				String title = s1.next();
				int price = s1.nextInt();
				
				mgr.addBook(new Book(title,price));
				break;

				//수정
			case '2':
				Scanner s2 = new Scanner(System.in);
				String uptitle = s2.nextLine();
				int upprice = s2.nextInt();
				mgr.update(uptitle, upprice);

				
				/*				System.out.println("책 제목 수정 : 1, 책 가격 수정 : 2");
				int m = s2.nextInt();

				String uptitle;
				int upPrice=0;				

				if(m==1) {
					System.out.println("수정할 책의 제목과 새로운 책의 제목을 입력하세요.");
					String otitle = s2.nextLine();
					uptitle = s2.nextLine();
					mgr.update(otitle, uptitle);
				}else if(m==2) {
					System.out.println("수정할 책의 제목과 새로운 책의 가격을 입력하세요.");
					uptitle = s2.next();
					upPrice = s2.nextInt();			
					mgr.update(uptitle, upPrice);
				}else System.out.println("다시 메뉴를 선택하세요");
	*/			
				break;

				//삭제
			case '3':
				Scanner s3 = new Scanner(System.in);
				String deltitle = s3.next();
				mgr.remove(deltitle);
				break;

				//검색
			case '4':
				Scanner s4 = new Scanner(System.in);
				String seatitle = s4.next();
				mgr.search(seatitle);
				break;

				//목록보기
			case '5':
				mgr.printBooklist();
				break;

			case '6':
				System.out.println("Book Application을 종료합니다.");
				System.exit(0);
				break A;
			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("1~6 사이의 숫자를 입력하세요.");
				break;
			}
		}
		if (sc!=null) {
			sc.close();
			sc= null;
			
		}

	}

}
