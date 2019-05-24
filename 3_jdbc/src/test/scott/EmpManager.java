package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class EmpManager {
	public static void main(String[] args) {

		String sql = "select e.employee_id 사번, e.first_name 이름, e.salary  연봉 from employees e, jobs d where e.job_id = d.job_id and Lower(d.job_title) IN (?,?)";
 		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		 
		 String a = JOptionPane.showInputDialog("직업1");
		
		String b = JOptionPane.showInputDialog("직업2");
		/*
		String a2 = a.trim().substring(0,1).toUpperCase();
		String a3 = a.trim().substring(1);
		String b2 = b.trim().substring(0,1).toUpperCase();
		String b3 = b.trim().substring(1);	*/
		String aa = a.toLowerCase();
		String bb = b.toLowerCase();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, aa);
			ps.setString(2, bb);
			// 결과값 handling
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String st[] = {rs.getString("사번"),rs.getString("이름"),rs.getString("연봉")};
				EmpManager.printEmployee(st);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}

	}
	
	public static void printEmployee(String jobs[]) {
			System.out.printf("%s \t %s \t %s \n", jobs[0], jobs[1], jobs[2] );
	}

}