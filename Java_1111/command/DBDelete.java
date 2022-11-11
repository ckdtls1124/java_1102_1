package org.study.command;

public class DBDelete extends SQLQueryCommand{
	@Override
	public void executeQueryCommand() {
		System.out.println("delete the user");
	}
}
