package com.bway.swingdemo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.bway.swingdemo.model.Employee;
import com.bway.swingdemo.service.EmployeeService;
import com.bway.swingdemo.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField txtfname;
	private JLabel lblLastName;
	private JTextField txtlname;
	private JLabel lblCompany;
	private JTextField txtcompany;
	private JLabel lblPost;
	private JTextField txtpost;
	private JLabel lblGender;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblDob;
	private JLabel lblNewLabel;
	private JTextField txtphn;
	private JLabel lblEmail;
	private JTextField txtemail;
	private JLabel lblCountry;
	private JTextField txtcountry;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblSalary;
	private JTextField txtsalary;
	private JLabel lblDateofjoinig;
	private JButton btnSave;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnView;
	private JButton btnPrint;
	private JButton btnExit;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JComboBox cbstate;
	private JComboBox cbcity;
	private JDateChooser dobDate;
	private JDateChooser joiningDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setTitle("EmployeeForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getTxtfname());
		contentPane.add(getLblLastName());
		contentPane.add(getTxtlname());
		contentPane.add(getLblCompany());
		contentPane.add(getTxtcompany());
		contentPane.add(getLblPost());
		contentPane.add(getTxtpost());
		contentPane.add(getLblGender());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getLblDob());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtphn());
		contentPane.add(getLblEmail());
		contentPane.add(getTxtemail());
		contentPane.add(getLblCountry());
		contentPane.add(getTxtcountry());
		contentPane.add(getLblCity());
		contentPane.add(getLblState());
		contentPane.add(getLblSalary());
		contentPane.add(getTxtsalary());
		contentPane.add(getLblDateofjoinig());
		contentPane.add(getBtnSave());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnEdit());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnView());
		contentPane.add(getBtnPrint());
		contentPane.add(getBtnExit());
		contentPane.add(getCbstate());
		contentPane.add(getCbcity());
		contentPane.add(getDobDate());
		contentPane.add(getJoiningDate());
		displayData();
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(10, 33, 77, 14);
		}
		return lblFirstName;
	}
	private JTextField getTxtfname() {
		if (txtfname == null) {
			txtfname = new JTextField();
			txtfname.setBounds(71, 30, 150, 20);
			txtfname.setColumns(10);
		}
		return txtfname;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("last Name");
			lblLastName.setBounds(10, 65, 62, 14);
		}
		return lblLastName;
	}
	private JTextField getTxtlname() {
		if (txtlname == null) {
			txtlname = new JTextField();
			txtlname.setBounds(71, 58, 150, 20);
			txtlname.setColumns(10);
		}
		return txtlname;
	}
	private JLabel getLblCompany() {
		if (lblCompany == null) {
			lblCompany = new JLabel("Company");
			lblCompany.setBounds(238, 36, 52, 14);
		}
		return lblCompany;
	}
	private JTextField getTxtcompany() {
		if (txtcompany == null) {
			txtcompany = new JTextField();
			txtcompany.setBounds(294, 33, 128, 20);
			txtcompany.setColumns(10);
		}
		return txtcompany;
	}
	private JLabel getLblPost() {
		if (lblPost == null) {
			lblPost = new JLabel("post");
			lblPost.setBounds(244, 68, 46, 14);
		}
		return lblPost;
	}
	private JTextField getTxtpost() {
		if (txtpost == null) {
			txtpost = new JTextField();
			txtpost.setBounds(294, 65, 128, 20);
			txtpost.setColumns(10);
		}
		return txtpost;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("gender");
			lblGender.setBounds(10, 100, 46, 14);
		}
		return lblGender;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			buttonGroup_2.add(rdbtnMale);
			rdbtnMale.setBounds(69, 121, 71, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("female");
			buttonGroup_2.add(rdbtnFemale);
			rdbtnFemale.setBounds(162, 121, 77, 23);
		}
		return rdbtnFemale;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DOB");
			lblDob.setBounds(244, 103, 30, 14);
		}
		return lblDob;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("phone");
			lblNewLabel.setBounds(10, 166, 46, 14);
		}
		return lblNewLabel;
	}
	private JTextField getTxtphn() {
		if (txtphn == null) {
			txtphn = new JTextField();
			txtphn.setBounds(71, 163, 150, 20);
			txtphn.setColumns(10);
		}
		return txtphn;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setBounds(244, 169, 46, 14);
		}
		return lblEmail;
	}
	private JTextField getTxtemail() {
		if (txtemail == null) {
			txtemail = new JTextField();
			txtemail.setBounds(294, 166, 128, 20);
			txtemail.setColumns(10);
		}
		return txtemail;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(10, 204, 71, 14);
		}
		return lblCountry;
	}
	private JTextField getTxtcountry() {
		if (txtcountry == null) {
			txtcountry = new JTextField();
			txtcountry.setBounds(71, 201, 150, 20);
			txtcountry.setColumns(10);
		}
		return txtcountry;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(244, 207, 46, 14);
		}
		return lblCity;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(10, 234, 46, 14);
		}
		return lblState;
	}
	private JLabel getLblSalary() {
		if (lblSalary == null) {
			lblSalary = new JLabel("Salary");
			lblSalary.setBounds(244, 237, 46, 14);
		}
		return lblSalary;
	}
	private JTextField getTxtsalary() {
		if (txtsalary == null) {
			txtsalary = new JTextField();
			txtsalary.setBounds(294, 234, 128, 20);
			txtsalary.setColumns(10);
		}
		return txtsalary;
	}
	private JLabel getLblDateofjoinig() {
		if (lblDateofjoinig == null) {
			lblDateofjoinig = new JLabel(" Date of joining");
			lblDateofjoinig.setBounds(10, 276, 77, 14);
		}
		return lblDateofjoinig;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Add Employee");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Employee emp = new Employee();
					
					emp.setFname(txtfname.getText());
					emp.setLname(txtlname.getText());
					emp.setDob(new Date(dobDate.getDate().getTime()));
					emp.setCompany(txtcompany.getText());
					emp.setJoiningDate(new Date(joiningDate.getDate().getTime()));
					emp.setCountry(txtcountry.getText());
					emp.setCity(cbcity.getSelectedItem().toString());
					emp.setEmail(txtemail.getText());
					emp.setState(cbstate.getSelectedItem().toString());
					emp.setPost(txtpost.getText());
					emp.setPhone(txtphn.getText());
					emp.setSalary(Double.parseDouble(txtsalary.getText()));
					
					if(rdbtnMale.isSelected()) {
						
						emp.setGender("Male");
						
						
					}else {
						emp.setGender("Female");
						
					}
					
					EmployeeService es = new EmployeeServiceImpl();
					if(es.addEmployee(emp)) {
						
						JOptionPane.showMessageDialog(null, "Added successfully!!");
						
						displayData();
					}
				}
			});
			btnSave.setBounds(25, 404, 105, 23);
		}
		return btnSave;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "FirstName", "Company", "City"
				}
			));
		}
		return table;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(446, 47, 387, 328);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton("Edit");
			btnEdit.setBounds(136, 404, 77, 23);
		}
		return btnEdit;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.setBounds(226, 404, 77, 23);
		}
		return btnDelete;
	}
	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.setBounds(321, 404, 77, 23);
		}
		return btnView;
	}
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton("Print");
			btnPrint.setBounds(427, 404, 77, 23);
		}
		return btnPrint;
	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setBounds(530, 404, 77, 23);
		}
		return btnExit;
	}
	private JComboBox getCbstate() {
		if (cbstate == null) {
			cbstate = new JComboBox();
			cbstate.setModel(new DefaultComboBoxModel(new String[] {"select", "state-1", "state-2", "state-3", "state-4", "state-5", "state-6", "state-7"}));
			cbstate.setBounds(71, 231, 150, 20);
		}
		return cbstate;
	}
	private JComboBox getCbcity() {
		if (cbcity == null) {
			cbcity = new JComboBox();
			cbcity.setModel(new DefaultComboBoxModel(new String[] {"select", "Kathmandu", "Pokhara", "Dhangadhi", "Chitwan", "Butwal"}));
			cbcity.setBounds(294, 204, 128, 20);
		}
		return cbcity;
	}
	private JDateChooser getDobDate() {
		if (dobDate == null) {
			dobDate = new JDateChooser();
			dobDate.setBounds(294, 94, 72, 20);
		}
		return dobDate;
	}
	private JDateChooser getJoiningDate() {
		if (joiningDate == null) {
			joiningDate = new JDateChooser();
			joiningDate.setBounds(149, 270, 72, 20);
		}
		return joiningDate;
	}
	
	//display data in jtable
	
	void displayData() {
		
		EmployeeService es = new EmployeeServiceImpl();
		
		List<Employee> elist = es.getAllEmployee();
		
		DefaultTableModel model =(DefaultTableModel) table.getModel();
		model.setRowCount(0);   //reset table data
		
		for(Employee e : elist) {
			
			model.addRow(new Object[] {e.getId(),e.getFname(),e.getCompany(),e.getCity()});
			
		
		}
	}
	
	
	
}
