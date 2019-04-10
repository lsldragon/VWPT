package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat37 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "exciting", "official", "surprising", "worried", "adventure", "change", "patient", "salary" }; // 存储选项

	String questionString = "37. dramatic"; // 用于存储单词
	String questionNumber = "w37"; // 用于存储题号 w 用于区分vst

	public Wat37() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}