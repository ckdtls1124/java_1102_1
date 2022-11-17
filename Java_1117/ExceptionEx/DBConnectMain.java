package org.study.ExceptionEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMain {
	
	public static void main(String[] args) {
		
		System.out.println(DBConnect.getConnection());	
		System.out.println(" ");
//		DBConnect.getConnection();
		
	}
}
