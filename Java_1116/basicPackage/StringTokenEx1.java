package basicPackage;

import java.util.StringTokenizer;

public class StringTokenEx1 {
	
	public static void main(String[] args) {
		
		
		
		String ur1="userId=m1111&userPw=1111&userName=s1111";
		StringTokenizer token=new StringTokenizer(ur1, "&");
		System.out.println("토큰의 갯수: "+token.countTokens());
		
//		if there's token
		while(token.hasMoreTokens()) {
			String ntoken=token.nextToken();
			System.out.println(ntoken);
		}
		System.out.println("----------------------------------------------------");
//		Using StringTokenizer-print delimiters on console
		String phone="010-1234-5678";
		StringTokenizer token2=new StringTokenizer(phone, "-");
		
		System.out.println("토큰의 갯수: "+token2.countTokens());
		while(token2.hasMoreTokens()) {
			String ntoken=token2.nextToken();
			System.out.println(ntoken);
		}
		
	}
	
	
	
}
