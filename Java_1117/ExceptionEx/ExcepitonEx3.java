package org.study.ExceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepitonEx3 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		Scanner input=new Scanner(System.in);
		System.out.print("Type int integer: ");
		
		
		try {
			int num=input.nextInt();
			System.out.println(num);
			System.out.println("success");
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("예외 발생");
		} finally {
			System.out.println("기본 실행");
		}
		
		System.out.println("프로그램 정상 실행");
		
		input.close();
		
		
		
		
	}	
}
