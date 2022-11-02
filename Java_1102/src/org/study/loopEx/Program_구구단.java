package org.study.loopEx;

//import java.util.Scanner;

public class Program_구구단 {
	public static void main(String[] args) {
		System.out.println("구구단 프로그램");
		
		
//		-------------------값을 입력해서 구구단 계산하기---------------
//		System.out.print("(2~9)사이의 숫자중 하나를 입력하세요:");
//		Scanner input=new Scanner(System.in);
//		int num=input.nextInt();
//		input.close();
//	
//		for(int i=1;i<=9;i++) {
//			System.out.println(num+"*"+i+"="+num*i);
//			
//		}
		
//		--------------이중 for문으로 구구단 계산하기(오름차순)-------------------------
//		for (int i=2;i<10;i++){
//			System.out.println(i+"단 입니다.");
//			for(int j=1;j<10;j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//		}
		
//		--------------이중 for문으로 구구단 계산하기(내림차순)--------------------------
		for (int i=9;i>=2;i--){
			System.out.println(i+"단 입니다.");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
		
		
	}
}
