package java_operator;

import java.util.Scanner;

public class Java_operator_1031 {
	
	public static void main(String[] args) {
		
		System.out.println("Scanner");
//		프로그래머가 입력
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("주소를 입력하세요;");		
		String addr = scn.nextLine(); //입력 문자열을 return;
		System.out.println("주소는"+addr+"입니다.");
		
		System.out.print("나이를 입력하세요");
		Integer name = scn.nextInt();
		System.out.println("나이는"+name+"살 입니다.");
		
		System.out.print("키를 입력하세요:");
		Double hei = scn.nextDouble();
		System.out.println("키는"+hei+"m입니다.");
		
		System.out.println("--------------");
		System.out.print("첫번쩨 숫자(정수) 입력:");
		int first=scn.nextInt();
		
		System.out.print("두번재 숫자(정수) 입력:");;
		int two = scn.nextInt();
		
		System.out.println(first+"+"+two+"="+(first+two));
		

		
	}
}
