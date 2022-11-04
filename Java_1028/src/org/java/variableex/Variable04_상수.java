package org.java.variableex;

public class Variable04_상수 {
	public static void main(String[] args) {
		System.out.println("상수(final)");
		
		final int NUM1=100;
//		final을 쓰면, 상수를 대문자로 쓰는 것이 암묵적인 룰이다.
//		여러단어로 구성된 이름의 경우, 의미마다 '_'로 구분한다.
//		num1=100;
//		num1=200; The final local variable num1 may already have been assigned 이라고 오류가 뜸

		System.out.println(NUM1);
		
		
//		자동 형 변환(Casting)
//		ex) 10 + 1.1 == int(4byte) + double(8byte) == double(8byte)
//			double b=int + double
//			int i=byte + byte or byte + short
//		1. 큰자료형 + 작은자료형 >> 큰자료형 + 큰자료형
//		int + double = double + double
//		int i=10+1.1;
//		double d=10+1.1;
		
//		2. int 형 아래 자료혀의 연산시 자동으로 int형으로 전환
//		byte b=10;
//		byte b2=10;
//		byte b3=b+b2;//byte+byte=int+int
//		
//		int b3=b+b2;
//		byte b3=(byte)(b+b2);
			
	
	}
}

