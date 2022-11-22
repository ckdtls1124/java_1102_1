package org.study.DTO;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDTO2Controller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<MemberDTO2> list = new ArrayList<>();

		while (true) {
			System.out.println("======New Register======");
			System.out.print("Type ID: ");
			String id = input.next();
			System.out.print("Type email: ");
			String email = input.next();
			System.out.print("Type phone number: ");
			String phone = input.next();
			System.out.print("Type age: ");
			int age = input.nextInt();

			list.add(new MemberDTO2(id, email, phone, age));

			if (list.size() == 5) {
				break;
			}
		}
		System.out.println();
		System.out.println("5 people are registered.");

		// print out all the members
		for (MemberDTO2 memberDTO2 : list) {
			System.out.println("ID: " + memberDTO2.getUserId());
			System.out.println("Emali: " + memberDTO2.getEmail());
			System.out.println("Phone: " + memberDTO2.getPhone());
			System.out.println("Age: " + memberDTO2.getAge());
			System.out.println();
		}

		// Log in
		System.out.println("======Log in======");

		System.out.print("Type ID: ");
		String id = input.next();
		System.out.print("Type Email: ");
		String email = input.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUserId().equals(id) && list.get(i).getEmail().equals(email)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				break;
			}
		}
	}
}
