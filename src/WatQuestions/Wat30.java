package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat30 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "change", "equal", "important", "separate", "child", "country", "ideas", "prices" }; // 存储选项

	String questionString = "30. independent"; // 用于存储单词
	String questionNumber = "w30"; // 用于存储题号 w 用于区分vst

	public Wat30() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}