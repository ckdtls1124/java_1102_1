package org.study.GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx1 extends JFrame{
	
	
	public SwingEx1() {
		setTitle("SwingEx1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if the mainframe is closed, everything closed.
		
//		container 
		Container conPane=getContentPane();
		conPane.setBackground(Color.blue);
		conPane.setLayout(new FlowLayout()); // Basic layout
		
//		the actual values in container
		conPane.add(new JButton("OK"));
		conPane.add(new JButton("CANCEL"));
		conPane.add(new JButton("GO"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingEx1();
		
	}
	
	
}
