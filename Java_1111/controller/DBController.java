package org.study.controller;

import org.study.command.DBDelete;
import org.study.command.DBInsert;
import org.study.command.DBSelect;
import org.study.command.DBUpdate;
import org.study.command.SQLQueryCommand;
import java.util.Scanner;

public class DBController {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		while(true) {
			System.out.print("Type in your command: ");
			String command=input.next();
			
			if(command.equals("exit") || command.equals("Exit")) {
				System.out.println("Closing the controller");
				break;
			}
			else if(command.equals("insert") || command.equals("Insert")) {			
				SQLQueryCommand insert=new DBInsert();
				insert.executeQueryCommand();
			}
			else if(command.equals("select") || command.equals("Select")) {			
				SQLQueryCommand select=new DBSelect();
				select.executeQueryCommand();			
			}
			else if(command.equals("update") || command.equals("Update")) {			
				SQLQueryCommand update=new DBUpdate();
				update.executeQueryCommand();			
			}
			else if(command.equals("delete") || command.equals("Delete")) {			
				SQLQueryCommand delete=new DBDelete();
				delete.executeQueryCommand();
			}
			else {
				System.out.println("Wrongfully typed.\nPlease type the word correctly.");
			}
		}
		input.close();
		
		
	}
}
