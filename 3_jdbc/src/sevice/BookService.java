package sevice;

import java.util.List;

import valueObject.BookVO;

public interface BookService {
	
	List<BookVO> booklist();
//	int addBook(String a, String e, Int d String g) throws Exception;

	int addBook(BookVO vo)throws Exception;

}
