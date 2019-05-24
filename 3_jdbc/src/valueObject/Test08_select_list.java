package valueObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class Test08_select_list {
	public static void main(String[] args) {

		String sql = "select * from book";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row=0;

		List<BookVO> books = new ArrayList<BookVO>();
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setPubdate(rs.getDate("pubdate").toString());
//				book.setPubdate(rs.getDate("pubdate").toString()); -> date 가 string타입이면 toString()없어도 가능
				book.setTitle(rs.getString("title"));
				book.setBookno(rs.getInt("bookno"));
//				System.out.println(book);
				books.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

		for (BookVO b : books) {
			System.out.println(b);			
		}
		books.forEach(t->System.out.println(t));
	}

}