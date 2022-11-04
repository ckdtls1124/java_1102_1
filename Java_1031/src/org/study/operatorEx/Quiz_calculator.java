package org.study.operatorEx;

import java.util.Scanner;

public class Quiz_calculator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("두 정수를 각각 입력하시오");
		
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		
		System.out.print("연산자(+, -, *, /, %)중 하나를 입력하시오:");
		String cal=scn.next();
		
		int numSum=num1+num2;
		int numAbs=num1-num2;
		int numMul=num1*num2;
		int numDiv=num1/num2;
		int numLeft=num1%num2;
		
//		!important cal 변수는 기본형이 아니기 때문에, 값을 비교할때는, .equals() 메소드를 써야 한다.
		
		if (cal.equals("+")) {			
			System.out.print(num1+"+"+num2);
			System.out.print("두 정수의 합은"+numSum);
		}
		if (cal.equals("-")) {
			System.out.print("두 정수의 차는"+numAbs);
		}
		if (cal.equals("*")) {
			System.out.print("두 정수의 곱은"+numMul);
		}
		if (cal.equals("/")) {
			System.out.print("두 정수를 나눈 값은"+numDiv);
		}
		if (cal.equals("%")) {
			System.out.print("두 정수를 나눈 나머지는"+numLeft);
		}
		
		scn.close();
	}
}
