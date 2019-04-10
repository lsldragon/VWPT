package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat24 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "effective", "small", "solid", "useful", "group", "kitchen", "medicine", "string" }; // 存储选项

	String questionString = "24. compact"; // 用于存储单词
	String questionNumber = "w24"; // 用于存储题号 w 用于区分vst

	public Wat24() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
