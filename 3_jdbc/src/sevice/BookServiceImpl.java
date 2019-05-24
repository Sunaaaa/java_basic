package sevice;

import java.util.List;

import dao.BookDAO;
import valueObject.BookVO;

public class BookServiceImpl implements BookService{
	
	//BookDAO만 동작 -> 다른 DAO로 변경 불가
//	private BookDAO dao = new BookDAO();
	//어떤 DAO를 쓸지는 런타임때 설정 가능
	private BookDAO dao = null;
	
	public BookServiceImpl() {
		super();
	}
	
	public BookServiceImpl(BookDAO dao) {
		super();
		this.dao = dao;
	}

	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public int addBook(BookVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.addBook(vo);
	}

	@Override
	public List<BookVO> booklist()  {
		// TODO Auto-generated method stub
		return dao.bookList();
	}
	

}
