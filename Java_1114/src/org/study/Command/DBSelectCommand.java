package org.study.Command;

public class DBSelectCommand implements CRUDCommand{
	
	@Override
	public void executeCommand() {
		System.out.println("Look up the registerd person");
	}
	
	
	
}
