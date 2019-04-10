package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat39 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clear", "normal", "recent", "together", "crime", "health", "speech", "theory" }; // 存储选项

	String questionString = "39. coherent"; // 用于存储单词
	String questionNumber = "w39"; // 用于存储题号 w 用于区分vst

	public Wat39() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}