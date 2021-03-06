package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat8 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "hidden", "often", "rich", "sharp", "angle", "hearing", "illness", "stones" }; // 存储选项

	String questionString = "8. acute"; // 用于存储单词
	String questionNumber = "w8"; // 用于存储题号 w 用于区分vst

	public Wat8() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
