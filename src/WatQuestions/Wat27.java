package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat27 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "bright", "deep", "exact", "great", "effect", "machine", "taste", "though" }; // �洢ѡ��

	String questionString = "27. profound"; // ���ڴ洢����
	String questionNumber = "w27"; // ���ڴ洢��� w ��������vst

	public Wat27() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}