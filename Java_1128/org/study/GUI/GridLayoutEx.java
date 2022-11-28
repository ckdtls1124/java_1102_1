package org.study.GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		
		setTitle("GridLayout Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid=new GridLayout(4, 2, 0, 5);
		setLayout(grid);
		
		
		add(new JLabel(" Name"));
		add(new JTextField(""));
		add(new JLabel(" Serial Number"));
		add(new JTextField(""));
		add(new JLabel(" Major"));
		add(new JTextField(""));
		add(new JLabel(" Subject"));
		add(new JTextField(""));
		setSize(400, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		
		new GridLayoutEx();
		
		
	}
	
}
