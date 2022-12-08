package org1.study.DML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org1.study.Command.Command;
import org1.study.Dao.Dao;

public class Insert implements Command {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BufferedReader type = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		String action;
		String id;
		String write;
		String pw;

		try {
			while (true) {
				System.out.print("Would you like to register?: ");
				answer = input.next();
				if (answer.equals("No") || answer.equals("no")) {
					System.out.println("Things to do: {Write on board, delete my writing, etc}");
					System.out.print("What do you want to do?: ");
					action = input.next();
					if (action.equals("Write") || action.equals("write")) {

						System.out.print("What is your ID?: ");
						id = input.next();
						System.out.print("What would like to write?: ");
						write = type.readLine();
						Dao work = new Dao();
						work.writeOnBoard(id, write);
					}
					break;
				} else if (answer.equals("Yes") || answer.equals("yes")) {
					System.out.print("ID?: ");
					id=input.next();
					System.out.print("Pw?: ");
					pw=input.next();
					Dao work=new Dao();
					work.insert(id, pw);					
					break;
				} else {
					System.out.println("Type in again please");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
