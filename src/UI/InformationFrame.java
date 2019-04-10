package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class InformationFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	Information information = null;

	private static class getMainFrame {
		private static final InformationFrame MAIN_FRAME = new InformationFrame();
	}

	private InformationFrame() {

		information = new Information();

		add(information, BorderLayout.CENTER);
		setTitle(UIConstants.APP_NAME);
		setIconImage(UIConstants.MAIN_WINDOW_ICON);
		setPreferredSize(new Dimension(650, 370));
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static InformationFrame getInstance() {
		return getMainFrame.MAIN_FRAME;
	}
}
