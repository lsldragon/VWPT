package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat13 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "easy", "fresh", "near", "suitable", "experience", "sound", "time", "vegetable" }; // �洢ѡ��

	String questionString = "13. convenient"; // ���ڴ洢����
	String questionNumber = "w13"; // ���ڴ洢��� w ��������vst

	public Wat13() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
