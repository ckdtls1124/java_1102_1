package org.study.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEx {
	public static void main(String[] args) {
		
		
		System.out.print("4000");
		
		InputStream input=System.in;
		try {
			int in=input.read();
			System.out.println("출력: "+in);
			System.out.println("출력: "+((char)in));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}
}
