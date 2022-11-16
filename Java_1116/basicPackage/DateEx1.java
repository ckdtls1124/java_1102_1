package basicPackage;

import java.util.Date;

public class DateEx1 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Date");
		
		Date date=new Date();
		System.out.println(date);
		
		
//		these methods are deprecated. Not recommended.
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
//		there are ways to extract each of the elements from "Wed Nov 16 15:11:28 KST 2022"
//		But all of the methods are deprecated.
		
		
	}
	
	
	
	
}
