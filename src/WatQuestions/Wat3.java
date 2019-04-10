package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat3 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "open", "quiet", "smooth", "tired", "cloth", "day", "light", "person" }; // 存储选项

	String questionString = "3. calm"; // 用于存储单词
	String questionNumber = "w3"; // 用于存储题号 w 用于区分vst

	public Wat3() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
