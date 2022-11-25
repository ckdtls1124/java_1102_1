package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadEncodingEx {
	public static void main(String[] args) {
		System.out.println("Encoding");
		
		
		FileInputStream fIn=null;
		InputStreamReader input=null;
		String url="C:\\Users\\Administrator\\Desktop\\what.txt";
		
		try {
			fIn=new FileInputStream(url);
			input=new InputStreamReader(fIn, "UTF-8");
			
			int data=0;
			while ((data=input.read()) !=-1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fIn.close();
				input.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}
}
