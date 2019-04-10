package UI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Information extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField numTextField;
	private JTextField CET4TextField;
	private JTextField CET6TextField;
	private JTextField TEM4TextField;
	private JTextField TEM8TextField;
	private JTextField EnglishTextField;

	FileWriter fileWriter;
	BufferedWriter bufferedWriter;

	private File file;

	/**
	 * Create the panel.
	 */
	public Information() {

		checkIfFileExit();

		initUI();

	}

	private void initUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel_1 = new JLabel("VST & WAT Plus Time v0.1");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel label = new JLabel("\u5B66\u53F7\uFF1A");
		label.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		add(label, gbc_label);

		numTextField = new JTextField();
		numTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_numTextField = new GridBagConstraints();
		gbc_numTextField.gridwidth = 2;
		gbc_numTextField.insets = new Insets(0, 0, 5, 0);
		gbc_numTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_numTextField.gridx = 2;
		gbc_numTextField.gridy = 1;
		add(numTextField, gbc_numTextField);
		numTextField.setColumns(10);
		numTextField.setToolTipText("<html><font size=6>此处填写 班级 + 学号后两位，比如应用化学152班34号，即填写234 </html>");

		JLabel lblNewLabel = new JLabel("CET4 \u6210\u7EE9\uFF1A");
		lblNewLabel.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

		CET4TextField = new JTextField();
		CET4TextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_CET4TextField = new GridBagConstraints();
		gbc_CET4TextField.gridwidth = 2;
		gbc_CET4TextField.insets = new Insets(0, 0, 5, 0);
		gbc_CET4TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_CET4TextField.gridx = 2;
		gbc_CET4TextField.gridy = 2;
		add(CET4TextField, gbc_CET4TextField);
		CET4TextField.setColumns(10);

		JLabel lblCet = new JLabel("CET6 \u6210\u7EE9\uFF1A");
		lblCet.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCet = new GridBagConstraints();
		gbc_lblCet.insets = new Insets(0, 0, 5, 5);
		gbc_lblCet.gridx = 0;
		gbc_lblCet.gridy = 3;
		add(lblCet, gbc_lblCet);

		CET6TextField = new JTextField();
		CET6TextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_CET6TextField = new GridBagConstraints();
		gbc_CET6TextField.gridwidth = 2;
		gbc_CET6TextField.insets = new Insets(0, 0, 5, 0);
		gbc_CET6TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_CET6TextField.gridx = 2;
		gbc_CET6TextField.gridy = 3;
		add(CET6TextField, gbc_CET6TextField);
		CET6TextField.setColumns(10);

		JLabel lblTem = new JLabel("TEM4 \u6210\u7EE9\uFF1A");
		lblTem.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTem = new GridBagConstraints();
		gbc_lblTem.insets = new Insets(0, 0, 5, 5);
		gbc_lblTem.gridx = 0;
		gbc_lblTem.gridy = 4;
		add(lblTem, gbc_lblTem);

		TEM4TextField = new JTextField();
		TEM4TextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_TEM4TextField = new GridBagConstraints();
		gbc_TEM4TextField.gridwidth = 2;
		gbc_TEM4TextField.insets = new Insets(0, 0, 5, 0);
		gbc_TEM4TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_TEM4TextField.gridx = 2;
		gbc_TEM4TextField.gridy = 4;
		add(TEM4TextField, gbc_TEM4TextField);
		TEM4TextField.setColumns(10);

		JLabel lblTem_1 = new JLabel("TEM8 \u6210\u7EE9\uFF1A");
		lblTem_1.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTem_1 = new GridBagConstraints();
		gbc_lblTem_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTem_1.gridx = 0;
		gbc_lblTem_1.gridy = 5;
		add(lblTem_1, gbc_lblTem_1);

		TEM8TextField = new JTextField();
		TEM8TextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_TEM8TextField = new GridBagConstraints();
		gbc_TEM8TextField.gridwidth = 2;
		gbc_TEM8TextField.insets = new Insets(0, 0, 5, 0);
		gbc_TEM8TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_TEM8TextField.gridx = 2;
		gbc_TEM8TextField.gridy = 5;
		add(TEM8TextField, gbc_TEM8TextField);
		TEM8TextField.setColumns(10);

		JLabel label_1 = new JLabel("\u7EFC\u5408\u82F1\u8BED\u6210\u7EE9\uFF1A");
		label_1.setFont(new Font("KaiTi", Font.PLAIN, 20));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 6;
		add(label_1, gbc_label_1);

		EnglishTextField = new JTextField();
		EnglishTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_EnglishTextField = new GridBagConstraints();
		gbc_EnglishTextField.gridwidth = 2;
		gbc_EnglishTextField.insets = new Insets(0, 0, 5, 0);
		gbc_EnglishTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_EnglishTextField.gridx = 2;
		gbc_EnglishTextField.gridy = 6;
		add(EnglishTextField, gbc_EnglishTextField);
		EnglishTextField.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridwidth = 6;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton beginButton = new JButton("\u5F00\u59CB\u6D4B\u8BD5");
		beginButton.setForeground(Color.RED);
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					beginButtonEvent(e);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		beginButton.setFont(new Font("KaiTi", Font.BOLD, 20));
		panel.add(beginButton);

		JButton exitButton = new JButton("\u9000\u51FA\u7A0B\u5E8F");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		exitButton.setFont(new Font("KaiTi", Font.PLAIN, 20));
		panel.add(exitButton);

		JButton btnNewButton = new JButton("\u5173\u4E8E\u8F6F\u4EF6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, UIConstants.ABOUT_THIS, "关于", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("KaiTi", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("P.S. \u6CE8\u610F\uFF1A\u5EFA\u8BAE\u4F7F\u7528\u7535\u8111\u5206\u8FA8\u7387\u4E3A 1920 x 1080 \u7684\u7535\u8111\u8FDB\u884C\u6D4B\u8BD5\uFF01");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("KaiTi", Font.PLAIN, 19));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridwidth = 6;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 8;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
	}

	// 初次运行检查information是否存在，若存在则删除(否则会造成信息重复)
	private void checkIfFileExit() {

		file = new File(UIConstants.FILE_NAME_AND_PATH);

		if (file.exists()) {
//				file.delete();
			file.renameTo(new File("backup")); // 保守的策略，删除文件会造成重新测试
		} else {
			return;
		}
	}

	// 开始测试事件 写入相关信息
	private void beginButtonEvent(ActionEvent e) throws Exception {

		int choice = JOptionPane.showConfirmDialog(null, UIConstants.OPTION_STRING, "Confirm",
				JOptionPane.YES_NO_OPTION);
		if (choice == JOptionPane.YES_OPTION) {

			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			writeFile("number=" + getText(numTextField));
			writeFile("CET4=" + getText(CET4TextField));
			writeFile("CET6=" + getText(CET6TextField));
			writeFile("TEM4=" + getText(TEM4TextField));
			writeFile("TEM8=" + getText(TEM8TextField));
			writeFile("English=" + getText(EnglishTextField));

			try {
				bufferedWriter.close();

			} catch (IOException e1) {

				JOptionPane.showMessageDialog(null, e1.getMessage(), "REEOR", JOptionPane.WARNING_MESSAGE);
			}

			new TestFrame().setVisible(true);
			InformationFrame.getInstance().dispose();
			Watch.startWatch();

		} else {
			return;
		}
	}

	// 获取文本框文本
	private String getText(JTextField jTextField) {

		String string = jTextField.getText().trim();

		return string;
	}

	// 将文本写入文件
	private void writeFile(String string) {

		try {
			bufferedWriter.write(string + "\r\n");
			bufferedWriter.flush();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "REEOR", JOptionPane.WARNING_MESSAGE);
		}

	}

}
