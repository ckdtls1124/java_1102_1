package org.study.command;

public class DBSelect extends SQLQueryCommand{
	@Override
	public void executeQueryCommand() {
		System.out.println("Select the user");
	}
}
