package ch09;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing02 extends JFrame{

	public Swing02() {
		setTitle("플로우 레이아웃");
		setSize(300, 400);
		Container c = getContentPane();
//		c.setLayout(new FlowLayout()); //레이아웃 변경
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		JPanel jp1 = new JPanel();
		
		c.add(btn1, BorderLayout.NORTH);
		c.add(btn2, BorderLayout.CENTER);
		c.add(jp1, BorderLayout.SOUTH);
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing02();

	}

}
