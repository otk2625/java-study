package ch09;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test531_4 extends JFrame {
	JButton jb;
	public Test531_4() {
		setTitle("531p¹®Á¦4¹ø");
		setSize(700, 300);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		JButton jb0 = new JButton("0");
		jb0.setBackground(Color.red);
		JButton jb1 = new JButton("1");
		jb1.setBackground(Color.orange);
		JButton jb2 = new JButton("2");
		jb2.setBackground(Color.yellow);
		JButton jb3 = new JButton("3");
		jb3.setBackground(Color.GREEN);
		JButton jb4 = new JButton("4");
		jb4.setBackground(Color.blue);
		JButton jb5 = new JButton("5");
		jb5.setBackground(Color.BLUE);
		JButton jb6 = new JButton("6");
		jb6.setBackground(Color.CYAN);
		JButton jb7 = new JButton("7");
		jb7.setBackground(Color.DARK_GRAY);
		JButton jb8 = new JButton("8");
		jb8.setBackground(Color.PINK);
		JButton jb9 = new JButton("9");
		jb9.setBackground(Color.GRAY);
		c.add(jb0);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(jb6);
		c.add(jb7);
		c.add(jb8);
		c.add(jb9);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		new Test531_4();

	}

}
