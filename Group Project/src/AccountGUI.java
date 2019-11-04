import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFName;
	private JLabel lblLastName;
	private JTextField txtLName;
	private JLabel lblUsername;
	private JTextField txtUser;
	private JLabel lblDob;
	private JTextField textDOB;
	private JLabel lblAddress;
	private JTextField txtAddress;
	private JLabel lblPhone;
	private JTextField txtPhone;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JCheckBox chckbxShowPassword;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountGUI frame = new AccountGUI();
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
	public AccountGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 25, 77, 14);
		contentPane.add(lblFirstName);
		
		txtFName = new JTextField();
		txtFName.setBounds(79, 22, 118, 20);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(207, 25, 77, 14);
		contentPane.add(lblLastName);
		
		txtLName = new JTextField();
		txtLName.setBounds(279, 22, 118, 20);
		contentPane.add(txtLName);
		txtLName.setColumns(10);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 165, 65, 14);
		contentPane.add(lblUsername);
		
		txtUser = new JTextField();
		txtUser.setBounds(79, 162, 118, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		lblDob = new JLabel("DOB");
		lblDob.setBounds(221, 122, 30, 14);
		contentPane.add(lblDob);
		
		textDOB = new JTextField();
		textDOB.setBounds(279, 119, 118, 20);
		contentPane.add(textDOB);
		textDOB.setColumns(10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setBounds(207, 71, 65, 14);
		contentPane.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(279, 68, 118, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		lblPhone = new JLabel("Phone #");
		lblPhone.setBounds(10, 122, 56, 14);
		contentPane.add(lblPhone);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(79, 119, 118, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(207, 165, 77, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(279, 163, 118, 17);
		contentPane.add(passwordField);
		
		chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			// Create the Show Password Button
			public void actionPerformed(ActionEvent e) {
			// If the Button is Select it will show Password
				if(chckbxShowPassword.isSelected()){
					passwordField.setEchoChar((char)0);
				}else {
			// If the Button is UnSelect it will not show Password
					passwordField.setEchoChar('*');
				}
				
			}
		});
		chckbxShowPassword.setBounds(300, 187, 97, 23);
		contentPane.add(chckbxShowPassword);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 71, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(79, 68, 118, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			//Save the info data
			public void actionPerformed(ActionEvent e) {
			
				
				
			}
		});
		btnConfirm.setBounds(157, 214, 89, 23);
		contentPane.add(btnConfirm);
	}
}
