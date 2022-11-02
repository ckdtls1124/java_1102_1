package org.study.loopEx;


import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		System.out.println("for문");

		
//		int i=0;
		
		for (int i=0;i<10;i++) {
			if (i==9) {
				System.out.print(i);			
			}
//			''을 이용해서 쓰면, char이기 때문에 숫자가 나온다.
			else {
				System.out.print(i+",");							
			}
		}
		System.out.println("=================");
//		Scanner 이용하여, 변수 2개
//		첫번째 숫자 부터 두번째 숫자까지 있는 숫자를 입력
		Scanner inputNum=new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오:");
		int num1=inputNum.nextInt();
		System.out.print("두번째 숫자를 입력하시오:");
		int num2=inputNum.nextInt();
		
		inputNum.close();
		
//		입력된 첫번째 숫자, 두번째 숫자 사이의 정수 숫자들 출력하기
		
		if (num1<num2) {
			for (int i=num1;i<=num2;i++) {
				if (i==num2) {
					System.out.println(i);
				}else {
					System.out.print(i+",");
				}	
			}
		}else {
			System.out.println("숫자를 잘못입력하였습니다.");			
		}
		
	}
}
