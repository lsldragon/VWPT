package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat18 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "honest", "main", "straight", "wide", "fence", "flight", "heat", "river" }; // �洢ѡ��

	String questionString = "18. direct"; // ���ڴ洢����
	String questionNumber = "w18"; // ���ڴ洢��� w ��������vst

	public Wat18() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
