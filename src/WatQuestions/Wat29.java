package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat29 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "fast", "loud", "organised", "serious", "bomb", "education", "growth", "statement" }; // �洢ѡ��

	String questionString = "29. formal"; // ���ڴ洢����
	String questionNumber = "w29"; // ���ڴ洢��� w ��������vst

	public Wat29() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}