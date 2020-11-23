package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test9_527 extends JFrame {
	private JPanel jp1, jp2;
	private JLabel jb1, jb2, jb3;
	
	public Test9_527() {
		setTitle("open challenge");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//1.필요한 오브젝트를 메모리에 로딩
		initObject();
		
		//2.배치관리자 세팅
		Container c = getContentPane();
		
		jp2.setLayout(null);
		c.add(jp1,BorderLayout.NORTH);
		c.add(jp2,BorderLayout.CENTER);
		//3.배치
		jp1.add(new JButton("Open"));
		jp1.add(new JButton("Read"));
		jp1.add(new JButton("Close"));
		jp1.setBackground(Color.gray);
		
		jb1.setLocation(120, 20);
		jb1.setSize(200,20);
		
		jb2.setLocation(220, 200);
		jb2.setSize(200,20);
		
		jb3.setLocation(30, 230);
		jb3.setSize(200,20);
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		setVisible(true);
	}

	//컴포넌트 혹은 컨테이너 초기화, Heap관리
	private void initObject() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jb1 = new JLabel("Hello");
		jb2 = new JLabel("Java");
		jb3 = new JLabel("Love");
	}
	public static void main(String[] args) {
		new Test9_527();

	}

}
