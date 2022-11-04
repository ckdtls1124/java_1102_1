package org.study.operatorEx;

import java.util.Scanner;

public class Operator1 {
	public static void main(String[] args) {
		
		System.out.println("산술연산자");
		
		int num1=10;
		int num2=20;
		
//		System.out.println("나무", num1);
		
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
//		int와 int를 나누면 int가 나오기 때문에 결과값을 낼때, 하나의 요소를 double로 바꿔주어야 한다.
		
		System.out.println("------space------");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 숫자(정수)를 입력받아 계산하시오");
		
		System.out.print("첫번째 숫자");
		int a1 = scn.nextInt();
		
		System.out.print("두번째 숫자");
		int a2 = scn.nextInt();
		
		System.out.println("합은"+(a1+a2)+"입니다.");
		System.out.println("곱은"+(a1*a2)+"입니다.");
		
		scn.close();
	}
}
