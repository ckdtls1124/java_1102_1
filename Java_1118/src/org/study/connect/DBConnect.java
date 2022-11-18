package org.study.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {

		Connection conn = null; // DB connecting

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		try {
			//		1. Driver Load
			Class.forName(driver);
			System.out.println("Driver Ok");
			//			2. DB Connecting
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connect Success!");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Driver NULL");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Connect Success!!");
		}

		return conn;
	}
}
