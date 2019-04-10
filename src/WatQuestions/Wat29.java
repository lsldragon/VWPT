package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat29 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "fast", "loud", "organised", "serious", "bomb", "education", "growth", "statement" }; // 存储选项

	String questionString = "29. formal"; // 用于存储单词
	String questionNumber = "w29"; // 用于存储题号 w 用于区分vst

	public Wat29() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}