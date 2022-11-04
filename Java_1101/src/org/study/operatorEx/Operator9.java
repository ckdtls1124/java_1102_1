package org.study.operatorEx;

public class Operator9 {
	public static void main(String[] args) {
		System.out.println("비트연산자");

		System.out.println(1&1);
		System.out.println(1&0);
		System.out.println(0&1);
		System.out.println(0&0);
//		10과 12의 "&" 비트연산 결과는 2진수 자릿수를 비교하여
//		1000이라는 8의 값이 나온다.
//		10=1010 // 12=1100 따라서, 앞자리 1만이 &에 걸린다.
		System.out.println(10&12);

		System.out.println("=========");
		
		System.out.println(1|1);
		System.out.println(1|0);
		System.out.println(0|1);
		System.out.println(0|0);

		System.out.println(10|12);

		System.out.println("=========");
		
		System.out.println(1^1);
		System.out.println(1^0);
		System.out.println(0^1);
		System.out.println(0^0);
		
		System.out.println(10^12);
		
		System.out.println("=========");

		System.out.println(~10);
//		10은 00000000 00000000 00000000 00001010 이다.
//		여기서 ~10이면 맨 앞자리 부호 값을 바꾼다.따라서 -가 된다.
		
		System.out.println("==========");
		
		int i1=10; //10진수
		int i2=0b111; //2진수
		int i3=0111; //8진수
		int i4=0xaaa; //16진수
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
	
}

