package org.study.oop;

public class ClassBasic {
	
	
//	attributes
	public int age;
	public String userName;
	public String userPw;
	public String userPhone;

	public static final String PROJECTNAME="Java2022";
	
//	Method
	public void intstanceMethod() {
		System.out.println("인스턴스 메소드");
	}
	
	public static void classMethod() {
		System.out.println("클래스 메소드");
	}
}
