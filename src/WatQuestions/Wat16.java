package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat16 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clear", "famous", "separate", "true", "advantage", "meanings", "news", "parents" }; // �洢ѡ��

	String questionString = "16. distinct"; // ���ڴ洢����
	String questionNumber = "w16"; // ���ڴ洢��� w ��������vst

	public Wat16() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
