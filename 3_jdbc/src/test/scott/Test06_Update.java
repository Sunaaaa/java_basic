package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class Test06_Update {
	public static void main(String[] args) {

		String sql = "UPDATE BOOK set  price=? , title=? where bookno=?";
/*
		int deptno = 2;
		String dname = "이름";
		String loc = "지역";
*/
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row=0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// 결과값 handling
			ps.setInt(1, 900);
			ps.setString(2, "centos");
			ps.setInt(3, 4);
			row=ps.executeUpdate();
			System.out.println("수정 " + row);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}