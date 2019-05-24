package test.scott.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class EmpTest {
	public static void main(String[] args) {

		String sql = "select * from book";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;


		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("bookno")+" ");
				System.out.print(rs.getString("title")+" ");
				System.out.print(rs.getString("author")+" ");
				System.out.print(rs.getInt("price")+" ");
				System.out.print(rs.getDate("pubdate")+" ");
				System.out.println();
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}

}