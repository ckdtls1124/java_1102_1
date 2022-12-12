package org.project.command;

import java.util.ArrayList;

import org.project.dao.Dao;
import org.project.dto.MemberDto;

public class Select implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		System.out.println("Select the member(s).");
		ArrayList<MemberDto> result;
		Dao.Singleton work = new Dao.Singleton();
		result = work.select();

		for (MemberDto i : result) {
			System.out.println("userId: " + i.getUserid());
			System.out.println("userPw: " + i.getUserid());
			System.out.println("userEmail: " + i.getEmail());
			System.out.println("=======================");
		}

	}

}
