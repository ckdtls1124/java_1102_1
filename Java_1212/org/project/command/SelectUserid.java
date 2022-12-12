package org.project.command;

import java.util.ArrayList;
import java.util.Scanner;

import org.project.dao.Dao;
import org.project.dto.BoardDto;

public class SelectUserid implements ExecuteCommand{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String userid;
		ArrayList<BoardDto> result;
		
		System.out.print("Type in the userid: ");
		userid=input.next();
		
		Dao.Singleton work=new Dao.Singleton();
		result=work.selectUserid(userid);
		
		for(BoardDto i:result) {
			System.out.println("===Result is as follows===");
			System.out.println("No.: "+i.getNo());
			System.out.println("Content: "+i.getbTitle());
			System.out.println("Title: "+i.getbContent());
			System.out.println("Nickname: "+i.getAlias());
			System.out.println("Date: "+i.getDate());
			System.out.println("UserId: "+i.getWriter());			
		}
		
		
				
	}

}
