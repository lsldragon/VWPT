package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat4 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "expected", "helpful", "real", "short", "foods", "neighbours", "parents", "songs" }; // 存储选项

	String questionString = "4. natural"; // 用于存储单词
	String questionNumber = "w4"; // 用于存储题号 w 用于区分vst

	public Wat4() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
