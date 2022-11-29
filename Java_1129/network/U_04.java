package org.study.network;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class U_04 {
	public static void main(String[] args) {
		
		try {
			URL aurl1=new URL("http://localhost:8092/springMVC1206/join");
			
			URLConnection uc=aurl1.openConnection();
			uc.setDoOutput(true);
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
