package org.study.GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEventEx extends JFrame implements ActionListener{
	
	JMenuBar jMenuB;
	JMenu jMenu;
	JMenuItem jMe_01, jMe_02;
	Button btn;
	
	public JMenuEventEx() {
		// TODO Auto-generated constructor stub
		super("JMenuEvenEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		jMenuB=new JMenuBar();
		jMenu=new JMenu("메뉴");
		jMe_01=new JMenuItem("메뉴1");
		jMe_02=new JMenuItem("메뉴2");
		btn=new Button("Button");
		
		this.add(jMenuB);
		jMenuB.add(jMenu);
		jMenu.add(jMe_01);
		jMenu.add(jMe_02);
		
		this.setSize(500, 400);
		this.setVisible(true);
		
		jMe_01.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JDialog dial=new JDialog(this, "Dialog");
		dial.setLayout(new FlowLayout(FlowLayout.RIGHT, 100, 120));
		btn.setSize(100, 100);
		dial.add(btn);
		dial.setSize(300,200);
		dial.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dial.setVisible(false);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new JMenuEventEx();
	}
	
	
	
	
	
	
	
	
	
	

}
