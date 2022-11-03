package org.study.loopEx;

import java.util.Scanner;
//import java.io.BufferedReader;

public class WhileEx05 {
	public static void main(String[] args) {
		System.out.println("while(true)");
//		숫자 0이 입력되면 while문을 종료
		
		Scanner inputNum = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력:");
			int num=inputNum.nextInt();
			
			System.out.println("입력값:"+num);
			if (num==5) {
				break;
			}
		}

		inputNum.close();
		
		
	}
}
