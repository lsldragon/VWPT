package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat22 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "expected", "smelly", "strong", "unlucky", "anger", "death", "rubbish", "storm" }; // �洢ѡ��

	String questionString = "22. violent"; // ���ڴ洢����
	String questionNumber = "w22"; // ���ڴ洢��� w ��������vst

	public Wat22() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
