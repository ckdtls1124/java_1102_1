package org.study.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.command.MemberDelete;
import org.study.command.MemberInsert;
import org.study.command.MemberSelect;
import org.study.command.MemberUpdate;

public class MemberController {
	public static void main(String[] args) {

		BufferedReader input = null;
		String ask = null;

		try {
			while (true) {
				input = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("What would you like to do?(register, update, select, unregister): ");
				ask = input.readLine();
				if (ask.equals("register") || ask.equals("Register")) {
					new MemberInsert().executeCommand();
				} else if (ask.equals("No") || ask.equals("no")) {
					break;
				} else if (ask.equals("Update") || ask.equals("update")) {
					new MemberUpdate().executeCommand();
				} else if (ask.equals("select") || ask.equals("Select")) {
					new MemberSelect().executeCommand();
				} else if (ask.equals("unregister") || ask.equals("Unregister")) {
					new MemberDelete().executeCommand();
				} else {
					System.out.println("Wrong command. Type in again.");
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
