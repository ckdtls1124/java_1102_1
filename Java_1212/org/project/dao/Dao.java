package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dto.BoardDto;
import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class Dao {

	private static final Dao INSTANCE = new Dao();

	private Dao() {
		System.out.println("standard constructor");
	}

	// 싱글톤 쓰는 방법 첫번째
	public static class Singleton {

		public Dao getInstance() {
			return INSTANCE;
		}

		public int insert(String id, String pw, String email) {
			// TODO Auto-generated method stub
			String query = "insert into member1212 values(?, ?, ?)";
			int result = 0;
			Connection conn = null;
			PreparedStatement pstmt = null;

			try {
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
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

		public ArrayList<MemberDto> select() {
			// TODO Auto-generated method stub
			ArrayList<MemberDto> result = new ArrayList<MemberDto>();
			Connection conn = null;
			PreparedStatement pstmt = null;
			String query = "select * from member1212";
			ResultSet rs = null;

			try {
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					result.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
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

		public int login(String id, String pw) {
			// TODO Auto-generated method stub
			int result = 0;
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select count(*) from member1212 where userid=? and userpw=?";

			try {
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);

				rs = pstmt.executeQuery(); // resultset이 만들어지고 count(*)열의 타입은 number다.
				if (rs != null) { // 테이블이 존재하는지 없는지 여부를 확인함.
					while (rs.next()) {
						result = rs.getInt(1); // 필드의 값이 number 타입이므로 getInt로 받아올 수 있다.
					}
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

		public void write(String content, String title, String nickname, String writer) {
			// TODO Auto-generated method stub
			String query = "insert into board1212 values(board1212_seq.nextval, ?, ?, ?, sysdate, ?)";
			Connection conn = null;
			PreparedStatement pstmt = null;

			try {
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, content);
				pstmt.setString(2, title);
				pstmt.setString(3, nickname);
				pstmt.setString(4, writer);

				pstmt.executeUpdate();
				System.out.println("Writing on the board1212 was successful.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public ArrayList<BoardDto> selectUserid(String userid) {
			// TODO Auto-generated method stub
			ArrayList<BoardDto> result = new ArrayList<BoardDto>();
			String query = "select b.* from member1212 m inner join board1212 b on m.userid=b.writer where m.userid=?";
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, userid);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					result.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getDate(5), rs.getString(6)));
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

}
