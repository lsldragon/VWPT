package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat35 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "artificial", "electronic", "expensive", "simple", "drug", "meal", "radio", "sound" }; // �洢ѡ��

	String questionString = "35. synthetic"; // ���ڴ洢����
	String questionNumber = "w35"; // ���ڴ洢��� w ��������vst

	public Wat35() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}