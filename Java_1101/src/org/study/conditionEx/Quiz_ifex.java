package org.study.conditionEx;

import java.util.Scanner;

public class Quiz_ifex {
	public static void main(String[] args) {
		System.out.println("국영수 과목 평균 계산");
//		출력내용
//		총점:??
//		평균:??
//		학점:??
		
		Scanner input=new Scanner(System.in);
		
//		국어점수 입력
		System.out.print("국어점수를 입력:");
		int kor=input.nextInt();
		
//		수학점수 입력
		System.out.print("수학점수 입력:");
		int math=input.nextInt();
		
//		영어점수 입력
		System.out.print("영어점수 입력:");
		int eng=input.nextInt();
		
//		총점
		int sum=kor+math+eng;
		
//		평균
		int avr=(kor+math+eng)/3;
//		double을 이용해서 실수 만들기
		double avr1=(double)(avr)/3; // 변수 값이랑 나누는 값에 double을 입력해야 한다.
		
//		if문으로 출력
		if (avr>=90) {
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avr1);
			System.out.println("학점:A");
		}
		else if (avr>=80) {
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avr1);
			System.out.println("학점:B");
		}
		else if (avr>=70) {
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avr1);
			System.out.println("학점:C");
		}
		else if (avr>=60) {
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avr1);
			System.out.println("학점:D");
		}
		else{
			System.out.println("총점:"+sum);
			System.out.println("평균:"+avr1);
			System.out.println("학점:F");
		}
		
		input.close();
		
		
	}
}
