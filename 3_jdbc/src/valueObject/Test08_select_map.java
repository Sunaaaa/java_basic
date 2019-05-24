package valueObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import util.JDBCUtil;

public class Test08_select_map {
	public static void main(String[] args) {

		String sql = "select * from book";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row=0;

		Map<Integer,BookVO> mbooks = new HashMap<Integer, BookVO>();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				
				BookVO book = new BookVO();
				book.setPrice(rs.getInt("price"));
				book.setAuthor(rs.getString("author"));
				book.setPubdate(rs.getDate("pubdate").toString());
				book.setTitle(rs.getString("title"));
				book.setBookno(rs.getInt("bookno"));
				mbooks.put(rs.getInt("bookno"), book);
		}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		System.out.println();

		for (int b : mbooks.keySet()) {
			System.out.println(b + " " + mbooks.get(b));			
		}
		System.out.println();
		mbooks.forEach((t,o)->System.out.println(t + " " + o));
	}

}



























