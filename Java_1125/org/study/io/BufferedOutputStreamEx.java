package org.study.io;

import java.io.BufferedOutputStream;
//import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
//import java.util.Scanner;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) {
		System.out.println("BufferedOutputstream");
		
//		Scanner inputScan=new Scanner(System.in);
//		String a=inputScan.next();
//		System.out.println(a);
		
//		Make a file
		FileOutputStream fos=null;
		String fileUrl1="C:\\Users\\Administrator\\Desktop\\test11.txt";
		try {
			fos=new FileOutputStream(fileUrl1);
			BufferedOutputStream bos=new BufferedOutputStream(fos, 2);
//			byte[] data="123rfedr9".getBytes();
			for (int i = 32; i <='!' ; i++) {
				fos.write(i);
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.flush();
				fos.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
//		1. Read the file through FileInputStream
		fileUrl1="C:\\Users\\Administrator\\Desktop\\test11.txt";
		FileInputStream readfile=null;
		try {
			readfile=new FileInputStream(fileUrl1);
			
			int data=0;
			while ((data=readfile.read()) !=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				readfile.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		System.out.println("\n");
		System.out.println("=================");
		System.out.println(" ");
//		2. Read the file through FileReader
		fileUrl1="C:\\Users\\Administrator\\Desktop\\test11.txt";
		FileReader readFile=null;
		try {
			readFile=new FileReader(fileUrl1);
			int data=0;
			while ((data=readFile.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				readFile.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
