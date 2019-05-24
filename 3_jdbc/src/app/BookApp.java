package app;

import java.util.List;

import dao.BookDAO;
import sevice.BookService;
import sevice.BookServiceImpl;
import valueObject.BookVO;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDAO dao = new BookDAO();

		// 어떤 DAO를 사용할지 파라미터로 설정한다.
		BookService service = new BookServiceImpl(dao);
		BookVO user = new BookVO("아작스","kimm", 1200);
		try {
			service.addBook(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("등록 데이터 확인 필요");
		}

		if (service != null) {
			List<BookVO> list = service.booklist();
			list.forEach(t -> System.out.println(t));
		}
	}

}
