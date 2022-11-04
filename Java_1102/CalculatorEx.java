package org.study.conditionEx;


import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		System.out.println("Switch");
		Scanner input=new Scanner(System.in);
//		switch나 if문을 사용하여 산술연산자의 결과 값을 표시하시오
		
		System.out.print("첫번째 숫자를 입력하시오:");
		int num1=input.nextInt();
		System.out.print("두번째 숫자를 입력하시오:");
		int num2=input.nextInt();
		System.out.print("연산자를 입력하시오:");
		char op=input.next().charAt(0); //next()메소드는 String을 받기 때문에, charAt(index)를 사용하여 char을 받는다.
			
		input.close(); //scanner object를 닫는 메소드는 next()메소드를 사용하고 바로 아래에 close()를 입력해도 된다.
		
		int a=num1+num2;
		int b=num1-num2;
		int c=num1*num2;
		double d=(double)(num1)/num2;
		
		
		switch(op) {
		
		case '+':
			System.out.println(num1+"+"+num2+"="+a);
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+b);
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+c);
			break;
		case '/':
			System.out.println(num1+"/"+num2+"="+d);
			break;
		default:
			System.out.println("연산자를 잘못 입력했습니다.\n다시 입력하세요");
		}
		
//		double + double == int 일경우가 가능할까?
//		System.out.println("===========");
//		
//		double a1=1.6;
//		double b1=1.4;
//		int c1=(int)(a1+b1);
//		System.out.println(c1);
	}
}
