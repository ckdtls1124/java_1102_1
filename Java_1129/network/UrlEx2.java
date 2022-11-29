package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx2 {
	public static void main(String[] args) {
		
		BufferedReader input=null;
		try {
			URL url= new URL("https://www.starbucks.co.kr/index.do");
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine;
			while ((inputLine = input.readLine()) !=null) {
				System.out.println(inputLine);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
