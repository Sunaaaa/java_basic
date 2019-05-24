package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class Test07_select {
	public static void main(String[] args) {

		String sql = "select COUNT(*) 직속부하직원수, m.employee_id 관리자사번, m.last_name 관리자이름 from employees e, employees m where e.manager_id = m.employee_id GROUP BY m.employee_id, m.last_name HAVING COUNT(*) >=8 ORDER BY 1";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row=0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("직속부하직원수")+" ");
				System.out.print(rs.getInt("관리자사번")+" ");
				System.out.print(rs.getString("관리자이름")+" ");
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