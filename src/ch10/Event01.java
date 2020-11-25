package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame {
	private JButton btn1;
	private JLabel la1;
	
	public Event01() {
		setTitle("�̺�Ʈ 01");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("Ŭ�� ��");
		la1 = new JLabel("Ŭ�� X");
		la1.setFont(new Font("Serif", Font.BOLD, 50));
		
		//JFrame�� �⺻������ ������ �ִ� JPanel�� �����ϱ� ����
		Container c = getContentPane();
		
		c.add(la1,BorderLayout.CENTER);
		c.add(btn1,BorderLayout.SOUTH);
		
		// 1. ������ ���( ������ => �������̽�(�޼ҵ� ������ ���ؼ�, �������ο�))
		btn1.addActionListener(new ActionListener() { //�͸�Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				la1.setText("Ŭ�� ��!");
			}
		});
		btn1.setBackground(Color.black);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(Color.red);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				btn1.setBackground(Color.blue);
				
			}
		});
		// 2. JVM(OS)�� � �̺�Ʈ�� �߻��ߴ����� Ȯ�� 
		
		// 3. �߻��� �̺�Ʈ�� �̺�Ʈ �й� �����忡 ���(��⿭ ���)
		
		// 4. ������� �����ʰ� �����.
		
		setVisible(true); //������ ���� �������ۼ�
	}

	public static void main(String[] args) {
		new Event01();
		}
}