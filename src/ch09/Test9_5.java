package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test9_5 extends JFrame{
	public Test9_5() {
		setTitle("����");
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel(new BorderLayout());
		
		c.add(jp1,BorderLayout.CENTER);
		c.add(jp2, BorderLayout.SOUTH);
		
		jp1.setLayout(grid);
		jp1.add(new JLabel(" �̸�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" �й�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" �а�"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" ����"));
		jp1.add(new JTextField(""));
		
		
		jp2.add(new JButton("��ư"),BorderLayout.SOUTH);
		
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test9_5();
	}

}
