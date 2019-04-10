package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat38 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "cautious", "hopeful", "traditional", "warm", "clothes", "estimate", "meeting", "signal" }; // 存储选项

	String questionString = "38. conservative"; // 用于存储单词
	String questionNumber = "w38"; // 用于存储题号 w 用于区分vst

	public Wat38() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}