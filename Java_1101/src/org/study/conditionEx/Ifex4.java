package org.study.conditionEx;

import java.util.Scanner;

public class Ifex4 {
	public static void main(String[] args) {
		System.out.println("조건이 두개일때");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score=input.nextInt();
		
//		90점 이상일때, A, 95점 이상일때 A+
		if (score>=90) {
			if (score>=95) {
				System.out.println("A+");
			}
			else {				
				System.out.println("A");
			}
		}else if (score>=80) { //		80점 이상일때, B, 95점 이상일때, B+
			if (score>=85) {
				System.out.println("B+");
			}
			else {				
				System.out.println("B");
			}
		}	
		
		
		input.close();
	}
}
