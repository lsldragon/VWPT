package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat36 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "free", "moderate", "plenty", "valuable", "crops", "furniture", "parents", "transport" }; // 存储选项

	String questionString = "36. liberal"; // 用于存储单词
	String questionNumber = "w36"; // 用于存储题号 w 用于区分vst

	public Wat36() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}