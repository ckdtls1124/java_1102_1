package org.study.Controller;


import java.util.Scanner;

import org.study.Command.CRUDCommand;
import org.study.Command.DBDeleteCommand;
import org.study.Command.DBInsertCommand;
import org.study.Command.DBSelectCommand;
import org.study.Command.DBUpdateCommand;

public class MemberController {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		CRUDCommand command=null;
		
		while(true) {
			System.out.print("Enter query: ");
			String query=input.next();
			
			if(query.equals("Exit")) {
				break;
			}
			else if(query.equals("insert")) {
				command=new DBInsertCommand();
				command.executeCommand();
			}
			else if(query.equals("update")) {
				command=new DBUpdateCommand();
				command.executeCommand();
			}
			else if(query.equals("select")) {
				command=new DBSelectCommand();
				command.executeCommand();
			}
			else if(query.equals("delete")) {
				command=new DBDeleteCommand();
				command.executeCommand();
			}
			else {
				System.out.println("Wrong query.\nTry again");
			}

		}
		
		input.close();
		
		
	}
}
