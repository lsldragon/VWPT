package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat33 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "paid", "public", "regular", "religious", "advice", "manner", "musician", "transport" }; // 存储选项

	String questionString = "33. professional"; // 用于存储单词
	String questionNumber = "w33"; // 用于存储题号 w 用于区分vst

	public Wat33() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}