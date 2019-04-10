package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat35 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "artificial", "electronic", "expensive", "simple", "drug", "meal", "radio", "sound" }; // 存储选项

	String questionString = "35. synthetic"; // 用于存储单词
	String questionNumber = "w35"; // 用于存储题号 w 用于区分vst

	public Wat35() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}