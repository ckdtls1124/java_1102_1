package basicPackage;

import java.util.Calendar;

public class CalenderEx1 {
	public static void main(String[] args) {
		
		
		
		Calendar now=Calendar.getInstance();
		System.out.println(now.getTime());
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH+1));
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		System.out.println(now.get(Calendar.MILLISECOND));
		
		
		
	}
}
