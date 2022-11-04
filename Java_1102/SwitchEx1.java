package org.study.conditionEx;


import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("Switch");
		Scanner input=new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오:");
		int key=input.nextInt();
		input.close(); //scanner object를 닫는 메소드는 next()메소드를 사용하고 바로 아래에 close()를 입력해도 된다.
		
		String a="관리자권한";
		String b="중간관리자권한";
		String c="일반사원권한";
		
		
		switch(key) {
		case 1:
			System.out.println(a);
			break;
		case 2:
			System.out.println(b);
			break;
		case 3:
			System.out.println(c);
			break;
		default:
			System.out.println("1, 2, 3이 아닙니다.");
			
		}
		
		System.out.println("==============");
		
		char ch='C';
//		case를 여러개 써서 나타낼 수 있다.
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println('A');
			break;
		case 'b':
		case 'B':
			System.out.println('B');
			break;
		case 'c':
		case 'C':
			System.out.println('C');
			break;
		default:
			System.out.println("A, B, C중 없습니다.");
			
		}
		
		
	
	}
}
