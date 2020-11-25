package ch13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickerLabel extends JLabel implements Runnable{
	private long delay;
	public FlickerLabel(String text,long delay) {
		this.setText(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0) {
				setBackground(Color.yellow);
			}
			else
				setBackground(Color.green);
			if(n == 0) n = 1;
			else n = 0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
		
	}
	
}

public class Test13_3 extends JFrame {
	
	public Test13_3() {
		setSize(400,150);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickerLabel la = new FlickerLabel("집에", 300);
		
		JLabel la2 = new JLabel("가고싶어");
		
		FlickerLabel la3 = new FlickerLabel("정말~!", 500);
		
		c.add(la);
		c.add(la2);
		c.add(la3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test13_3();
	}

}
