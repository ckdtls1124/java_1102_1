package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnection;
import org.study.dto.MemberDto;

public class MemberDao {
	public int insert(String id, String pw, String age1, String email) {
		int result = 0;

		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		// String work=null;

		try {
			conn = DBConnection.getConnection();
			query = "insert into member2(userid, userpassword, age1, email) values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, age1);
			pstmt.setString(4, email);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return result;
	}

	public ArrayList<MemberDto> select() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		Connection conn = null;
		String query = null;
		//		Resultset을 쓰는 이유???
		ResultSet rs = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();
			query = "select * from member2";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			//			이부분이 가장 헷갈린다.
			while (rs.next()) {
				lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
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
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return lists;
	}

	public int update(String id, String pw, String age, String email) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		conn = DBConnection.getConnection();
		String query = "update member2 set userpassword=?, age1=?, email=? where userid=?";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(4, id);
			pstmt.setString(1, pw);
			pstmt.setString(2, age);
			pstmt.setString(3, email);

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

}
