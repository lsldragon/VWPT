package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat5 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "another", "cool", "easy", "raw", "cotton", "heat", "language", "water" }; // �洢ѡ��

	String questionString = "5. fresh"; // ���ڴ洢����
	String questionNumber = "w5"; // ���ڴ洢��� w ��������vst

	public Wat5() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
