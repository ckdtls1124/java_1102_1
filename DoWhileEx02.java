package org.study.loopEx;

import java.util.Scanner;


public class DoWhileEx02 {
	public static void main(String[] args) {
		System.out.println("DoWhileEx02-구구단");
		
//		int i=2;
//		
//		do {
//			System.out.println(i+"단입니다.");
//			
//			int j=1;
//			do {
//				System.out.println(i+"*"+j+"="+(i*j));
//				j++;
//			} while (j<10);
//			
//			i++;
//		} while (i<10);
//		
		
//		시작단, 끝단 입력 받아서 시작부터 끝까지 구구단을 콘솔에 입력		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("시작단 입력:");
		int num1=input.nextInt();
		System.out.print("끝단 입력:");
		int num2=input.nextInt();
		
		do {
			System.out.println(num1+"단입니다.");
			
			int mulNum=1;
			do {
				System.out.println(num1+"*"+mulNum+"="+(num1*mulNum));
				mulNum++;
			} while (mulNum<10);
			
			num1++;
		} while (num1<=num2);
		
		input.close();
		
		
		
		
		
	}
}
