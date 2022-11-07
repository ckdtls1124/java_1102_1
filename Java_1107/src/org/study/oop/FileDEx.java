package org.study.oop;


import java.util.Date;

public class FileDEx {
	
//	instance's members
	public int num;
	public String name;
	public int[] arr1;
	public Date day;
	public CarBasicInfo carName;
	
//	class' members
	private static final String MEMBERNAME="JAVA";
//	this member will only be available in this class.
	
//	class' method
	public static void method() {
		System.out.println(MEMBERNAME);
	}
//	this method will summon the private class' member
	
}
