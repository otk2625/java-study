package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test1 extends JFrame {
	private ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(100, 90, 65, 80, 30));
	JButton button;
	DrawingPanel drawingPanel;

	public test1() {
		button = new JButton("Å¬¸¯");
		drawingPanel = new DrawingPanel();
		Container c = getContentPane();

		setLocation(500, 200);
		setSize(400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.add(drawingPanel, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);

//		button.addActionListener(new DrawActionListener(drawingPanel,array));

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawingPanel.setArray(array);

			}
		});

		setVisible(true);
	}

	public class DrawingPanel extends JPanel {
		int n = 100;
		int a[] = { 0, 0, 0, 0, 0 };

		void setArray(ArrayList<Integer> array) {
			for (int i = 0; i < array.size(); i++) {
				a[i] = array.get(i);
			}
			repaint();
		}

		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawLine(50, 250, 350, 250);
			for (int cnt = 1; cnt < 11; cnt++) {
				g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt);
				g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
			}
			g.drawLine(50, 20, 50, 250);
			g.drawString("1", 100, 270);
			g.drawString("2", 150, 270);
			g.drawString("3", 200, 270);
			g.drawString("4", 250, 270);
			g.drawString("5", 300, 270);
			g.setColor(Color.RED);

//			for (int i = 0; i < array.size(); i++) {
//				g.fillRect(n, 250 - array.get(i) * 2, 10, array.get(i) * 2);
//				n += 50;
//			}
			
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] > 0) {
					g.fillRect(n, 250 - a[i] * 2, 10, a[i] * 2);
					
					n += 50;
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			n = 100;

		}

	}

	class ThisThread extends Thread {
		
		public ThisThread() {
			
		}
		@Override
		public void run() {
			
		}
	}

	public static void main(String[] args) {
		new test1();

	}

}
