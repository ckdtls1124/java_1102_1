package org.study.ExceptionEx;

import java.util.Scanner;

public class ExcepitonEx4 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		Scanner input=new Scanner(System.in);
		
		
		try {
			System.out.print("Type first number: ");
			int num1=input.nextInt();
			System.out.print("Type second number: ");
			int num2=input.nextInt();
			
			System.out.print("Result of dividing: "+(num1/num2));
			System.out.println(" ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Exception occured.");
		}
		System.out.println("System ran successfully.");
		
		input.close();
	}	
}
