package org.study.basicpackage;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("String");

		//		Multiple ways of making string
		String str1="J ava2020";
		String str2=new String("J ava2020");

		char[] ch1= {'J', 'a', 'v', 'a', '2', '0', '2', '0'};

		String str3=new String(ch1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println("String methods");
		System.out.println(str2.charAt(1)); // extract the character of the index in string
		//		blank is regarded as string
		System.out.println(str2.length()); // length
		System.out.println(str2.codePointAt(2)); // ascii number
		System.out.println(str1.compareTo("charlie"));

		System.out.println(" ");
		System.out.println("string concatenate");
		String s1="java";
		String s2=new String("oracle");
		String s3=s2.concat(s1);
		System.out.println(s1.concat(s2));

		System.out.println(" ");
		System.out.println("string contains");
		String strTest2="m1234";
		System.out.println(strTest2.contains("1"));

		System.out.println(" ");
		System.out.println("string replace");
		String strTest1="java 2022 project";
		System.out.println(strTest1.replace(" ", "-"));

		System.out.println(" ");
		System.out.println("string split");
		String phone="010-1234-4567";
		String[] phoneArr=phone.split("-");
		System.out.println(phoneArr);

		//		print out for statement

		for(int i=0; i<phoneArr.length; i++) {
			System.out.println(phoneArr[i]);
		}

		System.out.println(" ");
		for(String s:phoneArr) {
			System.out.println(s);
		}

		System.out.println("AbCd".toUpperCase());
		System.out.println("AbCd".toLowerCase());

		//		=======================================
		
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Write a first word: ");
		String word2=input.next().trim();
		System.out.print("Write a second word: ");
		String word1=input.nextLine();
		
		System.out.println(word1);
		System.out.println(word2);
		
		input.close();
		
		
	}

}
