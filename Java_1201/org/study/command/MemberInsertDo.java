package org.study.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.dao.MemberDao;

public class MemberInsertDo implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub

		BufferedReader input = null;
		String id = null;
		String ps = null;
		int aGe = 0;
		int result = 0;

		MemberDao work = new MemberDao();
		input = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Type in ID: ");
			id = input.readLine().trim();
			System.out.print("Type in PASSWORD: ");
			ps = input.readLine().trim();
			System.out.print("Type in age: ");
			aGe = input.read();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Member is newly registered.");
		result = work.insert(id, ps, aGe);
		if (result == 0) {
			System.out.println("Registering failed.");
		} else {
			System.out.println("Registering succeeded.");
		}
	}
}
