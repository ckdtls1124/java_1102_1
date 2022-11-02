package org.study.loopEx;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		System.out.println("for문");
//		Scanner 이용해서, 시작단, 끝단 -> 2단, 5단 2~5
//		시작단, 끝단 입력을 받아서 콘솔에 출력
//		단, 시작단은 끝단보다 작다.
		
		Scanner inputNum=new Scanner(System.in);
		
		System.out.print("시작단을 입력:");
		int num1=inputNum.nextInt();
		System.out.print("끝단을 입력:");
		int num2=inputNum.nextInt();
		
		inputNum.close();
		
		if(num1<num2) {
			for (int i=num1;i<=num2;i++) {
				System.out.println(i+"단 입니다.");
				for (int j=num1;j<=num2;j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}			
		}
		else {
			System.out.println("잘 못 입력했습니다. 끝단을 시작단보다 큰 값으로 입력하세요.");
		}
		
	
	
	}
}
