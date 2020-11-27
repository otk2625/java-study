package ch11;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class imgbtn extends JButton {
	public imgbtn(String text) {
		super(text);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Color c = new Color(255, 247, 242); // 배경색 결정
		Color o = new Color(247, 99, 12); // 글자색 결정
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(c.darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(c.brighter());
		} else {
			graphics.setColor(c);
		}
		graphics.fillRoundRect(0, 0, width, height, 10, 10);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(o);
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}
}

public class OpenChallenge2 extends JFrame {
	CardLayout card;
	JPanel menupanel, cardBox;
	JButton btn1, btn2, btn3;
	ImageIcon img1, img2, img3, img4;
	JLabel la, la2, la3, la4;

	public void start() {
		cardBox = new JPanel();
		menupanel = new JPanel();
		card = new CardLayout();
		img1 = new ImageIcon("img\\sonoma.jpg");
		img2 = new ImageIcon("img\\london.jpg");
		img3 = new ImageIcon("img\\napa.jpg");
		img4 = new ImageIcon("img\\new-york.jpg");
		la = new JLabel();
		la2 = new JLabel();
		la3 = new JLabel();
		la4 = new JLabel();
		btn1 = new imgbtn("이전");
		btn2 = new imgbtn("다음");
	}

	public void middle() {
		setSize(631, 740);
		setTitle("OpenChallenge");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		cardBox.setLayout(card);
		menupanel.setLayout(new FlowLayout());
	}

	public void end() {
		la.setIcon(img1);
		la2.setIcon(img2);
		la3.setIcon(img3);
		la4.setIcon(img4);

		cardBox.add("card1", la);
		cardBox.add("card2", la2);
		cardBox.add("card3", la3);
		cardBox.add("card4", la4);

		menupanel.setBackground(Color.gray);
		menupanel.setPreferredSize(new Dimension(80, 100)); // 패널 크기 조정
		menupanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 100)); // 상좌하우 10씩 띄우기

		btn1.setPreferredSize(new Dimension(150, 70)); // 크기 조정
		btn2.setPreferredSize(new Dimension(150, 70)); // 크기 조정

		menupanel.add(btn1);
		menupanel.add(btn2);

		add(menupanel, BorderLayout.SOUTH);
		add(cardBox, BorderLayout.CENTER);
	}

	public OpenChallenge2() {
		start();
		middle();
		end();

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
		new OpenChallenge2();
	}
}
