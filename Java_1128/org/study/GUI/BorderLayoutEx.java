package org.study.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx() {
		setTitle("Borderlayout Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(new JButton("BorderAPP"), BorderLayout.CENTER);
		add(new JButton("Add"), BorderLayout.NORTH);
		add(new JButton("Sub"), BorderLayout.SOUTH);
		add(new JButton("Mul"), BorderLayout.EAST);
		add(new JButton("Divide"), BorderLayout.WEST);
		setSize(400, 400);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		new BorderLayoutEx();
		
		
	}
}
