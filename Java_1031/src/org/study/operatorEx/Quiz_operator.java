package org.study.operatorEx;

import java.util.Scanner;

public class Quiz_operator {
//	정수(양의 정수)를 입력하시오.
//	Scanner를 이용해서 정수를 입력 받고, 홀짝 여부 판단을 내리시오.
//	출력값이 "짝수입니다, 홀수입니다."를 출력해보시오.
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("정수(양의정수)를 입력하시오:");
		int num1=scn.nextInt();
//		Integer클래스를 이용하는 것과 int primitive type을 사용하는 것에는
//		저장 공간에 대한 차이가 있다. 
//		int를 사용하면, int에 알맞은 저장공간이 생성되어 좀 더 빠르게 쓸 수 있다.
		
		if (num1%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		scn.close();
	}
}

