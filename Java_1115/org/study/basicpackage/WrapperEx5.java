package org.study.basicpackage;

public class WrapperEx5 {

	public static void main(String[] args) {

		System.out.println("Wrapper class");
		
		int i=10;
		Integer i2=new Integer(i);
		int i3=i2.intValue();

		Integer i4=10;
		int i5=i4;
		int i6=new Integer("1111");
		System.out.println(i4.toString());
//		toString method is in Object class
		
		Integer i7=new Integer("111");
		int i77=i7.intValue();
		System.out.println(i77);
		
		System.out.println("=====");
		String str="1111";
		int i8=Integer.parseInt(str);
		System.out.println(i8);
		
	}

}
