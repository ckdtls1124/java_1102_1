package org.java.variableex;

public class Variable02 {
	public static void main(String[] args) {
		System.out.println("===자바의 객체형 타입===");
		            //객체 생성 -> 임의의 주소값
		String str1=new String();
		str1="문자열 data";
		
		String str2="문자열2 data"; //new를 생략할 수 있다.
		System.out.println();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str2.length());
		
		//클래스(사용자 정의 타입)//BasicClass 객체생성
		BasicClass class1=new BasicClass();
		
		
	}
}

