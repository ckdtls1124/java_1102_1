package org.study.conditionEx;

import java.util.Scanner;

public class Ifex2 {
	public static void main(String[] args) {
		System.out.println("조건이 하나일때");
		
		
		Scanner input=new Scanner(System.in);

//		점수를 입력해서 90점 이상이면 A, 
//		점수를 입력해서 80점 이상이면 B, 
//		점수를 입력해서 70점 이상이면 C, 
//		점수를 입력해서 60점 이상이면 D, 
//		점수를 입력해서 60점 미만이면 F, 
		
//		점수를 입력하시오.
		System.out.print("점수를 입력하시오:");
		int score=input.nextInt();
		
		if (score>= 90) {
			System.out.println("등급은 A입니다.");
		}
		else if (score>= 80) {
			System.out.println("등급은 B입니다.");
		}
//		조건이 참일때, 명령문이 한줄이라면, 중괄호를 입력하지 않아도 된다.
		else if (score>= 70) System.out.println("등급은 C입니다.");
		else if (score>= 60) {
			System.out.println("등급은 D입니다.");
		}
		else {
			System.out.println("등급은 F입니다.");
		}
		
		
		
		input.close();
	}
}
