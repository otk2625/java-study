package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {
	private LoginScreen longinScreen = this;
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("로그인");
		longinScreen = new LoginScreen();

		setTitle("login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);

		// 배치
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);

		initListener();

		setVisible(true);
	}

	// 리스너 등록 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String user = tfUsername.getText();
				if(user.equals("asd")) {
					new HomeScreen();
				} else {
					System.out.println("로그인 실패 아이디 다시 입력");
				}

			}
		});

	}

}
