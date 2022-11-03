package org.study.arrayEx;

//import java.util.Iterator;

//import java.util.Scanner;
//import java.io.BufferedReader;

public class ArratEx03_로또번호추출 {
	public static void main(String[] args) {
	System.out.println("로또 번호 추출");
		
	int[] lottery=new int[46];
	for(int i=1;  i<lottery.length; i++) {
		lottery[i]=i;
	}
	System.out.println("=====random한 숫자 뽑기========");
//	random 메소드를 사용한다.
//	Math.random(); 는 객체화 하지 않고 사용한다. 클래스 메서드라고 부른다. 													
//	System.out.println(Math.random()*10);
	
	int temp;
	
	for (int i = 0; i < 1000; i++) {
//		System.out.println(index);		
		int index=(int)(Math.random()*45);
		
		temp=lottery[index]; //random-> temp
		lottery[index]=lottery[0];//0번지 -> random
		lottery[0]=temp;
		
	}
	
	for(int j=0; j<6; j++) {
		if(j==5) {
			System.out.println(lottery[j]);
			break;
		}
		System.out.print(lottery[j]+",");
	}
		
	
	
	}
}
