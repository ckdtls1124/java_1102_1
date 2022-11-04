package org.java.variableex;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		System.out.println("Scanner");
		
		System.out.println("데이터를 입력하세요");
//		system은 java.lang에서 가져왔따.
		
		Scanner scn=new Scanner(System.in);
		
//		문자 입력
		String str1=scn.next();
		System.out.print("입력값:"+str1);
		
//		정수 입력
		Integer age=scn.nextInt();
		System.out.print("당신의 나이는?"+age);
		
		System.out.println();
		
		int i1 = 100;
//		float d1 = 12.5f;
		double d1 = 12.5;
		System.out.print(i1+d1);
//		int와 doulbe을 더하면, double이 그대로 나오나??
		
		scn.close();
	}
}
