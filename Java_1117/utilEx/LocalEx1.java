package org.study.utilEx;


import java.time.LocalDateTime;

public class LocalEx1 {
	public static void main(String[] args) {
		// Adjusting the date
		
		
		LocalDateTime curDateTime=LocalDateTime.now();
		System.out.println(" ");

		
		LocalDateTime tarDateTime=curDateTime.plusYears(4);
		System.out.println(tarDateTime);

		tarDateTime=curDateTime.plusMonths(4);
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.plusDays(120);
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.plusWeeks(5);
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.minusYears(10);
		System.out.println(tarDateTime);
		
		tarDateTime=curDateTime.minusWeeks(100);
		System.out.println(tarDateTime);
		
		
		
		
	}
}
