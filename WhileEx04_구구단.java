package org.study.loopEx;


import java.util.Scanner;

public class WhileEx04_구구단 {
	public static void main(String[] args) {
		System.out.println("while문");
		
		System.out.println("구구단(2단~9단)");
		Scanner input=new Scanner(System.in);
		
		System.out.print("시작단을 입력:");
		int startNum=input.nextInt();
		
		System.out.print("끝단을 입력:");
		int endNum=input.nextInt();
		
		input.close();
		
//		시작단부터 끝단까지 loop
		while(startNum<=endNum) {
			System.out.println(startNum+"단입니다.");

//			시작단부터 끝단까지 1~9를 곱한다.
			int j=1;
			while(j<10) {
				System.out.println(startNum+"*"+j+"="+(startNum*j));
				j++;
			}
			
			startNum++;
		}
		
	
	}
}
