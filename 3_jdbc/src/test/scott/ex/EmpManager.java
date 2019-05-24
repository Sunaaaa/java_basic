package test.scott.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class EmpManager {
	public void printEmployee(String[] jobs) {

		String sql = "select e.employee_id 사번, e.first_name 이름, e.salary  연봉 from employees e, jobs d where e.job_id = d.job_id and Lower(d.job_title) IN (?,?)";
 		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, jobs[0].toLowerCase());
			ps.setString(2, jobs[1].toLowerCase());
			// 결과값 handling
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
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