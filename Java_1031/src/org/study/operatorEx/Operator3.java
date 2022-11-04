package org.study.operatorEx;

import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		System.out.println("비교연산자");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("숫자1:");
		int num1=scn.nextInt();
		
		System.out.print("숫자2:");
		int num2=scn.nextInt();
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
		System.out.println("==========");

		scn.close();
		
//		객체의 비교는 하기와 같이 .equals() 메소드를 사용한다.
		String strAge1="나무";
		String strAge2="나무";
		System.out.println(strAge1.equals(strAge2));
		
		
		System.out.println("===========");
		Integer number1=34;
		Integer number2=34;
		System.out.println(number1.equals(number2));
		
	}
}
