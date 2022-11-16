package org.study.basicpackage;

import java.util.Scanner;

public class Java과제_강창신 {
	public static void main(String[] args) {

		// using Scanner, if the input is whether "exit" or not ending with ".do", close
		// the system
		// if not the both case, then re ask the question
		// when the order ends with ".do", execute the order as it says
		/*
		 * .do로 들어오고, 명령문이 잘못되면 while문을 재실행하여야 한다.
		 */
		// Scanner input = new Scanner(System.in);
		// while (true) {
		// System.out.print("Type in your order(Exit or exit to close): ");
		// String order = input.next();
		//
		// if (order.equals("exit") || order.equals("Exit")) {
		// break;
		// } else if (order.substring(order.length() - 3).equals(".do")) {
		// // 명령문 실행
		// if (order.substring(0, order.length() - 3).equals("/insert")) {
		// System.out.println("회원가입실행");
		// } else if (order.substring(0, order.length() - 3).equals("/update")) {
		// System.out.println("회원수정실행");
		// } else if (order.substring(0, order.length() - 3).equals("/select")) {
		// System.out.println("회원조회실행");
		// } else if (order.substring(0, order.length() - 3).equals("/delete")) {
		// System.out.println("회원탈퇴실행");
		// } else {
		// System.out.println("입력값 오류\n다시 입력하세요");
		// }
		// } else {
		// System.out.println("입력값 오류!\n다시 입력하세요.");
		// }
		// }
		// input.close();

		// ============================================

		Scanner input = new Scanner(System.in);
		boolean whileController = true;

		while (whileController) {
			System.out.print("Type in your order(Exit or exit to close): ");
			String order = input.next();
			String var1 = order.substring(order.length() - 3);
			String var2 = order.substring(0, order.length() - 3);

			// exit, .do, wrong input varaible

			switch (order) {
			case "exit":
				System.out.println("종료");
				whileController = false;
				break;
			case "Exit":
				System.out.println("종료");
				whileController = false;
				break;
								
			default:
				switch(var1) {
				case ".do":
					switch (var2) {
					case "/insert":
						System.out.println("회원가입실행");
						break;
					case "/update":
						System.out.println("회원수정실행");
						break;
					case "/select":
						System.out.println("회원조회실행");
						break;
					case "/delete":
						System.out.println("회원탈퇴실행");
						break;
					default:
						System.out.println("입력값 오류!\n다시 입력하세요.");
						break;
					}
				}
//				default:
//					System.out.println("입력값 오류!\n다시 입력하세요.");
//					break;
			}
		}
		input.close();

	}
}
