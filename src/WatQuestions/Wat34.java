package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat34 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clear", "dangerous", "important", "rough", "festival", "illness", "time", "water" }; // 存储选项

	String questionString = "34. critical"; // 用于存储单词
	String questionNumber = "w34"; // 用于存储题号 w 用于区分vst

	public Wat34() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}