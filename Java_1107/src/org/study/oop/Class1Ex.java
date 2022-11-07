package org.study.oop;

public class Class1Ex {
	public String name;
	public int age;
	public static String title;
	public static final String PROJECTNAME="javascript";
	
	public void instanceMethod() {
		
		System.out.println("인스턴스 메소드");
	}

	public static void classMethod() {
		
		System.out.println("클래스 메소드");
	}
}
