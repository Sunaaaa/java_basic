package test.scott;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test02_util {
/*
	public static void main(String[] args) {
		System.out.println("JDBC Test");
		String sql = "select e.deptno, d.dname, ROUND(avg(sal),2) 평균급여, COUNT(*) 인원수 from emp e, dept d where e.deptno = d.deptno GROUP BY e.deptno, d.dname ORDER BY 1";

		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getConnection();
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
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);
		}

		System.out.println("****** END *******");

	}
*/
}
