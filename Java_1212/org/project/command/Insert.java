package org.project.command;

import java.util.Scanner;

import org.project.dao.Dao;

public class Insert implements ExecuteCommand{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		System.out.println("New register");
		Scanner input=new Scanner(System.in);
		String id;
		String pw;
		String email;
		int result=0;
		
		System.out.print("Type in your new id:");
		id=input.next();
		System.out.print("Type in your new pw:");
		pw=input.next();
		System.out.print("Type in your new email:");
		email=input.next();
		
		
		Dao.Singleton work= new Dao.Singleton();
		result=work.insert(id, pw, email);
		if(result != 0) {
			System.out.println("Registering was successful.");
		} else {
			System.out.println("Registering failed.");
		}
		
		
	}

}
