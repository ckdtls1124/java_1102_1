package org.study.command;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class Create implements Command{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String tablename;
		System.out.print("What kind of name would you want?: ");
		tablename=input.next();
//		System.out.print("Userid, userpw, name, userage, and email will be allocated. What else would you like to have?: ");
		
		
		MemberDao work=new MemberDao();
		if(work.create(tablename) != 0) {
			System.out.println("Creating a table was successful.");
		}
	}
	
}
