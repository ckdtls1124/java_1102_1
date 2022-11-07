package org.study.oop;


//(modifier) class class-name
public class ClassBasic {
	
	//fields, Attributes;
	// 접근지정자 타입, 필드명;
	public String userId;
	public String userPw;
	
//	하기 속성은 stack영역에 리터럴 값을 이미 저장한 경우다.
	public int age=56;
	
	//생성자->construct
	public ClassBasic() {
		System.out.println("생성자(기본)");
	}
	
	//접근지정자 반환 타입 매서드명(매개인자)
	public void  instanceMethod(){
		System.out.println("method(instance)");
	}
	
}


