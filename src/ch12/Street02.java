package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {
	Street02 street = this; // 컨텍스트를 위해 필요
	private int x = 360;
	private int y = 15;
	Container c;

	public Street02() {
		setTitle("장풍");
		setSize(1300, 300);
		setLocationRelativeTo(null); // 모니터 정중앙에 JFrame배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());

		setVisible(true);
	}

	// FlowLayout
	class GamePanel extends JPanel {
		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn;
		boolean isRunning = true;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("img/player.png");
			imgIconJang = new ImageIcon("img/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();

			btn = new JButton("멈춤");
			this.add(btn);
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new Thread(new Runnable() {
						public void run() {
//							x = 1090;
							isRunning = !isRunning; //토글
						}
					}).start();
				}
			});

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
								while(true) {
									System.out.println("isRunning : " + isRunning); //이거 없으면 진행 안됨
									while (isRunning) {
										x = x + 10;
										repaint();
										try {
											Thread.sleep(20);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								}
							}
						}).start();
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

	public static void main(String[] args) {
		new Street02();

	}

}