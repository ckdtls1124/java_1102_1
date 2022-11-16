package org.study.basicpackage;



public class StringEx3 {

	public static void main(String[] args) {
		System.out.println("string");
		
		
		String str1="Java 2022 project";
		System.out.println(str1.length());
		String str2=str1.substring(5);
		System.out.println(str2);
		System.out.println(str1);
		
		String query1="/register.do";
		String query2="/list.do";
		String query3="/modify.do";
		String query4="/memberDelete.do";
		String query5="/modify.do";
		
		String a1=query1.substring(0,query1.length()-3);
		String a2=query2.substring(0,query2.length()-3);
		String a3=query3.substring(0,query3.length()-3);
		String a4=query4.substring(0,query4.length()-3);
		String a5=query5.substring(0,query5.length()-3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		
		String a1_1=query1.substring(query1.length()-3);
		System.out.println(a1_1);
		
		if(query1.substring(query1.length()-3).equals(".do")) {
//			action stub
			System.out.println("Execute");
		}


	}

}
