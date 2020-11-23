package ch09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Swing은 내부적으로 while이 돌고 있음. 데몬프로세스
public class Swing01 extends JFrame {
	public Swing01() {
		setTitle("제목");
		setSize(300,500);
		
		//JPanel = (Jframe이 기본적 으로가지고 있는 패널)
		//border layout => 디폴트 layout
		Container c = getContentPane();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JPanel jp1 = new JPanel();
		
		c.add(btn1,Batch.WEST);//인터페이스 활용 예
		c.add(btn2,MyLayout.EAST.getValue()); //enum사용
		c.add(btn3,Batch.NORTH);
		c.add(jp1,Batch.CENTER);
		c.add(btn5,BorderLayout.SOUTH);
		jp1.add(btn6);
		setVisible(true); //화면에 표시하는 함수
	}
	
	public static void main(String[] args) {
		new Swing01();
	}
}
