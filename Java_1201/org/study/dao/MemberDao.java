package org.study.dao;

import java.sql.Statement;
import java.util.ArrayList;
//import java.util.ArrayList;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import com.bean.UserBean;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {
	public MemberDao() {

	}

	//	Insert
	public int insert(String userid, String userpw, int age) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = null;

		conn = DBConnect.getConnection();
		query = "insert into member(userId, userPw, age) values(?,?,?)";

		try {
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			pstm.setInt(3, age);
			
			result = pstm.executeUpdate(); // !Important

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return result;
	}

	//	Select

	//	First solution

	public ArrayList<MemberDto> select() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;

		try {
			String query = "select * from member";
			conn = DBConnect.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return lists;
	}

	//	Second solution

	//	Update
	public int update(String id, String pw, int age) {
		System.out.println("An " + id + "'s info will be changed to password: " + pw + ", " + "age: " + age + ".");
		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = null;

		conn = DBConnect.getConnection();
		query = "update member set userPw=?, age=? where userId=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(3, id);
			pstmt.setString(1, pw);
			pstmt.setInt(2, age);

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

	//	Delete
	public int delete(String id, String pw) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = null;

		try {
			conn = DBConnect.getConnection();
			query = "delete from member where userId=? and userPw=?";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, id);
			pstmt.setString(2, pw);
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
			} catch (Exception e3) {
				// TODO: handle exception
			}
		}

		return result;
	}

}
