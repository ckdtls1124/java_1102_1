package org.study.command;

public class DBUpdate extends SQLQueryCommand{
	@Override
	public void executeQueryCommand() {
		System.out.println("Update the user info");
	}
}
