package org.study.utilEx;

import java.time.LocalTime;

public class LocalTimeEx {
	public static void main(String[] args) {
		
		LocalTime timeNow=LocalTime.now();
		System.out.println(timeNow);
		
		System.out.println(" ");
		System.out.println(timeNow.getHour());
		System.out.println(timeNow.getMinute());
		System.out.println(timeNow.getSecond());
		System.out.println(timeNow.getNano());
		
		LocalTime targetTime=LocalTime.of(10, 30, 20, 070);
		System.out.println(targetTime);
		System.out.println(targetTime.getHour());
		System.out.println(targetTime.getMinute());
		System.out.println(targetTime.getSecond());
		System.out.println(targetTime.getNano());
		
		
	}
}
