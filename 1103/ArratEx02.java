package org.study.arrayEx;

//import java.util.Iterator;

//import java.util.Scanner;
//import java.io.BufferedReader;

public class ArratEx02 {
	public static void main(String[] args) {
		System.out.println("Array01");
		
//		=============================================
//		int[] arr1=new int[5];
//		System.out.println(arr1); //초기화한 배열의 주소값을 나타낸다.
//	
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		} /// 값을 초기화 하지 않으면 0으로 초기화 된다.
//		=============================================
		System.out.println("int 타입의 array, for사용");
		int[] arr1= {4, 1, 2, 3};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("int 타입의 array, foreach 사용");
		 
		 int[] arr2= {4, 1, 2, 3};
		 for(int i:arr2) {
			 System.out.println(i);
		 }
		 
		 System.out.println("char 타입의 array, foreach 사용");
		 
		 char[] arr3= {'a', 'b', 'c', 'd', 'e'};
		 for(int i:arr3) {
			 System.out.println(i);
		 }  //이렇게 하면, 각 알파벳에 대한 아스키 코드 값이 나온다.

		 System.out.println("char 타입의 array, for 사용");
		 
		 char[] arr4= {'a', 'b', 'c', 'd', 'e'};
		 for(int i=0; i<arr4.length; i++) {
			 System.out.println(arr4[i]);
		 }  
		 
		 System.out.println("String 타입의 array, foreach 사용");
		 
		 String[] arr5= {"a", "b", "c", "d", "e"};
		 for(String i:arr5) { 
			 System.out.println(i);
		 }  //이렇게 하면, 각 알파벳에 대한 아스키 코드 값이 나온다.
		 
		 
	}
}
