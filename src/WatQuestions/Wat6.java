package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat6 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "closed", "different", "usual", "whole", "country", "idea", "reader", "street" }; // �洢ѡ��

	String questionString = "6. general"; // ���ڴ洢����
	String questionNumber = "w6"; // ���ڴ洢��� w ��������vst

	public Wat6() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}
