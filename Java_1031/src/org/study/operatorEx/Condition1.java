package org.study.operatorEx;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
			System.out.println("조건문");

			Scanner scn=new Scanner(System.in);
			
			
			System.out.print("숫자를 입력하세요:");
			int a1=scn.nextInt();


			if (a1>10) {
				System.out.println("입력한 값은 10보다 큽니다.");
			}
			else {
				System.out.println("입력한 값은 10보다 작습니다.");
			}
			
			
			scn.close();
			

			
		}
}
