package test_1125;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test_1125 {
	public static void main(String[] args) {

//		for (int j = 2; j < 10; j++) {
//			System.out.println(j+"단 입니다.");
//			for (int i = 1; i < 10; i++) {
//				System.out.println(j + "*" + i + "=" + (i * j));
//			}
//			System.out.println("==========");
//		}
		
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		
		for (Integer num : list) {
			System.out.println(num);
		}
		
//		===================================
		
//		Set<Integer>a=new HashSet<Integer>();
//		a.
		
		Map<String, Integer> mapEx=new HashMap<String, Integer>();
		mapEx.put("1", 400);
		mapEx.put("2", 4200);
		mapEx.put("3", 3200);
		mapEx.put("4", 6523400);
		mapEx.put("5", 43400);
		mapEx.put("6", 404320);
		
		Set<String> setOfMap=mapEx.keySet();
		Iterator<String> valueOfKeys=setOfMap.iterator();
		while (valueOfKeys.hasNext()) {
			String a=valueOfKeys.next();
			Integer value=mapEx.get(a);
			System.out.print(value+",");
		}
		
		
//		======================================
		System.out.println("===========");
		String url="E:\\ioex\\test1.html";
		File linkUrl=new File(url);
		
		FileInputStream fInput=null;
		
		try {
			fInput=new FileInputStream(linkUrl);
			int readData=0;
			while ((readData=fInput.read()) != -1) {
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fInput.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
//		===========================================
		System.out.println("=========================");
		
		String url1="E:\\ioex\\test1.html";
		File linkUrl1=new File(url1);
		
		FileReader fReader=null;
		
		try {
			fReader=new FileReader(linkUrl1);
			int readData1=0;
			while ((readData1=fReader.read()) != -1) {
				System.out.print((char)readData1);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fReader.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
//		=========================================================
		
//		make a file, and write on file
		
		
		FileWriter wrFile=null;
		System.out.println("Write the data: ");
		InputStreamReader write=new InputStreamReader(System.in);
		try {
			String newFile="E:\\ioex\\test7.txt";
			File fileAddr=new File(newFile);
			wrFile=new FileWriter(fileAddr);
			
			int data=0;
			while ((data=write.read()) !=-1) {
				wrFile.write(data);
				System.out.println("Data that you type is: "+(char)data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				wrFile.close();
				write.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
