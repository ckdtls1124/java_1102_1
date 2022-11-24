package org.study.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		
		Thread showFile=new Thread(new Runnable() {
			
			FileInputStream infile=null;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					infile=new FileInputStream("C:\\Users\\Administrator\\Desktop\\리쌍_헤어지지못하는연인.txt");
				    InputStreamReader reader=new InputStreamReader(infile,"UTF-8");
			        BufferedReader in=new BufferedReader(reader);

					int inData;
//			데이터의 끝은 -1이다.
					while ((inData=in.read())!=-1) {
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
						infile.close();
					} catch (IOException e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				
			}
		});
		
		showFile.start();
		
		
		
	}
}
