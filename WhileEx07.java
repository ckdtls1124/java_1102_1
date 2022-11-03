package org.study.loopEx;

import java.util.Scanner;
//import java.io.BufferedReader;

public class WhileEx07 {
	public static void main(String[] args) {
		System.out.println("while(true)");
//		while(true) 이용해서
//		계산기(+-*/) exit를 입력하면 while문을 종료
//		정수 두 숫자 입력, 연산자 입력
//		연산자에 따라 연산을 실행
//		if~else 쓰기
		
//		Scanner input=new Scanner(System.in);
//		
//		while (true) {
//			System.out.print("계산을 실행하시겠습니까?(type y or exit):");
//			String order=input.next();
//			
//			if (order.equals("y")) {
//			
//				System.out.print("첫번째 정수 입력:");
//				int num1=input.nextInt();
//				System.out.print("두번째 정수 입력:");
//				int num2=input.nextInt();
//				System.out.print("연산자 입력(+-*/)중 하나:");
//				String op=input.next();
//				
//				if (op.equals("+")) {
//					System.out.println("더하기 값은:"+(num1+num2));
//				} 
//				else if (op.equals("-")) {
//					System.out.println("빼기 값은:"+(num1-num2));
//				} 
//				else if (op.equals("*")) {
//					System.out.println("곱하기 값은:"+(num1*num2));
//				} 
//				else if (op.equals("/")) {
//					System.out.println("나누기 값은:"+(num1/num2));
//				}
//				
//			} 
//			else if(order.equals("exit")){
//				System.out.println("종료합니다.");
//				break;
//			}
//			else {
//				System.out.println("잘못입력했습니다.\n다시 입력하십시오.");
//			}
//		}
//		input.close();
		
		System.out.println("===============================");
//		기존 방식
		Scanner input1=new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자1:");
			int num1=input1.nextInt();
			
			System.out.print("숫자2:");
			int num2=input1.nextInt();

			System.out.print("연산자:");
			String op1=input1.next();
			
			if (op1.equals("+")) {
				System.out.println(num1+num2);
			} 
			else if(op1.equals("*")){
				System.out.println(num1*num2);
			}
			else if(op1.equals("/")){
				System.out.println(num1/num2);
			}
			else if(op1.equals("-")){
				System.out.println(num1-num2);
			}
			else {
				System.out.println("잘못입력했습니다.");
				break;
			}
		}
		
		input1.close();
		
	}
}
