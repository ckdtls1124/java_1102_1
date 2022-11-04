package org.study.operatorEx;

//import java.util.Scanner;

public class Operator6 {
	public static void main(String[] args) {
		
		System.out.println("조건 연산자");
		System.out.println("-논리합 연산");
		System.out.println(false || false);
//		false를 true로 바꿨을때,  true거나 true면 true다.
//		마찬가지로 틀리거나, 틀리면, 틀리는 거다. 
//		이에 대한 예시로, 아이디 비밀번호를 입력했을 때, 두 정보중 하나가 틀리면 로그인 실패다.
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
		System.out.println("================");
		
		System.out.println("-Xor 연산자");
//		비교하는 값이 서로 다를 때, true를 출력
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		System.out.println(false ^ false);		
		
		String userId="m111";
		String userPs="1111";
		
		System.out.println("--------login-----");
		System.out.println(userId.equals("m111"));
		System.out.println(userPs.equals("1111"));
		
		boolean bool1=userId.equals("m111");
		boolean bool2=userPs.equals("1111");
		
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
		System.out.println(!bool1 || bool2);
		System.out.println(!bool1 || !bool2);
		
		
		
	}
}
