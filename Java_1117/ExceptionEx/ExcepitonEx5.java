package org.study.ExceptionEx;



public class ExcepitonEx5 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracel driver found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Oracle driver not found");
		}
;
		
		
	}	
}
