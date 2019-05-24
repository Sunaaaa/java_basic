package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test04 {
	public static void main(String[] args) {

		String sql = "INSERT INTO DEPT  VALUES (?,?,?) ";
		int deptno = 2;
		String dname = "이름";
		String loc = "지역";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			// 결과값 handling
			rs = ps.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}