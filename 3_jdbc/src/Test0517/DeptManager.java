package Test0517;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;

public class DeptManager {

	public List<DeptVO>  getDepts() {
		
		String sql="select * from dept";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getInt("deptno")+" ");
				System.out.print(rs.getString("dname")+" ");
				System.out.print(rs.getString("loc")+" ");
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}

		return list;
	}

}
