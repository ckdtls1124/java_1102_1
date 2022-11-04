package org.study.conditionEx;

import java.util.Scanner;

public class Ifex3 {
	public static void main(String[] args) {
		System.out.println("조건이 두개일때");
		
		Scanner input=new Scanner(System.in);
		
//		아이디 비밀번호를 입력 받아서
//		아이디와 비밀번호가 일치하면 로그인 성공
//		하나라도 틀리면 로그인 실패 콘솔에 출력
		
		String id="ckdtls1124";
		String ps="ckdtls11241";
		
		System.out.print("아이디를 입력:");
		String userId=new String(input.next());
		System.out.print("비밀번호를 입력:");
		String userPs=new String(input.next());
	
		if (userId.equals(id) && userPs.equals(ps)) {
			System.out.println("로그인에 성공하셨습니다.");
		}
		else {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.\n다시 입력해주시기 바랍니다.");
		}

////	!important	또다른 방법으로 할 수 있다.
//		if (!userId.equals(id) || !userPs.equals(ps)) {
//			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.\n다시 입력해주시기 바랍니다.");
//		}
//		else {
//			System.out.println("로그인에 성공하였습니다.");
//		}
//		
		
		input.close();
	}
}
