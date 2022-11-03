package org.study.loopEx;

import java.util.Scanner;
//import java.io.BufferedReader;

public class WhileEx06 {
	public static void main(String[] args) {
		System.out.println("while(true)");
//		while(true)를 이용해서
//		아이디와 비밀번확 일치하면 while문을 종료("로그인 성공")
//		일치하지 않으면 "로그인 실패" 출력하고 다시 입력
//		로그인 성공하면 while 문을 종료하는 프로그램을 작성
//		while, if, break, Scanner
		
		Scanner dbInput=new Scanner(System.in);
		
		while (true) {
			System.out.print("아이디 입력:");
			String dbId=dbInput.nextLine();
			System.out.print("비밀번호 입력:");
			String dbPs=dbInput.nextLine();
			
			String a="로그인 성공";
			String b="로그인 실패";
			
			if (dbId.equals("ckdtls1124") && dbPs.equals("ckdtls11241")) {
				System.out.println(a);
				break;
			} 
			else {
				
				System.out.println(b);
			}
		}
		dbInput.close();
		
		
	}
}
