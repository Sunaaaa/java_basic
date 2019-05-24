package test.scott;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("JDBC Test");
		String sql = "select * from dept";

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pw);

			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
//				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString("deptno")+" ");
				System.out.print(rs.getString("dname")+" ");
				System.out.print(rs.getString("loc")+" ");				
				System.out.println();
			}
			
			System.out.println(con.getMetaData());
			System.out.println(rs.getMetaData());
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("jdbc driver 확인 요망");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs!=null) rs.close();
				if (st!=null) st.close();
				if (con!=null) con.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		System.out.println("****** END *******");

	}

}
