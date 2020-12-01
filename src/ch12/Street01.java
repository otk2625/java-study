package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street01 extends JFrame {
	private int x = 360;
	private int y = 15;
	Container c;

	public Street01() {
		setTitle("장풍");
		setSize(1300, 300);
		setLocationRelativeTo(null); // 모니터 정중앙에 JFrame배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());

		setVisible(true);
	}

	class GamePanel extends JPanel {
		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("img/player.png");
			imgIconJang = new ImageIcon("img/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();

			setFocusable(true);
			// 포커스를 주지않으면 키 이벤트가 먹지않음
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("x좌표 : " + x);
					if (x < 350) {
						x = 350;
					}
					if (x > 1050) {
						x = 1060;
					}
					
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						x = x + 10;
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						x = x - 10;
					} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						
						new Thread(new Runnable() {
							@Override
							public void run() {
								for (int i = 340; i < 1050; i+=10) {
									x = i;
									repaint();
									try {
										Thread.sleep(20);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
							}
						}).start();;
					}
					
					repaint();
				}

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}
	
	class GameThread extends Thread {
		@Override
		public void run() {
			
		}
	}

	public static void main(String[] args) {
		new Street01();

	}

}