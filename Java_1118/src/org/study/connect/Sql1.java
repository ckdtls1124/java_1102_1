package org.study.connect;

import java.io.IOException;
import java.sql.SQLException;

public class Sql1 implements SqlCommand{
	
	@Override
	public void executeCommand() throws IOException, SQLException, ClassNotFoundException{
		
		System.out.println("Registering");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		System.out.println("Driver Ok");
		
	}
}
