package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat26 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "home", "national", "regular", "smooth", "animal", "movement", "policy", "speed" }; // 存储选项

	String questionString = "26. domestic"; // 用于存储单词
	String questionNumber = "w26"; // 用于存储题号 w 用于区分vst

	public Wat26() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}