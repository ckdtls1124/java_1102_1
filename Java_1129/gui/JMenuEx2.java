package org.study.gui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenuEx2 extends JFrame implements ActionListener {

	JPanel jPanel;
	JMenuBar jMenubar;
	JMenu jMenu1, jMenu2;
	JMenuItem jMenuitem1, jMenuitem2, jMenuitem3, exit;

	public JMenuEx2() {
		// TODO Auto-generated constructor stub
		super("JMenuEx2 예제");
		jMenubar = new JMenuBar();
		this.setJMenuBar(jMenubar);

		jMenu1 = new JMenu("파일");
		jMenu2 = new JMenu("도움말");

		jMenuitem1 = new JMenuItem("메뉴1");
		jMenuitem2 = new JMenuItem("새창");
		jMenuitem3 = new JMenuItem("메뉴2");
		exit = new JMenuItem("닫기");

		jMenu1.add(jMenuitem1);
		jMenu1.add(jMenuitem2);
		jMenu1.add(jMenuitem3);
		jMenu2.add(exit);

		jMenubar.add(jMenu1);
		jMenubar.add(jMenu2);

		this.setSize(400, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		jMenuitem1.addActionListener(this);
		jMenuitem2.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			setVisible(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		} else if (e.getSource() == jMenuitem1) {
			System.out.println("메뉴 1 클릭");
		} else if (e.getSource() == jMenuitem2) {
			newWindow();
			
		}
	}
	
	private void newWindow() {
		
		
		JPanel jPanel=new JPanel();
		Dialog dial=new Dialog(this, "새창열기");
		Button btn=new Button("Close");
		
		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));
		dial.setSize(300, 200);
		dial.setVisible(true);
		
		btn.setSize(100, 100);
		jPanel.add(btn);
		dial.add(jPanel);
		
		
		ActionListener a=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dial.setVisible(false);
			}
		};
		btn.addActionListener(a);
	}

	public static void main(String[] args) {
		new JMenuEx2();
	}

}
