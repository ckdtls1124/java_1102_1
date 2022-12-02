package org.study.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		
//		String driver="jdbc.oracle.driver.OracleDriver";
		String user = "system";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection went successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection failed.");
		}

		return conn;

	}

}
