package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat10 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "angry", "difficult", "necessary", "sudden", "argument", "passengers", "patterns",
			"problem" }; // �洢ѡ��

	String questionString = "10. complex"; // ���ڴ洢����
	String questionNumber = "w10"; // ���ڴ洢��� w ��������vst

	public Wat10() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
