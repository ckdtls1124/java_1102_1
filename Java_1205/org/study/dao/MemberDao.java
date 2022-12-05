package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.command.CheckTable;
import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	String tablename;
	int a1;
	int a2;

	public int create(String tablename) {
		// TODO Auto-generated method stub
		int result = 0;
		this.tablename = tablename;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnect.getConnection();
			String query = "create table " + this.tablename // why???
					+ "(userid varchar2(20) not null," + "userpw varchar2(20) not null," + "name varchar2(20) not null,"
					+ "userAge number(3) not null," + "email varchar2(20) not null," + "primary key(userid))";
			pstmt = conn.prepareStatement(query);
			// pstmt.setString(1, tablename);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
	}

	public int insert(String tablename, String userid, String userpw, String name, int userAge, String email) {
		// TOD Auto-generated method stub
		int result = 0;
//		this.tablename = tablename; // This might be unnecessary
		String query = "insert into " + tablename + "(userid, userpw, name, userage, email) values(?, ?, ?, ?, ?)";

		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBConnect.getConnection();
			pstmt = conn.prepareStatement(query);
			// pstmt.setString(1, tablename);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			pstmt.setString(3, name);
			pstmt.setInt(4, userAge);
			pstmt.setString(5, email);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return result;
	}

	public ArrayList<MemberDto> selectAgeRange(int a1, int a2) {
		// TODO Auto-generated method stub
		ArrayList<MemberDto> result = new ArrayList<MemberDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String query = "select * from member2 where userage>=? and userage<=?";
			conn = DBConnect.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a1);
			pstmt.setInt(2, a2);

			pstmt.executeUpdate(); // what the fuck
			rs = pstmt.executeQuery();

			while (rs.next()) {
				result.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return result;
	}

}
