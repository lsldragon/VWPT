package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat31 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "careful", "closed", "first", "proud", "condition", "mind", "plan", "sister" }; // �洢ѡ��

	String questionString = "31. original"; // ���ڴ洢����
	String questionNumber = "w31"; // ���ڴ洢��� w ��������vst

	public Wat31() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}