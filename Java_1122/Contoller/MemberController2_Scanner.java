package org.study.Contoller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.study.DTO.MemberDTO;

public class MemberController2_Scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<MemberDTO> member = new ArrayList<MemberDTO>();

		// Initialising 5 elements, no userId overlapping
		while (true) {
			System.out.print("Would you like to register?:");
			String register = new String(input.next());
			if (register.equals("Exit") || register.equals("exit")) {
				break;
			} else {
				System.out.print("Type in ID: ");
				String idInput = input.next();
				System.out.print("Type in PW: ");
				String pwInput = input.next();
				System.out.print("Type in Email: ");
				String emailInput = input.next();
				System.out.print("Type in age: ");
				int ageInput = input.nextInt();

				member.add(new MemberDTO(idInput, pwInput, emailInput, ageInput));

				System.out.println("Registering completed.");
			}
		}
		Iterator<MemberDTO> memberInfo = member.iterator();
		while (memberInfo.hasNext()) {
			MemberDTO i = memberInfo.next();
			System.out.print("Your ID: " + i.getUserId() + " ");
			System.out.print("Your PW: " + i.getUserPw() + " ");
			System.out.print("Your email: " + i.getEmail() + " ");
			System.out.println("Your age: " + i.getAge() + " ");
		}

		//		====================Data exclusive to me====================
		System.out.println("Customer's list");
		for (MemberDTO memberDTO : member) {
			System.out.println("Registered customer: " + memberDTO.getUserId() + " ");
		}
		input.close();
	}
}
