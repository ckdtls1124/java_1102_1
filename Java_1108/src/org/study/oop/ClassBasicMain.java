package org.study.oop;

public class ClassBasicMain {
	public static void main(String[] args) {
		
		System.out.println(ClassBasic.PROJECTNAME);
		String classMember1=ClassBasic.PROJECTNAME; // put class' method into a string
		System.out.println(classMember1);
		ClassBasic.classMethod();
		
//		instancing
		System.out.println("==========================w");
		ClassBasic c1=new ClassBasic();
		
		c1.age=56;
		c1.userName="charlie";
		c1.userPw="charlie!";
		c1.userPhone="213123123";
		
		System.out.println("나이: "+c1.age);
		System.out.println("아이디: "+c1.userName);
		System.out.println("비밀번호: "+c1.userPw);
		System.out.println("연락처: "+c1.userPhone);
		
		
	}
}
