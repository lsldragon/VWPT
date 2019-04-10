package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat14 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "crowded", "hot", "noisy", "thick", "forest", "handle", "smoke", "weather" }; // 存储选项

	String questionString = "14. dense"; // 用于存储单词
	String questionNumber = "w14"; // 用于存储题号 w 用于区分vst

	public Wat14() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
