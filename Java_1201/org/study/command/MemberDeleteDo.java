package org.study.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.study.dao.MemberDao;
//import org.study.dto.MemberDto;

public class MemberDeleteDo implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		BufferedReader input = null;
		String command = null;
		String id = null;
		String pw = null;
		MemberDao memberInfo = new MemberDao();
		int result = 0;
		// ArrayList<MemberDto> check;
		boolean bool = true;

		try {

			while (bool) {
				input = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Would you like to delete member?: ");
				command = input.readLine();
				if (command.equals("yes") || command.equals("Yes")) {
					System.out.print("What is your ID?: ");
					id = input.readLine();
					System.out.print("What is your PW?: ");
					pw = input.readLine();
					result = memberInfo.delete(id, pw);

					if (result == 1) {
						System.out.println("Deleting member went successful.");
						bool = false;
					} else {
						System.out.println("Password doesn't match to ID.");
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
