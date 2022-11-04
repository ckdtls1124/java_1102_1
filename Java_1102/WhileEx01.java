package org.study.loopEx;

public class WhileEx01 {
	public static void main(String[] args) {
		System.out.println("while문");
		
//		초기화를 바깥에 한다.
//		int i=0;  
//		
//		
//		while(i<10) {
//			if (i==9) {
//				System.out.println(i);
//			}
//			else {
//				System.out.print(i+",");
//			}
//			i++; //증감식을 적어줌으로써 무한루프에 빠지지 않도록 한다.
////				증감식의 위치에 따라 값이 달라진다.
//		}
		System.out.println("=============");
//		조건에 true를 넣고 0~9까지 출력
//		무조건 실행하고, 조건문을 넣어 해당 조건에 맞는 값을 출력한다.

		int i=0;
		while(true) {
			System.out.print(i);
			if (i==9)break;				
			i++; 
		}
	}
}
