package org.study.operatorEx;

import java.util.Scanner;

public class Operator5 {
	public static void main(String[] args) {
		
		System.out.println("조건 연산자");
		
		String userId=new String("ckdtls1124");
		String userPs=new String("ckdtls11241");
		
		System.out.println("아이디 비교");
		System.out.println(userId.equals("ckdtls1124"));
		System.out.println("=====================");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("================");
//		아이디, 비밀번호가 동시에 일치하면, "로그인 성공", 그렇지 않으면, "로그인 실패"
//		콘솔에 출력
//		Scanner을 통해서 아이디와 비밀번호 입력을 받는다.
		
		String userId1=new String("ckdtls1124");
		String userPs1=new String("ckdtls11241");
//		객체 선언된 String과 아래에 Scanner로 받은 String 클래스의 값을 비교하는 것은
//		.equals()를 이용하여 값만 비교가 가능하다.
		
		Scanner scn=new Scanner(System.in);
		
//		ID 입력
		System.out.print("아이디를입력하세요:");
		String inputId=scn.nextLine();
		
		
//		PS 입력
		System.out.print("비밀번호를 입력하세요:");
		String inputPs=scn.nextLine();
		
		if (userId1.equals(inputId) && userPs1.contentEquals(inputPs)) {
			System.out.println("아이디와 비밀번호가 일치합니다.");
		}
		else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		scn.close();
	}
}
