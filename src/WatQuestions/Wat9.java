package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat9 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "complete", "light", "ordinary", "shared", "boundary", "circle", "name", "party" }; // �洢ѡ��

	String questionString = "9. commom"; // ���ڴ洢����
	String questionNumber = "w9"; // ���ڴ洢��� w ��������vst

	public Wat9() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
