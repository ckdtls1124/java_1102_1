package org.project.command;
import java.util.Scanner;
import org.project.dao.Dao;


public class Login implements ExecuteCommand{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		int result;
		Scanner input=new Scanner(System.in);
		String id;
		String pw;
		
		System.out.print("What is your id?: ");
		id=input.next();
		System.out.print("What is your pw?: ");
		pw=input.next();
		
		Dao.Singleton work=new Dao.Singleton();
		result=work.login(id, pw);
		
		if(result == 1) {
			System.out.println("Login succeeds.");
			new WriteOnBoard().executeCommand();
		} else {
			System.out.println("Failed to login.");
		}
		

	}

}
