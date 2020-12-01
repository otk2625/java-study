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
		setTitle("�̹���");
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
//			g.drawImage(img, 20, 20, 100, 100, this); //(20,20 ��ġ�� 100X100ũ��)
//			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); //������
			g.drawImage(img, 20, 20, 250, 100, 50, 0, 150, 150, this); //�����̹����� �Ϻκ��� �����ؼ��׸���
			
		}
	}
	public static void main(String[] args) {
		new Image01();

	}

}
