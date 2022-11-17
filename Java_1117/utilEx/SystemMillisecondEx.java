package org.study.utilEx;

import java.util.TimeZone;

public class SystemMillisecondEx {
	
	public static void main(String[] args) {
		long time=System.currentTimeMillis();
		System.out.println("Return system milliseconds: "+time);
		
		
		long time1=System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			System.out.print(i+",");
		}
		System.out.println(" ");
		
		long time2=System.currentTimeMillis();
		
		System.out.println("The time has been past "+((time2-time1) / 1000.0));
		
//		TimeZone us=TimeZone.getTimeZone("us/samoa");
//		System.out.println(us);
		
		
	}
}
