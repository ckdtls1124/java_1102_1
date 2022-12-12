package org.project.controller;

import java.util.Scanner;

import org.project.command.Delete;
import org.project.command.Insert;
import org.project.command.Login;
import org.project.command.Select;
import org.project.command.SelectUserid;
import org.project.command.Update;

public class Controller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String command;

		while (true) {
			System.out.println("{login, register, update, select all, delete, userid(select)}");
			System.out.print("What would you like to do?: ");
			command = input.next();

			if (command.equals("Register") || command.equals("register")) {
				new Insert().executeCommand();
			} else if (command.equals("Exit") || command.equals("exit")) {
				System.out.println("Closing the program.");
				break;
			} else if (command.equals("update") || command.equals("Update")) {
				new Update().executeCommand();
			} else if (command.equals("Select all") || command.equals("select all")) {
				new Select().executeCommand();
			} else if (command.equals("Delete") || command.equals("delete")) {
				new Delete().executeCommand();
			} else if (command.equals("Login") || command.equals("login")) {
				new Login().executeCommand();
			} else if (command.equals("userid") || command.equals("Userid")) {
				new SelectUserid().executeCommand();
			}else {
				System.out.println("Wrong command. Type in again.");
			}
		}
		input.close();

	}
}
