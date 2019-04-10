package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat9 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "complete", "light", "ordinary", "shared", "boundary", "circle", "name", "party" }; // 存储选项

	String questionString = "9. commom"; // 用于存储单词
	String questionNumber = "w9"; // 用于存储题号 w 用于区分vst

	public Wat9() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
