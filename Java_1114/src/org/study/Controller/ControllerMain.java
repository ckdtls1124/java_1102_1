package org.study.Controller;

import org.study.Command.CRUDCommand;
import org.study.Command.DBDeleteCommand;
import org.study.Command.DBInsertCommand;
import org.study.Command.DBSelectCommand;
import org.study.Command.DBUpdateCommand;

public class ControllerMain {
	public static void main(String[] args) {
		
//		CRUDCommand command1=new DBInsertCommand();
//		command1.executeCommand();
//
//		CRUDCommand command2=new DBUpdateCommand();
//		command2.executeCommand();
//		
//		CRUDCommand command3=new DBSelectCommand();
//		command3.executeCommand();
//		
//		CRUDCommand command4=new DBDeleteCommand();
//		command4.executeCommand();
		
		
		CRUDCommand command=new CRUDCommand() {
			
			@Override
			public void executeCommand() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
