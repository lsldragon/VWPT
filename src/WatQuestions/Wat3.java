package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat3 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "open", "quiet", "smooth", "tired", "cloth", "day", "light", "person" }; // �洢ѡ��

	String questionString = "3. calm"; // ���ڴ洢����
	String questionNumber = "w3"; // ���ڴ洢��� w ��������vst

	public Wat3() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
