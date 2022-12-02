package org.study.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.study.dao.MemberDao;

public class MemberInsert implements MemberCommand{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		BufferedReader input=null;
		String id=null;
		String pw=null;
		String age=null;
		String email=null;
		int result=0;
		
		MemberDao work=new MemberDao();
		
		try {
			input=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("ID?: ");
			id=input.readLine();
			System.out.print("PW?: ");
			pw=input.readLine();
			System.out.print("Email?: ");
			email=input.readLine();
			System.out.print("Age?: ");
			age=input.readLine();
			
			
			result=work.insert(id, pw, age, email);
			if (result != 0) {
				System.out.println("Registration succeeded.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Input went wrong.");
		} 
	}

}
