package WatQuestions;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import UI.WATPanel;

public class Wat40 extends JPanel {

	private static final long serialVersionUID = -7028130447586695748L;

	JPanel watJPanel = null;

	String[] choices1 = { "heavy", "large", "plentiful", "windy", "amount", "climate", "feelings", "time" }; // �洢ѡ��

	String questionString = "40. ample"; // ���ڴ洢����
	String questionNumber = "w40"; // ���ڴ洢��� w ��������vst

	public Wat40() {

		watJPanel = new WATPanel(choices1, questionString, questionNumber);
		this.add(watJPanel, BorderLayout.CENTER);

	}
}