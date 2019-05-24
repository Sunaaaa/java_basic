package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Template {

	public static void main(String[] args) {

		String sql = "";

		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			st = con.createStatement();
			con = JDBCUtil.getConnection();

			ps = con.prepareStatement(sql);

			//ps의 ? 세팅 작업
			
			
			//실행
			ps.executeUpdate();
			
			//결과값 handling
			rs = st.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}
