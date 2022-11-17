package org.study.utilEx;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		
		System.out.println("LocalDate");
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		System.out.println(" ");
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfYear()); //shows how many days in this year have passed till today 
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.isLeapYear());
		
		
		LocalDate targetDate=LocalDate.of(2022, 11, 17);
		System.out.println(targetDate);
		
	}
}
