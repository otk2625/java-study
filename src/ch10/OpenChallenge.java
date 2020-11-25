package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OpenChallenge extends JFrame{
	
	public OpenChallenge() {
		setTitle("오픈 챌린지");
		setSize(400,400);
		JButton btn1 = new JButton("2");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("2");
		btn1.setBackground(Color.magenta);
		btn2.setBackground(Color.magenta);
		btn3.setBackground(Color.magenta);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		btn1.setSize(100, 100);
		btn2.setSize(100, 100);
		btn3.setSize(100, 100);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		JLabel la = new JLabel("시작합니다");
		la.setSize(30, 150);
		c.add(la);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				int x = (int)(Math.random()*5);
				if(code == KeyEvent.VK_ENTER) {
					System.out.println("옞이 공주님!~");
					btn1.setText(""+(Math.random()*5)); 
					btn2.setText(""+(Math.random()*5)); 
					btn3.setText(""+(Math.random()*5)); 
					
					if(btn1.getText().equals(btn2.getText()) && btn1.getText().equals(btn3.getText())) {
						la.setText("축하");
					}else 
						la.setText("아쉽");
				}
				
			}
		});
		
		c.requestFocus();
		setFocusable(true);
		setVisible(true);
	}
	public static void main(String[] args) {
		new OpenChallenge();

	}

}
