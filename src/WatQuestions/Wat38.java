package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat38 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "cautious", "hopeful", "traditional", "warm", "clothes", "estimate", "meeting", "signal" }; // �洢ѡ��

	String questionString = "38. conservative"; // ���ڴ洢����
	String questionNumber = "w38"; // ���ڴ洢��� w ��������vst

	public Wat38() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}