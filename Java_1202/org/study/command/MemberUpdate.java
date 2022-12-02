package org.study.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.dao.MemberDao;

public class MemberUpdate implements MemberCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		BufferedReader input = null;
		String id = null;
		String pw = null;
		String age = null;
		String email = null;
		int result = 0;
		input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("What is your ID?: ");
			id = input.readLine();
			System.out.print("Change PW?: ");
			pw = input.readLine();
			System.out.print("Change Email?: ");
			email = input.readLine();
			System.out.print("Change Age?: ");
			age = input.readLine();
//			age = Integer.parseInt(age);

			MemberDao work = new MemberDao();
			result = work.update(id, pw, age, email);
			if (result != 0) {
				System.out.println("Successfully updated.");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
