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

public class JMenueEx extends JFrame implements ActionListener {
	
	Button btn;
	
	public JMenueEx() {
		super("JMenu bar");
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);

		//		Make File menu
		JMenu fileMenu=new JMenu("파일(F)");
		fileMenu.setMnemonic('F'); // shortcut is "Alt+f"

		JMenuItem newfile=new JMenuItem("새파일(n)");
		newfile.setMnemonic('N'); // shortcut is "Alt+n"
		fileMenu.add(newfile);

		JMenuItem open=new JMenuItem("열기(o)");
		fileMenu.setMnemonic('O'); // shortcut is "Alt+o"
		fileMenu.add(open);

		JMenuItem save=new JMenuItem("저장(s)");
		fileMenu.setMnemonic('S'); // shortcut is "Alt+s"
		fileMenu.add(save);

		JMenuItem close=new JMenuItem("닫기(c)");
		fileMenu.setMnemonic('C'); // shortcut is "Alt+c"
		fileMenu.add(close);

		btn=new Button("Button");


		bar.add(fileMenu);
		newfile.addActionListener(this);


		JMenu helpmenu=new JMenu("도움말(h)");
		helpmenu.setMnemonic('H');//Alt+h

		JMenuItem help=new JMenuItem("도움말(D)");
		help.setMnemonic('D');
		helpmenu.add(help);

		bar.add(helpmenu);

		setSize(400, 200);
		setVisible(true);
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

		JMenueEx j1 = new JMenueEx();
		j1.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}









}
