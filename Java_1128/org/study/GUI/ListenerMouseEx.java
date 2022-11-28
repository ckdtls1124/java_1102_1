package org.study.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		Pressed and released
//		JButton btn=(JButton) e.getSource();
//		btn.setBackground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		Pressing for long time
		JButton btn=(JButton) e.getSource();
		btn.setBackground(Color.green);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		Releasing
		JButton btn=(JButton) e.getSource();
		btn.setBackground(Color.cyan);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
//		Hover
		JButton btn=(JButton) e.getSource();
//		마우스가 올라간 버튼의 주소를 알아낸다.
		btn.setBackground(Color.red);
//		버튼의 배경을 파란색으로 바꿈
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
//		버튼에서 내려갈때.
		JButton btn=(JButton) e.getSource();
		btn.setBackground(Color.yellow);
	}
	
}

public class ListenerMouseEx extends JFrame{
	
	public ListenerMouseEx() {
		
//		
		this.setTitle("버튼에 Mouse 이벤트 리스너 작성");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1=new JButton("Mouse Event 테스트 버튼");
		btn1.setBackground(Color.yellow);
		MyMouseListener listener=new MyMouseListener();
		btn1.addMouseListener(listener);
		
		this.add(btn1);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new ListenerMouseEx();
		
		
		
		
		
		
	}
	
	
	
	
}
