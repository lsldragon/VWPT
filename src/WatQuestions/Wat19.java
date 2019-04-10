package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat19 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "helpful", "legel", "possible", "positive", "habit", "response", "teacher", "weather" }; // 存储选项

	String questionString = "19. favorable"; // 用于存储单词
	String questionNumber = "w19"; // 用于存储题号 w 用于区分vst

	public Wat19() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
