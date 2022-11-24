package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FIleOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream a=null;
		try {
			
			a=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\what the fuck.txt");
			FileInputStream fin=null;
			
			for (int i = 90; i < 100; i++) {
				int memo=10-i;
				a.write(memo);
			}
			
			
			fin=new FileInputStream("C:\\Users\\Administrator\\Desktop\\what the fuck.txt");
			int inData=0;
			while ((inData=fin.read()) !=-1) {
				System.out.print((char)inData+" ");
			}
			if(fin!=null) fin.close();
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				a.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
				
	}
}
