package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat4 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "expected", "helpful", "real", "short", "foods", "neighbours", "parents", "songs" }; // �洢ѡ��

	String questionString = "4. natural"; // ���ڴ洢����
	String questionNumber = "w4"; // ���ڴ洢��� w ��������vst

	public Wat4() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
