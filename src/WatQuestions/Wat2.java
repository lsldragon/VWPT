package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat2 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clever", "famous", "happy", "shining", "colour", "hand", "poem", "taste" }; // �洢ѡ��

	String questionString = "2. bright"; // ���ڴ洢����
	String questionNumber = "w2"; // ���ڴ洢��� w ��������vst

	public Wat2() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
