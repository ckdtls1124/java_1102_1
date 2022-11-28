package org.study.GUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteEx extends JFrame{
	public AbsoluteEx() {
		
		this.setTitle("Absolute Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel=new  JPanel();
		panel.setLayout(null);
//		Object, JFrame constructing
		this.setSize(617, 635);
		this.setVisible(true);
		this.add(panel);

		
//		Sticking on Panel
		JButton btn1=new JButton("BTN1");
		JButton btn2=new JButton("BTN2");
//		JButton btn3=new JButton("BTN3");
		JButton btn4=new JButton("BTN4");
		JButton btn5=new JButton("BTN5");
		
		btn1.setBounds(0, 0, 100, 100);
		btn2.setBounds(500, 0, 100, 100);
//		btn3.setBounds(225, 225, 100, 100);
		btn4.setBounds(0, 500, 100, 100);
		btn5.setBounds(500, 500, 100, 100);
		
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.green);
//		btn3.setBackground(Color.gray);
		btn4.setBackground(Color.gray);
		btn5.setBackground(Color.gray);
		
		panel.add(btn1);
		panel.add(btn2);
//		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
//		ends making panel
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		new AbsoluteEx();
	}
}
