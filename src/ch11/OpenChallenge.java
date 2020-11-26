package ch11;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame{

	CardLayout card;
	
	JPanel grid;
	JPanel cardBox;
	JPanel card1, card2, card3;
	JButton btn1,btn2,btn3;
	ImageIcon img1,img2,img3,img4;
	JLabel la,la2,la3,la4;
	public OpenChallenge() {
		setSize(650,750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		card = new CardLayout();
		setLayout(new BorderLayout());
		cardBox = new JPanel();
		cardBox.setLayout(card);
		
		img1 = new ImageIcon("img\\sonoma.jpg");
		img2 = new ImageIcon("img\\london.jpg");
		img3 = new ImageIcon("img\\napa.jpg");
		img4 = new ImageIcon("img\\new-york.jpg");
		
		card1 = new JPanel();
		la = new JLabel();
		la2 = new JLabel();
		la3 = new JLabel();
		la4 = new JLabel();
		card2 = new JPanel();
		card3 = new JPanel();
		
//		card1.setBackground(Color.BLUE);
		card1.add(la);
		card2.setBackground(Color.RED);
		card3.setBackground(Color.YELLOW);
		
		la.setIcon(img1);
		la2.setIcon(img2);
		la3.setIcon(img3);
		la4.setIcon(img4);
		cardBox.add("card1", la);
		cardBox.add("card2", la2);
		cardBox.add("card3", la3);
		cardBox.add("card4", la4);
		
		btn1 = new JButton("카드1");
		btn2 = new JButton("카드2");
		
		grid = new JPanel();
		grid.setLayout(new GridLayout(0, 2));
		grid.add(btn1);
		grid.add(btn2);
		
		add(grid, BorderLayout.SOUTH);
		add(cardBox, BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				card.previous(cardBox);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(cardBox);
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new OpenChallenge();

	}

}
