package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat7 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "empty", "heavy", "uncovered", "useful", "cupboard", "feet", "school", "tool" }; // �洢ѡ��

	String questionString = "7. bare"; // ���ڴ洢����
	String questionNumber = "w7"; // ���ڴ洢��� w ��������vst

	public Wat7() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
