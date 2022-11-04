package org.study.conditionEx;

import java.util.Scanner;

public class Ifex1 {
	public static void main(String[] args) {
		System.out.println("조건이 하나일때");
		
		String id="ckdtls1124";
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요:");
		String userId=input.next();
		
		if (userId.equals(id)) {
			System.out.println("중복 아이디입니다.");
		}
		
		if (!userId.equals(id)) {
			System.out.println("중복 아이디가 아닙니다.");
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
		input.close();
	}
}
