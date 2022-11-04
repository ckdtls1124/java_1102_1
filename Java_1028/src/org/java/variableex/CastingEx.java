package org.java.variableex;

public class CastingEx {
	public static void main(String[] args) {
		System.out.println("형변화");
		
		int i=10;
		double d=1.1;
		
//		int i1=i+d; Type mismatch: cannot convert from double to int 에러 메시지 나타남.
		double d2=i+d;
		System.out.println(d2);
		
		System.out.println();
		
		byte b1=10;
		short b2=20;
//		byte b3=b1+b2; Type mismatch: cannot convert from int to byte 에러 메세지 나타남.
		int b3=b1+b2;
		System.out.println("형변화:"+b3);
		
//		강제 형변환
		int m=(int)1.1;
		System.out.println(m); //이렇게 하면, 1.1의 .1부분이 손실된다.
		byte b4=10;
		byte b5=10;
		byte b6=(byte)(b4+b5);
		System.out.println("강제형변화:"+b6);
		
		System.out.println("잠와 죽겠다");

	}
}
