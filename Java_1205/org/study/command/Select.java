package org.study.command;

import java.util.ArrayList;

import java.util.Scanner;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class Select implements Command {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
//		ArrayList<MemberDto> result = new ArrayList<MemberDto>();
		//		Type in the query and then show the results of the query
		//		get data from table in the age range, which input by scanner
		Scanner input = new Scanner(System.in);
		MemberDao work = new MemberDao();
		String command = null;
		int a1;
		int a2;

		while (true) {
			System.out.print("Would you like to find in age range?: ");
			command = input.next();
			if (command.equals("No") || command.equals("no")) {
				//			other way
				break;
			} else if (command.equals("Yes") || command.equals("yes")) {
				System.out.print("Type in age from: ");
				a1 = input.nextInt();
				System.out.print("Type in age to: ");
				a2 = input.nextInt();

				ArrayList<MemberDto> result = work.selectAgeRange(a1, a2);
				for (MemberDto i : result) {
					System.out.println("ID: " + i.getUserid() + "," + "PW: " + i.getUserpw() + "," + "Name: "
							+ i.getName() + "," + "Age: " + i.getUserAge() + "," + "Email: " + i.getEmail());
				}
//				break;
			} else {
				System.out.println("Wrong command. Type in again.");
			}
		}

	}

}
