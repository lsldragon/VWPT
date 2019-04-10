package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat11 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "full", "moving", "quite", "wide", "night", "river", "shoulders", "smile" }; // 存储选项

	String questionString = "11. broad"; // 用于存储单词
	String questionNumber = "w11"; // 用于存储题号 w 用于区分vst

	public Wat11() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
