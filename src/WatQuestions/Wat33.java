package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat33 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "paid", "public", "regular", "religious", "advice", "manner", "musician", "transport" }; // �洢ѡ��

	String questionString = "33. professional"; // ���ڴ洢����
	String questionNumber = "w33"; // ���ڴ洢��� w ��������vst

	public Wat33() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}