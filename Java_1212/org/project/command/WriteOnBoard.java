package org.project.command;

import java.util.Scanner;

import org.project.dao.Dao;

public class WriteOnBoard implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		while (true) {

			Scanner input = new Scanner(System.in);
			String title;
			String content;
			String nickname;
			String writer;

			System.out.println("===Writing on board1212===");
			System.out.print("Your id?(press 'exit' to go out): ");
			writer = input.next();
			if (writer.equals("exit") || writer.equals("Exit")) {
				break;
			} else {
				System.out.print("Your nickname?: ");
				nickname = input.next();
				System.out.print("What's the title?: ");
				title = input.next();
				System.out.print("Write what you want: ");
				content = input.next();

				Dao.Singleton work = new Dao.Singleton();
				work.write(content, title, nickname, writer);
			}

		}

	}

}
