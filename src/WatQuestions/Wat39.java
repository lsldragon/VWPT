package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat39 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "clear", "normal", "recent", "together", "crime", "health", "speech", "theory" }; // �洢ѡ��

	String questionString = "39. coherent"; // ���ڴ洢����
	String questionNumber = "w39"; // ���ڴ洢��� w ��������vst

	public Wat39() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}