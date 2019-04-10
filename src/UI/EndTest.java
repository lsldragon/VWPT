package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndTest extends JPanel {

	private static final long serialVersionUID = 533246869350212920L;

	JButton exitButton = null;
	JLabel messageArea = null;

	Box verBox = Box.createVerticalBox();

	public EndTest() {
		initUI();
	}

	private void initUI() {

		messageArea = new JLabel();
		messageArea.setFont(new Font("KaiTi", Font.PLAIN, 26));
		messageArea.setText(UIConstants.THANK_STRING);

		exitButton = new JButton("ÍË³ö³ÌÐò");
		exitButton.setFont(new Font("KaiTi", Font.PLAIN, 25));
		exitButton.setForeground(Color.RED);
		exitButton.setBackground(Color.WHITE);
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		verBox.add(Box.createVerticalStrut(100));
		verBox.add(messageArea);
		verBox.add(Box.createVerticalStrut(50));
		verBox.add(exitButton);
		verBox.add(Box.createVerticalStrut(50));

		this.add(verBox);
	}

}
