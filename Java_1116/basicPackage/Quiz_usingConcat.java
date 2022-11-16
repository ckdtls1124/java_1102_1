package basicPackage;

import java.util.Scanner;

public class Quiz_usingConcat {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("userId: ");
		String userId=input.next();
		String a="userId=".concat(userId);
		System.out.println(a);
		
		System.out.println("userPw: ");
		String userPw=input.next();
		String b="userPw=".concat(userPw);
		System.out.println(b);
		
		System.out.println("userName: ");
		String userName=input.next();
		String c="userName=".concat(userName);
		System.out.println(c);
		
		System.out.println(a.concat("&").concat(b).concat("&").concat(c));
		
		input.close();	
	}
}
