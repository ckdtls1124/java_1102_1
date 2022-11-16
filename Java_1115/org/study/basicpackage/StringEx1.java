package org.study.basicpackage;

public class StringEx1 {

	public static void main(String[] args) {

		System.out.println("String comparison");

		String str1="java2022";
		String str2=new String("java2022");
		
		
		char[] ch= {'j', 'a', 'v', 'a', '2', '0', '2', '2'};
		String str3=new String(ch);
		System.out.println(str3);
		System.out.println(" ");
		
		Integer a1=45;
		Integer a2=45;
		
		int a6=45;
		
		System.out.println(a1==a6);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));

		System.out.println(" ");
		
		Integer a3=new Integer(45);
		Integer a4=new Integer(45);
		
		System.out.println(a3==a4);
		System.out.println(a3.equals(a4));
		
		
		
		
	}

}
