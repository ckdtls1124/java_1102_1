package org1.study.Controller;

import java.util.Scanner;

import org1.study.DDL.Alter;
import org1.study.DDL.Create;
import org1.study.DDL.Drop;
import org1.study.DML.Delete;
import org1.study.DML.Insert;
import org1.study.DML.Select;
import org1.study.DML.Update;

public class Controller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String command;

		while (true) {

			System.out.println("1. DDL: {create, drop, alter}" + "\n" + "2. DML: {insert, select, update, delete}");
			System.out.print("Type in command: ");
			command = input.next();
			if (command.equals("exit") || command.equals("Exit")) {
				break;
			} else if (command.equals("Create") || command.equals("create")) {
				new Create().executeCommand();
			} else if (command.equals("Drop") || command.equals("drop")) {
				new Drop().executeCommand();
			} else if (command.equals("Alter") || command.equals("alter")) {
				new Alter().executeCommand();
			} else if (command.equals("Insert") || command.equals("insert")) {
				new Insert().executeCommand();
			} else if (command.equals("Select") || command.equals("select")) {
				new Select().executeCommand();
			} else if (command.equals("Update") || command.equals("update")) {
				new Update().executeCommand();
			} else if (command.equals("Delete") || command.equals("delete")) {
				new Delete().executeCommand();
			} else {
				System.out.println("Wrong command. Please type in again");
			}
		} input.close();

	}
}
