package org1.study.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String id="system";
		String pw="1234";
		
		try {
			Class.forName(driver);
			System.out.println("Driver exists.");
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("Connecting to driver was successful.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
