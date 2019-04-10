package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class VstQuestionsUI extends JPanel {

	private static final long serialVersionUID = 1L;

	JLabel questionStemLabel; // ���
	ButtonGroup buttonGroup; // ��ť��
	JRadioButton achoiceRadioButton; // a ѡ��
	JRadioButton bchoiceRadioButton; // b ѡ��
	JRadioButton cchoiceRadioButton; // c ѡ��
	JRadioButton dchoiceRadioButton; // d ѡ��

	
	Box verBox = Box.createVerticalBox(); // ����

	ArrayList<String> questionList = new ArrayList<String>();
	String questonNum = "";

	File file = null;

	FileWriter fileWriter = null;
	BufferedWriter bufferedWriter = null;

	public VstQuestionsUI(ArrayList<String> arrayList, String num) throws IOException {

		questionList = arrayList;
		questonNum = num;

		file = new File(UIConstants.FILE_NAME_AND_PATH);
		fileWriter = new FileWriter(file, true);
		bufferedWriter = new BufferedWriter(fileWriter);

		questionStemLabel = new JLabel();

		buttonGroup = new ButtonGroup();

		achoiceRadioButton = new JRadioButton();
		bchoiceRadioButton = new JRadioButton();
		cchoiceRadioButton = new JRadioButton();
		dchoiceRadioButton = new JRadioButton();

		initUI(); // ����������ʽ
		initLayout(); // ���ò��� ---> ��ֱ����
		initContent(); // ��UI��������
		addListeners(); // ��Ӽ����¼�

		this.add(verBox);
	}

	private void addListeners() {
		achoiceRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(questonNum + "=a");
				writeFile(questonNum + "=a");
			}
		});

		bchoiceRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(questonNum + "=b");
				writeFile(questonNum + "=b");
			}
		});

		cchoiceRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(questonNum + "=c");
				writeFile(questonNum + "=c");
			}
		});

		dchoiceRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(questonNum + "=d");
				writeFile(questonNum + "=d");
			}
		});
	}

	protected void writeFile(String string) {

		try {
			bufferedWriter.write(string + "\r\n");
			bufferedWriter.flush();
//			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void initContent() {
		questionStemLabel.setText(questionList.get(0));
		achoiceRadioButton.setText(questionList.get(1));
		bchoiceRadioButton.setText(questionList.get(2));
		cchoiceRadioButton.setText(questionList.get(3));
		dchoiceRadioButton.setText(questionList.get(4));
	}

	private void initLayout() {

		verBox.add(questionStemLabel);
		verBox.add(achoiceRadioButton);
		verBox.add(bchoiceRadioButton);
		verBox.add(cchoiceRadioButton);
		verBox.add(dchoiceRadioButton);

	}

	private void initUI() {

		buttonGroup.add(achoiceRadioButton);
		buttonGroup.add(bchoiceRadioButton);
		buttonGroup.add(cchoiceRadioButton);
		buttonGroup.add(dchoiceRadioButton);

		questionStemLabel.setFont(UIConstants.VLABEL_FONT);
		achoiceRadioButton.setFont(UIConstants.RADIO_FONT);
		bchoiceRadioButton.setFont(UIConstants.RADIO_FONT);
		cchoiceRadioButton.setFont(UIConstants.RADIO_FONT);
		dchoiceRadioButton.setFont(UIConstants.RADIO_FONT);
	}
}
