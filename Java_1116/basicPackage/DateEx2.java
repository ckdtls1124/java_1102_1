package basicPackage;

import java.util.Date;

public class DateEx2 {
	
	
	public static void main(String[] args) {
		
		
		Date now=new Date();
		
		System.out.println(now);
		
		
		
		
		int weekday=now.getDay();
		String today="";
		
		switch (weekday) {
		case 0:
			today="일요일";
			break;
		case 1:
			today="월요일";
			break;
		case 2:
			today="화요일";
			break;
		case 3:
			today="수요일";
			break;
		case 4:
			today="목요일";
			break;
		case 5:
			today="금요일";
			break;
		case 6:
			today="토요일";
			break;

		default:
			System.out.println("요일 선택 오류");
			break;
		}
	
		
		System.out.println("오늘은 "+today);
		
		
	}
	
	
}
