package org.study.command;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import org.study.dbconnect.DBConnect;

public class CheckTable implements Command {

	public static String tablename;

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
//		String tablename=null;
		
		
//		boolean result;
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner input = new Scanner(System.in);
		ResultSet a = null;
		ResultSetMetaData b = null;
		boolean bool = true;
		String table;
		
		try {
			while (bool) {
				System.out.print("Type in the table name to check it's present: ");
				table = input.next();

				String query = "select * from " + table;
				CheckTable.tablename = table;
				conn = DBConnect.getConnection();
				pstmt = conn.prepareStatement(query);
				a = pstmt.executeQuery();

				b = a.getMetaData(); // very important

				if (b != null) {
					System.out.println("Table exists");
					new Insert().executeCommand();
					bool = false;
				} else {
					System.out.println("That table doesn't exists.");
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
				if (a != null)
					a.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
