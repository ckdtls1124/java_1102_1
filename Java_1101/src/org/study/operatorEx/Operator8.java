package org.study.operatorEx;

//import java.util.Scanner;

public class Operator8 {
	public static void main(String[] args) {
		
		System.out.println("조건 연산자");
		
		int i=10;
//		if(i>10) {
//			System.out.println("10보다 큽니다.");
//		}
//		else {
//			System.out.println("10보다 크지 않습니다.");
//		}
		boolean rs=i>10 ? true:false;
		System.out.println(rs);
		System.out.println("========");
//		하기와 같은 경우에는, String 클래스로 받아주면 된다.
		String a=i>10 ? "10보다 큽니다.":"10보다 크지 않습니다.";
		System.out.println(a);
	}
}
