package test.scott;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("JDBC Test");
		String sql = "select e.deptno, d.dname, ROUND(avg(sal),2) 평균급여, COUNT(*) 인원수 from emp e, dept d where e.deptno = d.deptno GROUP BY e.deptno, d.dname ORDER BY 1";

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
			
			System.out.println("부서번호\t 부서명\t 평균급여\t 인원수");
			System.out.println("=====================");
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t ");
				System.out.print(rs.getString(2)+"\t ");
				System.out.print(rs.getString("평균급여")+"\t ");				
				System.out.print(rs.getString("인원수")+"\t ");				
				System.out.println();
			}
			
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
