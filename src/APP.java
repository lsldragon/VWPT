import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import UI.InformationFrame;

public class APP {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {

					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.WARNING_MESSAGE);

				}

				InformationFrame.getInstance().setVisible(true);
			}
		});

	}
}
