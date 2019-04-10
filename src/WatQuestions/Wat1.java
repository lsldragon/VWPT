package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat1 extends JPanel {


	private static final long serialVersionUID = 4483674763714811462L;

	JPanel watJPanel = null;

	String[] choices1 = { "enjoyable", "expensive", "free", "loud", "education", "face", "music", "weather" };  // 存储选项

	String questionString = "1. beautiful"; // 用于存储单词
	String questionNumber = "w1"; // 用于存储题号 w 用于区分vst

	public Wat1() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
