package org.study.oop;

public class ClassBasicMain {
	
	//main -> 메서드
	//접근지정자 static 클래스메서드 반환타입 main(String[] args)
	public static void main(String[] args) {
		
//		                   객체 생성 연산자(new)-> stack에 주소생성
		ClassBasic c1=new ClassBasic();
		c1.userId="ckdtls1124";
		c1.userPw="1111";
		c1.age=1234;
		
		
		
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println("id: "+c1.userId);
		System.out.println("Pw: "+c1.userPw);
		System.out.println("Age: "+c1.age);
		
//		c1. ->> 클래스명에 .을 찍으면 정의된 필드와 object 클래스의 필드를 참조한다.
		
		
//		ClassBasic 타입에 객체를 생성하고 c2(객체참조변수)를 이용하여
//		userId-> "s1111", userPw-> "2222", age->30을 초기화 하고 콘솔에 출력하기
		System.out.println("==========other object===============");
		ClassBasic c2=new ClassBasic();
		
		c2.userId="s1111";
		c2.userPw="2222";
//		c2.age=30;
		c2.instanceMethod();
		
		System.out.println(c2);
		System.out.println("id: "+c2.userId);
		System.out.println("Pw: "+c2.userPw);
		System.out.println("Age: "+c2.age);
		
		
	}
}
