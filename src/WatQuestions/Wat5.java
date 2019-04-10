package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat5 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "another", "cool", "easy", "raw", "cotton", "heat", "language", "water" }; // 存储选项

	String questionString = "5. fresh"; // 用于存储单词
	String questionNumber = "w5"; // 用于存储题号 w 用于区分vst

	public Wat5() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
