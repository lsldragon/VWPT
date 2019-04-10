package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat20 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "confident", "enjoyble", "fixed", "safe", "game", "job", "meal", "visitor" }; // 存储选项

	String questionString = "20. secure"; // 用于存储单词
	String questionNumber = "w20"; // 用于存储题号 w 用于区分vst

	public Wat20() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
