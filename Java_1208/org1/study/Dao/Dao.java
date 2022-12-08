package org1.study.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Iterator;

import org1.study.DBConnect.DBConnection;

public class Dao {
	String sequence1;
	String table1;

	public void create(String table, ArrayList<String> columns, String primary, String sequence) {
		// TODO Auto-generated method stub
		this.table1=table;
		this.sequence1=sequence;
		Connection conn=null;
		PreparedStatement pstmt=null;
		String column="";
		for (int i=0;i<columns.size();i++) {
			if(i==columns.size()-1) {
				column=column+" "+columns.get(i);
			} else {
				column=column+" "+columns.get(i)+",";				
			}
		}
		conn=DBConnection.getConnection();
		System.out.println(columns.size());
		String query="create table "+table+" ( "+column+" ) ";
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.executeUpdate();
			System.out.println("Creating a table was successful.");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query1="alter table "+table+" add primary key ( "+primary+" )";
		try {
			pstmt=conn.prepareStatement(query1);
			pstmt.executeUpdate();
			System.out.println("Setting the primary key was successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query2="CREATE SEQUENCE "+sequence+" INCREMENT BY 1 START WITH 100001 NOCYCLE";
		try {
			pstmt=conn.prepareStatement(query2);
			pstmt.executeUpdate();
			System.out.println("Setting the sequence was successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

	public void writeOnBoard(String id, String write) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		String query="insert into "+this.table1+" values ("+this.sequence1+".nextval, "+id+", "+write+")";
				
		try {
			conn=DBConnection.getConnection();
			pstmt=conn.prepareStatement(query);
			pstmt.executeUpdate();
			System.out.println("Writing on board was successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert(String id, String pw) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		String query="insert into "+this.table1+" values( "+id+", "+pw+") ";
		
		try {
			conn=DBConnection.getConnection();
			pstmt=conn.prepareStatement(query);
			pstmt.executeUpdate();
			System.out.println("Registering went successful.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
