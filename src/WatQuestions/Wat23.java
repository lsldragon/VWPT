package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat23 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "continuing", "local", "serious", "unplanned", "accident", "examination", "illness",
			"shortage" }; // 存储选项

	String questionString = "23. chronic"; // 用于存储单词
	String questionNumber = "w23"; // 用于存储题号 w 用于区分vst

	public Wat23() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
