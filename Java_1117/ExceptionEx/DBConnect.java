package org.study.ExceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	
	public static Connection getConnection() {
		
		Connection conn=null;
		
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="1234";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("Driver exists");
			
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("Connection succeeds.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver null");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection fails");
		}
		
		
		
		
		return conn;
	}
	

}
