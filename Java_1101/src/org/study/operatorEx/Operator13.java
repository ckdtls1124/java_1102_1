package org.study.operatorEx;

import java.util.Scanner;

public class Operator13 {
	public static void main(String[] args) {
		System.out.println("아스키 코드");
		
		char c1='A';
		int c1_int='A';
		
		System.out.println(c1+", "+c1_int);
//		아래 값은 String 클래스의 문자
		System.out.println("a"+"A");
//		아래 값은 char의 문자. 따라서 아스키 코드 값으로 출력된다.
		System.out.println('a'+'A');
		System.out.println("===========");
//		예시
		System.out.println('A');
		System.out.println('A'+32);
		System.out.println((char)('A'+32));
		System.out.println('a'+1);
		System.out.println((char)('a'+2));
		
		Scanner input=new Scanner(System.in);
//		String str1=input.next();
//		String str2=input.nextLine();
		System.out.println("영어 단어를 입력하시오");
		char ch=input.next().charAt(0);
		System.out.println("입력한 단어의 첫글자:"+ch);
		
		input.close();
		
	}
	
}

