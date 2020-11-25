package review;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex13 extends JFrame{

	public Ex13() {
		setSize(400,400);
//		JButton btn = new JButton();
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//			}
//		});
		Container c = getContentPane();
		JLabel la = new JLabel("¤§¤§");
		la.setSize(500, 70);
		c.setLayout(null);
		c.add(la);
//		c.addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent e) {
//				int x = e.getX();
//				int y = e.getY();
//				la.setLocation(x, y);
//			}
//		});
		
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
				int keycode = e.getKeyCode();
				
				switch(keycode){
					case KeyEvent.VK_UP:
						la.setLocation(la.getX(), la.getY() - 10); break;
					case KeyEvent.VK_DOWN:
						la.setLocation(la.getX(), la.getY() + 10); break;
					case KeyEvent.VK_LEFT:
						la.setLocation(la.getX() - 10, la.getY()); break;
					case KeyEvent.VK_RIGHT:
						la.setLocation(la.getX() + 10, la.getY()); break;
						
				}
				
			}
		});
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new Ex13();
	}

}
