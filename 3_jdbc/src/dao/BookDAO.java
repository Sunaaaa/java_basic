package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import valueObject.BookVO;

public class BookDAO {

	// select * from book;
	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book order by 1";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				BookVO b = new BookVO();
				b.setTitle(rs.getString("title"));
				b.setPrice(rs.getInt("price"));
				b.setAuthor(rs.getString("author"));
				b.setBookno(rs.getInt("bookno"));
				b.setPubdate(rs.getDate("pubdate").toString());
				
				list.add(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

		return list;
	}
	public int addBook(BookVO vo) throws Exception {
		
		String sql = "INSERT INTO BOOK (bookno, title, author, price) VALUES ((select nvl(max(bookno),0)+1 from book),?,?,?)";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row=0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getAuthor());
			ps.setInt(3, vo.getPrice());
			row = ps.executeUpdate();
			

		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		System.out.println(row);
		return row;

	}
}
