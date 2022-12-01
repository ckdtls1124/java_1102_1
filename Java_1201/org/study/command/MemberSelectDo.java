package org.study.command;

//import java.util.ArrayList;
//import java.util.Iterator;

import org.study.dao.MemberDao;
import org.study.dto.MemberDto;

public class MemberSelectDo implements ExecuteCommand {

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub

		System.out.println("Member selecting");
		MemberDao result = new MemberDao();

		if (result.select() == null) {
			System.out.println("Nothing in table.");
		} else {
			for (MemberDto i : result.select()) {
				System.out.println(i.getUserId() + "," + i.getUserPw() + "," + i.getAge());
				System.out.println("\n");
			}
		}

	}

}
