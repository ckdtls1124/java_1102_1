package org.study.utilEx;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEx2 {
	public static void main(String[] args) {
		// Adjusting the date
		System.out.println("compare the date");
		
		LocalDateTime a1=LocalDateTime.now();
		LocalDateTime a2=LocalDateTime.of(2021, 12, 12, 10, 40);
		
		boolean result1=a1.isBefore(a2);
		System.out.println(result1);

		result1=a1.isAfter(a2);
		System.out.println(result1);
		
		result1=a1.isEqual(a2);
		System.out.println(result1);
		
		
		ZonedDateTime utczone=ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utczone);
	}
}
