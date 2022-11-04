package org.study.operatorEx;

import java.util.Scanner;

public class Operator4 {
	public static void main(String[] args) {
		
		System.out.println("비교연산자-객체간");
		
		String str1=new String("java");
		String str2=new String("java");
		String str3="java";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("java"=="java");
//		객체와 기본 자료형, 값이 동일한 서로다른 객체는비교연산자로 비교하기가 불가하다.
//		그 이유는 객체 사이의 비교연산자는 주소를 비교하기 때문에, 동일한 값을 가지고 있는 서로다른 객체의 비교는
//		주소가 달라서 false가 나온다.
		
		System.out.println(str1=="java");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println("===========");
		System.out.println(str1.equals(str3));

		System.out.println("id, pw를 scanner로 입력받아서 알맞은 값인지 비교하기");
//		id가 일치하면, "아이디가 일치합니다." 출력
//		ps가 일치하면, "비밀번호가 일치합니다." 출력
		
		Scanner scn=new Scanner(System.in);
		
//		비교할 객체 선언
		String userId="ckdtls1124";
		String userPw="ckdtls1124!";
		
//		id 입력	
		System.out.println("아이디를 입력하세요");
		String id=scn.nextLine();

//		id 값 판단;
		if (id.equals(userId)){
			System.out.println("아이디가 일치합니다.");
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
//		ps 입력
		System.out.println("비밀번호를 입력하세요");
		String ps=scn.nextLine();
		
//		ps 값 판단;
		if(ps.equals(userPw)){
			System.out.println("비밀번호가 일치합니다.");
		}
		else{
			System.out.println("비밀번호가 틀렸습니다.");
		}
		scn.close();
		
	}
}
