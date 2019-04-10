package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat12 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "awake", "healthy", "knowing", "laughing", "face", "decision", "effort", "student" }; // 存储选项

	String questionString = "12. conscious"; // 用于存储单词
	String questionNumber = "w12"; // 用于存储题号 w 用于区分vst

	public Wat12() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
