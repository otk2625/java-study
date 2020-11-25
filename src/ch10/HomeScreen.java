package ch10;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HomeScreen extends JFrame {
	private LoginScreen loginscreen;
	private JTextField ysername;
	public HomeScreen() {
		
	} 
	public HomeScreen(LoginScreen loginscreen) {
		setTitle("HOME");
		setSize(400,500);
		this.loginscreen = loginscreen;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
