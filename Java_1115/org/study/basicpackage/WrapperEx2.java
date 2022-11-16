package org.study.basicpackage;

public class WrapperEx2 {

	public static void main(String[] args) {

		int i=10;
		
		Integer i2=new Integer(i);
		System.out.println(Integer.bitCount(i));
//		2진수 변환시, 1의 갯수
		
		System.out.println(Integer.parseInt("341"));
		
		System.out.println(Integer.toBinaryString(1000));
		System.out.println(Integer.toHexString(1000));
		System.out.println(Integer.toOctalString(1000));
		
	}

}
