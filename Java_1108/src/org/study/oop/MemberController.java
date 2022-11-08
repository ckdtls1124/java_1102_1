package org.study.oop;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		//		Scanner register=new Scanner(System.in);
		//		MemberDTO newUser=new MemberDTO();
		//		
		//		System.out.println("회원 가입");
		////		set the data transfering through Scanner
		//		System.out.print("아이디를 입력하시오:");
		//		String id=register.nextLine();
		//		newUser.setUserId(id);
		//
		//		System.out.print("비밀번호를 입력하시오:");
		//		String ps=register.nextLine();
		//		newUser.setUserPs(ps);
		//		
		//		System.out.print("나이를 입력하시오:");
		//		int age=register.nextInt();
		//		newUser.setAge(age);
		//		
		//		register.close();
		//		System.out.println(" ");
		////		using getter to print on console
		//		
		//		System.out.println("아이디는 "+newUser.getUserId()+" 입니다.");
		//		System.out.println("비밀번호는 "+newUser.getUserPs()+" 입니다.");
		//		System.out.println("나이는 "+newUser.getAge()+" 입니다.");
		//		
		//		System.out.println("==========with while statement register=========");
		//		
		//		while(true)
		//		Scanner register1=new Scanner(System.in);
		//		MemberDTO newUser1=new MemberDTO();
		//		
		//		while(true) {
		//			System.out.print("do you want to register?(press 'exit' to cancel):");
		//			String newRegister=register1.next();
		////			nextLine을 쓰면 while문이 실행될때 엔터 값이 들어가서 else가 발동된다.
		//			
		//			if(newRegister.equals("exit")) {
		//				System.out.println("system is closing");
		//				break;
		//			}
		//			else if(newRegister.equals("Yes") || newRegister.equals("yes")) {
		////				execute
		//				System.out.print("아이디를 입력:");
		//				String id1=register1.next();
		//				newUser1.setUserId(id1);
		//				
		//				System.out.print("비밀번호를 입력:");
		//				String ps1=register1.next();
		//				newUser1.setUserPs(ps1);
		//				
		//				System.out.print("나이를 입력:");
		//				int age1=register1.nextInt();
		//				newUser1.setAge(age1);
		//				
		//				System.out.println(" ");
		//				
		//				System.out.println("아이디는 "+newUser1.getUserId()+" 입니다.");
		//				System.out.println("비밀번호는 "+newUser1.getUserPs()+" 입니다.");
		//				System.out.println("나이는 "+newUser1.getAge()+" 입니다.");
		//				System.out.println("==============================");
		//			}
		//			else {
		//				System.out.println("Wrong input.");
		//			}
		//			
		//		}
		//		register1.close();	

		//		아이디, 비밀번호를 저장하고, 저장된 아이디 비밀번호가 입력한 값이랑 둘 다 맞으면 "로그인 성공"
		//		아이디가 틀리면 "아이디가 틀렸습니다.", 비밀번호가 틀리면 "비밀번호가 틀렸습니다."

		System.out.println("================with while statement login================");

		Scanner inputLog=new Scanner(System.in);
		MemberDTO logInfo=new MemberDTO();

		//		register

		while(true) {
			System.out.print("Do you want to register?:");
			String register=inputLog.next();

			if(register.equals("No") || register.equals("no")) {
				System.out.println("System is closing.");
				break;
			}
			else if(register.equals("yes") || register.equals("Yes")) {
				//				execute

				System.out.print("Write your Id:");
				String id=inputLog.next();
				logInfo.setUserId(id);

				System.out.print("Write your Ps:");
				String ps=inputLog.next();
				logInfo.setUserPs(ps);

				System.out.print("Write your Age:");
				int age=inputLog.nextInt();
				logInfo.setAge(age);

				System.out.println("Successfully registered.");
				break;
			}else {
				System.out.println("Wrong input. Try again.");
			}

		}
		System.out.println(" ");
		while(true) {
			System.out.print("Would you like to log in?:");
			String login=inputLog.next();

			if(login.equals("no") || login.equals("No")) {
				System.out.println("System closing.");
				break;
			}
			else if (login.equals("Yes") || login.equals("yes")) {
				//				execute

				System.out.print("Enter your Id:");
				String idInput=inputLog.next();

				System.out.print("Enter password:");
				String psInput=inputLog.next();

				if(idInput.equals(logInfo.getUserId()) && psInput.equals(logInfo.getUserPs())) {
					System.out.println("Successfully logged in.\nEnjoy your time.");
					break;
				}
				else {
					System.out.println("Something's wrong. Type again.");
				}
			}
			else {
				System.out.println("Answer the question again.");
			}	
		}

		inputLog.close();























	}

}
