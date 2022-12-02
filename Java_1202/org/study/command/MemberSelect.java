package org.study.command;

import java.util.ArrayList;
import java.util.Iterator;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelect implements MemberCommand{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		
		MemberDao work=new MemberDao();
		ArrayList<MemberDto> members=work.select();
		
		for (MemberDto member:members) {
			System.out.println(member.getId()+","+member.getPw()+","+member.getAge()+","+member.getEmail());
		}
	}

}
