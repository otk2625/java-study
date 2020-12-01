package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Image01 extends JFrame{
	ImageIcon icon = new ImageIcon("img/london.jpg");
	Image img = icon.getImage();
	Mypanel mp = new Mypanel();
	Container c;
	
	public Image01() {
		setTitle("이미지");
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		
		c.add(mp);
		
		setVisible(true);
	}
	
	class Mypanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {			
			super.paintComponent(g);
//			g.drawImage(img, 20, 20, 100, 100, this); //(20,20 위치에 100X100크기)
//			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); //꽉차게
			g.drawImage(img, 20, 20, 250, 100, 50, 0, 150, 150, this); //원본이미지의 일부분을 조절해서그리기
			
		}
	}
	public static void main(String[] args) {
		new Image01();

	}

}
