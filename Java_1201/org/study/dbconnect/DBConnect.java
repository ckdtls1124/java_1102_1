package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn=null;
		
//		String driver="oracle.jdbc.dirver.OracleDriver";
		String user="system";
		String password="1234";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
//		Driver Manager을 이용하면, Class.forName을 이용할 필요가 없다.
//		Class.forName(driver); 
		try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("Connection went successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection went failed.");
		}
		
		return conn;
	}
	
	
	public static void main(String[] args) {
		
		DBConnect.getConnection();
		
	}
	
}
