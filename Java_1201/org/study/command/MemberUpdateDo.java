package org.study.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.dao.MemberDao;

public class MemberUpdateDo implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		BufferedReader input = null;
		String command = null;
		String id = null;
		String pw = null;
		int age = 0;
		int result = 0;

		input = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.print("Would you like to update your info?: ");
				command = input.readLine();
				if (command.equals("Yes") || command.equals("yes")) {
					//				execution
					System.out.print("What is your Id?: ");
					id = input.readLine();
					System.out.print("Change Pw?: ");
					pw = input.readLine();
					System.out.print("Change age?: ");
					age = input.read();

					MemberDao work = new MemberDao();
					result = work.update(id, pw, age);

					break;
				} else {
					System.out.println("Wrong command. Type in again");
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Member's info updating.");
	}

}
