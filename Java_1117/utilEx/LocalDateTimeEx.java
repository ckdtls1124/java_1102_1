package org.study.utilEx;

import java.time.LocalDateTime;

public class LocalDateTimeEx {

	
	
	public static void main(String[] args) {
		
		System.out.println("Local Date Time");
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(" ");
		System.out.println(dateTime.getDayOfYear());
		
		
		LocalDateTime a=LocalDateTime.of(2022, 11, 24, 12, 00);
		System.out.println(a);
		
		
		
	}
}
