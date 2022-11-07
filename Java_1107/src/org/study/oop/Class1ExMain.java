package org.study.oop;

public class Class1ExMain {
	public static void main(String[] args) {
		System.out.println("static 멤버(클래스멤버): ");
		
		
//		these do not require instancing beforehand
//		that's why these are called class' methods and attributes		
		Class1Ex.classMethod();
		Class1Ex.title="클레스 멤버";	
		System.out.println(Class1Ex.PROJECTNAME);
		
		System.out.println("===============");
		
		
//		instancing the class must be done prior to initializing the attributes
//		that's why these are called instance's methods and attributes
		Class1Ex cls1=new Class1Ex();
		
		cls1.instanceMethod();
		
		System.out.println("속성 값 입력:");
		cls1.name="대한민국";
		cls1.age=45;
		
		
	}
}
