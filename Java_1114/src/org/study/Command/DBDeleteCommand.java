package org.study.Command;

public class DBDeleteCommand implements CRUDCommand{
	
	@Override
	public void executeCommand() {
		System.out.println("Delete the registerd person");
	}
	
	
	
}
