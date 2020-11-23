package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Swing04 extends JFrame {
	private JPanel panel, panel_1;
	private Container c;
	private JButton btnNewButton,btnNewButton_1,btnNewButton_2;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_2;
	
	private void initObject() {
		panel = new JPanel();
		panel_1 = new JPanel();
		
		btnNewButton = new JButton("Open");
		btnNewButton_1 = new JButton("Read");
		btnNewButton_2 = new JButton("Close");
		
		lblNewLabel = new JLabel("Hello");
		lblNewLabel_1 = new JLabel("Love");
		lblNewLabel_2 = new JLabel("Java");
	}
	private void initSetting() {
		setTitle("527page");
		setSize(400,400);
		setVisible(true);
		
		c = getContentPane(); 
		panel.setBackground(Color.GRAY);
		panel_1.setLayout(null);
	}
	private void initBatch() {
		c.add(panel, BorderLayout.NORTH);
		c.add(panel_1, BorderLayout.CENTER);
		
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		
		lblNewLabel.setBounds(123, 30, 57, 15);
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1.setBounds(75, 157, 57, 15);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2.setBounds(284, 97, 57, 15);
		panel_1.add(lblNewLabel_2);
	}
	public Swing04() {
		//1.필요한 오브젝트를 메모리에 로딩
		initObject();
		
		//2.배치관리자 세팅
		initSetting();
		
		//3.배치
		initBatch();
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
