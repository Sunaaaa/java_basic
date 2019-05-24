package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test04_2 {
	public static void main(String[] args) {

		String sql = "INSERT INTO BOOK (bookno, title, price) VALUES ((select NVL(max(bookno),0)+1 from book),?,?) ";
/*
		int bookno = 2;
		String title = "SQL20";
		int price = 3000;
*/
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
//			ps.setString(1, title);
//			ps.setInt(2, price);
			ps.setString(1, "SQL");
			ps.setInt(2, 3000);
			// 결과값 handling
			row = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}