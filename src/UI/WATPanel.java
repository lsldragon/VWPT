package UI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class WATPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	Border lineBorder = null;

	Box horBox = null;
	Box verBox = null;

	String questionString = "";
	String questionNumber = "";

	File file = null;

	FileWriter fileWriter = null;
	BufferedWriter bufferedWriter = null;

	public WATPanel(String[] choices, String questionString, String questionNumber) {

		this.questionString = questionString;
		this.questionNumber = questionNumber;

		file = new File(UIConstants.FILE_NAME_AND_PATH);
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}

		initLayout();

		initUI(choices, questionString);

		add(verBox);
	}

	// 初始化UI
	private void initUI(String[] choices, String number) {

		JLabel wordLabel = new JLabel();
		wordLabel.setText(number);
		wordLabel.setFont(UIConstants.LABEL_FONT);

		JPanel panel1 = new JPanel();
		panel1.setBorder(lineBorder);
		JPanel panel2 = new JPanel();
		panel2.setBorder(lineBorder);

		JCheckBox[] checkBoxs1 = new JCheckBox[4];
		for (int i = 0; i < checkBoxs1.length; i++) {
			checkBoxs1[i] = new JCheckBox(choices[i]);
			checkBoxs1[i].setFont(UIConstants.CHECKBOX_FONT);
			panel1.add(checkBoxs1[i]);

		}

		addListeners(checkBoxs1, "1");

		JCheckBox[] checkBoxs2 = new JCheckBox[4];
		for (int i = 0; i < checkBoxs2.length; i++) {
			checkBoxs2[i] = new JCheckBox(choices[i + 4]);
			checkBoxs2[i].setFont(UIConstants.CHECKBOX_FONT);
			panel2.add(checkBoxs2[i]);
		}

		addListeners(checkBoxs2, "2");

		horBox.add(panel1);
		horBox.add(panel2);

		verBox.add(wordLabel);
		verBox.add(horBox);

	}

	private void addListeners(JCheckBox[] checkBoxs, String checksequence) {

		checkBoxs[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (checkBoxs[0].isSelected()) {
					checkBoxs[0].setForeground(Color.BLUE);
				} else {
					checkBoxs[0].setForeground(Color.BLACK);
				}
				System.out.println(questionNumber + "=" + checksequence + "a");
//				writeFile(questionNumber + checksequence + "=a");
				writeFile(questionNumber + "=" + checksequence + "a");
			}
		});
		checkBoxs[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBoxs[1].isSelected()) {
					checkBoxs[1].setForeground(Color.BLUE);
				} else {
					checkBoxs[1].setForeground(Color.BLACK);
				}
				System.out.println(questionNumber + "=" + checksequence + "b");
//				writeFile(questionNumber + checksequence + "=b");
				writeFile(questionNumber + "=" + checksequence + "b");
			}
		});
		checkBoxs[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBoxs[2].isSelected()) {
					checkBoxs[2].setForeground(Color.BLUE);
				} else {
					checkBoxs[2].setForeground(Color.BLACK);
				}
				System.out.println(questionNumber + "=" + checksequence + "c");
//				writeFile(questionNumber + checksequence + "=c");
				writeFile(questionNumber + "=" + checksequence + "c");
			}
		});
		checkBoxs[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBoxs[3].isSelected()) {
					checkBoxs[3].setForeground(Color.BLUE);
				} else {
					checkBoxs[3].setForeground(Color.BLACK);
				}
				System.out.println(questionNumber + "=" + checksequence + "d");
//				writeFile(questionNumber + checksequence + "=d");
				writeFile(questionNumber + "=" + checksequence + "d");

			}
		});
	}

	// 初始化布局和边界
	private void initLayout() {
		horBox = Box.createHorizontalBox(); // 用于添加水平 panel
		verBox = Box.createVerticalBox(); // 用于添加 Label 单词标签

		lineBorder = new LineBorder(Color.GRAY, 2, true);
	}

	// 写入文件
	protected void writeFile(String string) {

		try {
			bufferedWriter.write(string + "\r\n");
			bufferedWriter.flush();
//			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
