package basicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx3 {
	
	
	public static void main(String[] args) {
		
		Date now=new Date();
		System.out.println(now);
		
		Date now1=new Date(2022-1900, 11, 16);
		System.out.println(now1);
		
		
		
		SimpleDateFormat a=new SimpleDateFormat("yyyy년MM월dd일");
		
		a.format(now);
		System.out.println(a.format(now));

		SimpleDateFormat a1=new SimpleDateFormat("yyyyMMdd hh시mm분ss초");
		
		a1.format(now);
		System.out.println(a1.format(now));
		
		
		
		
	}
	
	
}
