package org.study.network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseEx {
	public static void main(String[] args) {
		
		URL opinion=null;
		URL join=null;
		
		try {
			join=new URL("http://localhost:8092/springMVC1206/join"); // an absolute route
			opinion=new URL(join, "join");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("잘못된 URL입니다.");
		}
		
		System.out.println("protocol= "+opinion.getProtocol());
		System.out.println("host= "+opinion.getHost());
		System.out.println("post= "+opinion.getPort());
		System.out.println("path= "+opinion.getPath());
		System.out.println("filename= "+opinion.getFile());

	}
}
