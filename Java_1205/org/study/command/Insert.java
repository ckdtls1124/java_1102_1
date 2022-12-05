package org.study.command;

import java.util.Scanner;

import org.study.dao.MemberDao;

public class Insert implements Command{
	
	String tablename;
	
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		int result=0;
		Scanner input=new Scanner(System.in);
		
//		String tablename=null;
		String userid=null;
		String userpw=null;
		String name=null;
		int userAge=0;
		String email=null;
		

		this.tablename=CheckTable.tablename;
		System.out.print("New ID: ");
		userid=input.next();
		System.out.print("New PW: ");
		userpw=input.next();
		System.out.print("Your name: ");
		name=input.next();
		System.out.print("Your age: ");
		userAge=input.nextInt();
		System.out.print("Your email: ");
		email=input.next();
		
		MemberDao work=new MemberDao();
//		work.insert(Tname.tablename, userid, userpw, name, userAge, email);
		result=work.insert(this.tablename, userid, userpw, name, userAge, email);
		if(result != 0) System.out.println("New registration went successful.");
	}
	
}
