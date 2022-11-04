package org.study.arrayEx;

//import java.util.Scanner;
//import java.io.BufferedReader;

public class ArratEx01 {
	public static void main(String[] args) {
		System.out.println("Array01");
		
//		int[] intList=new int[10]; // int 자료형 5개를 넣을 수 있는 배열을 만들었다.초기화를 함.
		
		int[] intList= {1, 2, 4, 4, 5, 6, 7, 8};
		
//		intList[0]=10;
//		intList[1]=20;
//		intList[2]=30;
//		intList[3]=40;
//		intList[4]=50;
//		
		
//		System.out.println(intList); //->> 이렇게 하면 저장된 배열의 주소값이 저장된다.
//		System.out.println(intList[1]); 
//		
//		for(int i=0;i<intList.length;i++) {
//			System.out.println(intList[i]=i*10+10);
//		}  //for 문을 이용하여 배열의 모든 요소 출력
//		System.out.println("===================");
//		for(int i=intList.length-1;0<=i;i--) {
//			System.out.println(intList[i]);
//		}  //for 문을 이용하여 배열의 모든 요소를 거꾸로 출력
//		
//		System.out.println("배열의 길이:"+intList.length);
		
		
		
//		foreach
		
		for(int i:intList) {
			System.out.println(i);
		}
	}
}
