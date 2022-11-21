package org.study.generic;

public class GenericEx1_Main <T>{

	 public static void main(String[] args) {
		 
		 GenericEx1<String> a1=new GenericEx1<String>();
		 
		 a1.m1("나무");
		 System.out.println(a1.m1(new String("하늘")));
		 
		 GenericEx1<Integer> a2=new GenericEx1<Integer>();
		 a2.m1(3424);
		 System.out.println(a2.m1(new Integer(1555)));
		 
		 
	}
}
