package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat10 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "angry", "difficult", "necessary", "sudden", "argument", "passengers", "patterns",
			"problem" }; // 存储选项

	String questionString = "10. complex"; // 用于存储单词
	String questionNumber = "w10"; // 用于存储题号 w 用于区分vst

	public Wat10() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
