package ch13;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Timer implements Runnable{
	private JLabel la;
	public Timer(JLabel la) {
		this.la = la;
	}
	@Override
	public void run() {
		int i = 0;
		while(true) {
			System.out.println(i);
			la.setText(Integer.toString(i));
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return ;
			}
		}
		
	}
	
}

public class Test13_1 extends JFrame{
	public Test13_1() {
		setSize(300,170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JLabel la = new JLabel();
		c.add(la);
		
		setVisible(true);
		
		Thread t = new Thread(new Timer(la));
		t.start();
		
	}
	public static void main(String[] args) {
		
		new Test13_1();
	}

}
