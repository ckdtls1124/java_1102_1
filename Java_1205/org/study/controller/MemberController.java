package org.study.controller;

import java.util.Scanner;

import org.study.command.CheckTable;
import org.study.command.Create;
import org.study.command.Delete;
//import org.study.command.Insert;
import org.study.command.Select;
import org.study.command.Update;

public class MemberController {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String command = null;

		while (true) {
			System.out.print("Type in the command: ");
			command = input.next();

			if (command.equals("Exit") || command.equals("exit")) {
				break;
			} else if (command.equals("Insert") || command.equals("insert")) {
				new CheckTable().executeCommand();
			} else if (command.equals("Update") || command.equals("update")) {
				new Update().executeCommand();
			} else if (command.equals("Select") || command.equals("select")) {
				new Select().executeCommand();
			} else if (command.equals("Delete") || command.equals("delete")) {
				new Delete().executeCommand();
			} else if (command.equals("Create") || command.equals("create")) {
				new Create().executeCommand();
			}
		}

		input.close();

	}
}
