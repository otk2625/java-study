package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame{
	private Mypanel panel;
	int x=10, y=10;
	
	public Gra02() {
		setTitle("예제2");
		setSize(400,500);
		
		panel = new Mypanel();
		setContentPane(panel);
		
		setVisible(true);
	}
	
	class Mypanel extends JPanel {
		public Mypanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					System.out.println("x : " + x );
					System.out.println("y : " + y );
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); //이전 그림을 다 지워준다.
			g.setColor(Color.blue);
			g.drawRect(x, y, 50, 50);
		}
	}
	public static void main(String[] args) {
		new Gra02();

	}

}
