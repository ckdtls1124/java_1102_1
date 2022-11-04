package org.study.operatorEx;

import java.util.Scanner;

public class Quiz_Operator9 {
	public static void main(String[] args) {
		System.out.println("비트연산자");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력:");
		int num1=input.nextInt();

		System.out.print("두번째 숫자 입력:");
		int num2=input.nextInt();
		
		System.out.print("수행할 연산자 입력(& or | or ^):");
		String oper=input.next();
		
		if(oper.equals("&")) {
			String binary=Integer.toBinaryString(num1&num2);
			System.out.println(num1&num2);
			System.out.println(binary);
		}else if(oper.equals("|")){
			String binary=Integer.toBinaryString(num1|num2);
			System.out.println(num1|num2);
			System.out.println(binary);
			
		}else if(oper.equals("^")){
			String binary=Integer.toBinaryString(num1^num2);
			System.out.println(num1^num2);
			System.out.println(binary);
			
		}else {
			System.out.println("연산자 입력 오류 다시 입력해주세요");
		}
		
		input.close();
		
	}
	
}

