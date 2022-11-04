package org.study.operatorEx;

import java.util.Scanner;

public class Quiz_Ascii {
	public static void main(String[] args) {
		//대문자를 입력받아서 소문자로 변경
		//소문자를 입력받아 대문자로 변경
		//Scanner, .next(), .charAt()
		
//		Scanner 클래스의 객체 만들기
		Scanner input=new Scanner(System.in);
		
//		String으로 대문자 변수 받기-.charAt() 사용
		System.out.print("대문자 알파벳을 입력하시오:");
		char word=input.next().charAt(0);
		
		
//		대문자 변경 출력
		System.out.println("입력하신 알파벳을 소문자로 변경:"+(char)(word+32));
		
//		소문자는 반대로
		input.close();
	}
}
