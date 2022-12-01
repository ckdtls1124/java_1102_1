package org.study.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.command.MemberDeleteDo;
import org.study.command.MemberInsertDo;
import org.study.command.MemberSelectDo;
import org.study.command.MemberUpdateDo;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("CRUD");

		BufferedReader input = null;
		String command = null;

		input = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.print("Type in command: ");
				command = input.readLine().trim();

				if (command.equals("Exit") || command.equals("exit")) {
					break;
				} else if (command.equals("Insert") || command.equals("insert")) {
					new MemberInsertDo().executeCommand();
				} else if (command.equals("Update") || command.equals("update")) {
					new MemberUpdateDo().executeCommand();
				} else if (command.equals("Select") || command.equals("select")) {
					new MemberSelectDo().executeCommand();
				} else if (command.equals("delete") || command.equals("Delete")) {
					new MemberDeleteDo().executeCommand();
				} else {
					System.out.println("Wrond command. Type in again");
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
