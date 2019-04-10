package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat32 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "feeling", "interesting", "sharp", "thick", "clothes", "instrument", "skin", "topic" }; // 存储选项

	String questionString = "32. sensitive"; // 用于存储单词
	String questionNumber = "w32"; // 用于存储题号 w 用于区分vst

	public Wat32() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}