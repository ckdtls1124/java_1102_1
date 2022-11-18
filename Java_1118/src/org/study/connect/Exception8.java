package org.study.connect;

public class Exception8 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(2);
			throw new Exception();
		} catch ( Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(3);
		}
		System.out.println("System worked successfully.");
		
	}
}
