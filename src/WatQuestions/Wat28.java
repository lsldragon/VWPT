package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat28 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "dark", "growing", "private", "special", "business", "egg", "mind", "soil" }; // 存储选项

	String questionString = "28. fertile"; // 用于存储单词
	String questionNumber = "w28"; // 用于存储题号 w 用于区分vst

	public Wat28() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}