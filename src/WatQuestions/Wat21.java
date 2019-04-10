package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat21 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "close", "rough", "uncomfortable", "wet", "bend", "pants", "surface", "wood" }; // 存储选项

	String questionString = "21. tight"; // 用于存储单词
	String questionNumber = "w21"; // 用于存储题号 w 用于区分vst

	public Wat21() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
