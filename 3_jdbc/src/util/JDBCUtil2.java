package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil2 {
	public static Connection getConnection() {
		Connection con = null;
		Properties p = new Properties();

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "user";
		String pw = "pw";
		String driver = "oracle.jdbc.OracleDriver";
		

		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pw);		
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("jdbc driver 확인 요망");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return con;
	}

	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
