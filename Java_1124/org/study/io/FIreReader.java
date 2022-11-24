package org.study.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIreReader {
	public static void main(String[] args) {
		
		FileReader fileRead=null;
		try {
			fileRead=new FileReader("C:\\Users\\Administrator\\Desktop\\리쌍_헤어지지못하는연인.txt");
			int inData=0;
			while ((inData=fileRead.read()) !=-1) {
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileRead.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		
	}
}
