package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat21 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "close", "rough", "uncomfortable", "wet", "bend", "pants", "surface", "wood" }; // �洢ѡ��

	String questionString = "21. tight"; // ���ڴ洢����
	String questionNumber = "w21"; // ���ڴ洢��� w ��������vst

	public Wat21() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
