package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat11 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "full", "moving", "quite", "wide", "night", "river", "shoulders", "smile" }; // �洢ѡ��

	String questionString = "11. broad"; // ���ڴ洢����
	String questionNumber = "w11"; // ���ڴ洢��� w ��������vst

	public Wat11() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
