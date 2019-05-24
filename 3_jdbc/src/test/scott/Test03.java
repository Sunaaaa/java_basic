package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Test03 {
//	String sql ="select * from emp where LOWER(ename) LIKE '%j%'";
//		String sql ="select * from emp where LOWER(ename) LIKE '%'||'j'||'%'";
		

		public static void main(String[] args) {
			String sql ="select * from emp where LOWER(ename) LIKE '%'||?||'%'";
//			String sql ="select * from emp where LOWER(ename) LIKE ?";
			
			String sname=JOptionPane.showInputDialog("검색할 사람의 이름을 입력하라");

			Connection con = null;
			Statement st = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			int row = 0;

			try {
				con = JDBCUtil.getConnection();
				st = con.createStatement();

				ps = con.prepareStatement(sql);

				//ps의 ? 세팅 작업
				ps.setString(1,sname.toLowerCase());
//				ps.setString(1,"%"+sname.toLowerCase()+"%");
				
				//실행
				//결과값 handling
				rs = ps.executeQuery();
				
				while (rs.next()) {
					System.out.print(rs.getString("ename")+" ");					
					System.out.print(rs.getString("deptno")+" ");					
					System.out.print(rs.getString("job")+" ");					
					System.out.print(rs.getDate("hiredate")+" ");				
//					System.out.print(rs.getString("hiredate")+" ");				
					System.out.println();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}

		}

	}
