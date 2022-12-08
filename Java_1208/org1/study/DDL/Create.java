package org1.study.DDL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org1.study.Command.Command;
import org1.study.Dao.Dao;

public class Create implements Command{

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		BufferedReader inputCol=new BufferedReader(new InputStreamReader(System.in));
		String table;
		int columnCount;
		String column;
		String primary;
		String sequence;
		ArrayList<String> columns=new ArrayList<String>();
		
//		1. ask the tables name
		
		System.out.print("What is the table name?: ");
		table=input.next();
		
//		ask columns
		System.out.print("How many colums would you want?: ");
		columnCount=input.nextInt();

		try {
			for (int i = 0; i < columnCount; i++) {
				System.out.print("Name of column (space) domain?: ");
			column=inputCol.readLine();
			columns.add(i, column);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Which one is the primary key?: ");
		primary=input.next();
		
		System.out.print("Would you like to make sequence?: ");
		sequence=input.next();
		
		Dao work=new Dao();
		work.create(table, columns, primary, sequence);
	}
	
	

}
