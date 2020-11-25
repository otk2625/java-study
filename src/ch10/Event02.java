package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener {
	private JLabel laTitle;
	private JButton btn1, btn2, btn3;
	private Container c;

	public Event02() {
		laTitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("참외 클릭");
		c = getContentPane();

		setTitle("이벤트02");
		setSize(400, 500);

		c.add(laTitle, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.CENTER);
		c.add(btn3, BorderLayout.EAST);

		// 익명클래스를 이용해서 구현
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				laTitle.setText("참외");
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Event02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource()의 리턴타입은 Object
		System.out.println("클릭됨 : " + e.getSource());
		JButton btn = (JButton)e.getSource();
		System.out.println(btn.getText());
		
		//조건문으로 라벨의 텍스트를 변경
		if(e.getSource() == btn1) {
			laTitle.setText("딸기");
		} else if(e.getSource() == btn2) {
			laTitle.setText("바나나");
		}
	}

}
