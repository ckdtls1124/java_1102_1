package org.study.ExceptionEx;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepitonEx1 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		
//		Get the number from Scanner 
//		and divide it by the int num1
		int num1=100;
		
		
		
		try {
			
			Scanner input=new Scanner(System.in);
			System.out.print("type in the number: ");
			int num2=input.nextInt();
			
			System.out.println(num1/num2);
			System.out.println("정상실행");
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("산수 예외 발생");
		} catch (InputMismatchException e) {
			System.out.println("입력 값 예외 발생");
		}finally {
			System.out.println("예외와 상관없이 실행");
		}
		
		System.out.println("프로그램 정상 실행");
		
		
		
	}	
}
