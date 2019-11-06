package com.bway.swingdemo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField textField;
	private JLabel lblLastName;
	private JTextField textField_1;
	private JScrollPane scrollPane;
	private JLabel lblCompany;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JTextField textField_3;
	private JLabel lblJoiningDate;
	private JTextField textField_4;
	private JLabel lblPost;
	private JTextField textField_5;
	private JLabel lblGender;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JLabel lblCountry;
	private JTextField textField_6;
	private JLabel lblState;
	private JComboBox comboBox;
	private JLabel lblCity;
	private JComboBox comboBox_1;
	private JLabel lblPhone;
	private JTextField textField_7;
	private JLabel lblEmail;
	private JTextField textField_8;
	private JLabel lblSalary;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm1 frame = new EmployeeForm1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm1() {
		setTitle("Employee Record Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 688);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getTextField());
		contentPane.add(getLblLastName());
		contentPane.add(getTextField_1());
		contentPane.add(getScrollPane());
		contentPane.add(getLblCompany());
		contentPane.add(getTextField_2());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField_3());
		contentPane.add(getLblJoiningDate());
		contentPane.add(getTextField_4());
		contentPane.add(getLblPost());
		contentPane.add(getTextField_5());
		contentPane.add(getLblGender());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getRdbtnOther());
		contentPane.add(getLblCountry());
		contentPane.add(getTextField_6());
		contentPane.add(getLblState());
		contentPane.add(getComboBox());
		contentPane.add(getLblCity());
		contentPane.add(getComboBox_1());
		contentPane.add(getLblPhone());
		contentPane.add(getTextField_7());
		contentPane.add(getLblEmail());
		contentPane.add(getTextField_8());
		contentPane.add(getLblSalary());
		contentPane.add(getTextField_9());
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(25, 39, 93, 14);
			lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblFirstName;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(109, 38, 96, 20);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(232, 41, 73, 14);
			lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}
		return lblLastName;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(315, 38, 96, 20);
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportBorder(new LineBorder(Color.BLACK, 2, true));
			scrollPane.setBounds(720, 281, 218, -213);
		}
		return scrollPane;
	}
	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Date of Birth");
			lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCompany.setBounds(25, 85, 78, 20);
		}
		return lblCompany;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_2.setBounds(109, 87, 96, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Company");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(232, 85, 73, 20);
		}
		return lblNewLabel;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textField_3.setBounds(315, 87, 96, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblJoiningDate() {
		if (lblJoiningDate == null) {
			lblJoiningDate = new JLabel("Joining Date");
			lblJoiningDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblJoiningDate.setBounds(25, 129, 78, 20);
		}
		return lblJoiningDate;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(109, 131, 96, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("Post");
			lblPost.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPost.setBounds(232, 132, 48, 14);
		}
		return lblPost;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(315, 131, 96, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblGender.setBounds(25, 174, 48, 14);
		}
		return lblGender;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
			rdbtnNewRadioButton.setBounds(109, 172, 73, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 11));
			rdbtnFemale.setBounds(201, 172, 78, 23);
		}
		return rdbtnFemale;
	}
	private JRadioButton getRdbtnOther() {
		if (rdbtnOther == null) {
			rdbtnOther = new JRadioButton("Other");
			rdbtnOther.setFont(new Font("Tahoma", Font.PLAIN, 11));
			rdbtnOther.setBounds(315, 172, 83, 23);
		}
		return rdbtnOther;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCountry.setBounds(25, 215, 64, 20);
		}
		return lblCountry;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(109, 217, 96, 20);
			textField_6.setColumns(10);
		}
		return textField_6;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblState.setBounds(232, 218, 48, 14);
		}
		return lblState;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7"}));
			comboBox.setBounds(315, 216, 41, 22);
		}
		return comboBox;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblCity.setBounds(25, 256, 48, 20);
		}
		return lblCity;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kathmandu", "Biratnagar", "Birgung", "Pokhara"}));
			comboBox_1.setBounds(109, 257, 96, 22);
		}
		return comboBox_1;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblPhone.setBounds(232, 261, 48, 14);
		}
		return lblPhone;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(315, 260, 96, 20);
			textField_7.setColumns(10);
		}
		return textField_7;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEmail.setBounds(25, 308, 48, 14);
		}
		return lblEmail;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setBounds(109, 307, 96, 20);
			textField_8.setColumns(10);
		}
		return textField_8;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSalary.setBounds(232, 304, 57, 20);
		}
		return lblSalary;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setBounds(315, 307, 96, 20);
			textField_9.setColumns(10);
		}
		return textField_9;
	}
}
