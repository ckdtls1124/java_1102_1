package org.study.Command;

public class DBUpdateCommand implements CRUDCommand{
	
	@Override
	public void executeCommand() {
		System.out.println("Update the infos of the registered");
	}
	
	
	
}
