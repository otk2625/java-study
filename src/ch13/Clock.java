package ch13;

import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

import ch04.Calculator;

class time extends JLabel implements Runnable {
	private int hour,min,secend;
	
	public time(int hour, int min, int secend) {
		this.hour = hour;
		this.min = min;
		this.secend = secend;	
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			this.secend++;
			if(this.secend == 60) {
				this.secend = 0;
				this.min++;
				if(this.min == 60) {
					this.min = 0;
					this.hour++;
					if(this.hour == 24) {
						this.hour = 0;
					}
				}
			}
			this.setText(Integer.toString(hour) + ":" + Integer.toString(min) + ":" + Integer.toString(secend));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return ;
			}
		}
		
	}
	
}

public class Clock extends JFrame{
	public Clock() {
		setSize(500,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int secend = cal.get(Calendar.SECOND);
		
		time la = new time(hour,min,secend);
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(la);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Clock();

	}

}
