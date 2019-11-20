import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class LoginSystemGUI{

	private JFrame frame;
	private JTextField textUser;
	private JPasswordField passwordField;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtDOB;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtUserName;
	private JPasswordField CreatePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystemGUI window = new LoginSystemGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystemGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(376, 43, 249, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setBounds(78, 211, 260, 47);
		frame.getContentPane().add(btnNewButton);
		
		textUser = new JTextField();
		textUser.setBounds(645, 224, 201, 20);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(532, 222, 93, 20);
		frame.getContentPane().add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(645, 286, 201, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(532, 286, 93, 20);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
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
		chckbxShowPassword.setBounds(749, 313, 97, 23);
		frame.getContentPane().add(chckbxShowPassword);
		
		JLabel lblAlreadyUser = new JLabel("Already User");
		lblAlreadyUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAlreadyUser.setBounds(672, 176, 124, 20);
		frame.getContentPane().add(lblAlreadyUser);
		
		JLabel lblNewUser = new JLabel("New User");
		lblNewUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewUser.setBounds(161, 173, 97, 27);
		frame.getContentPane().add(lblNewUser);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(707, 343, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 269, 486, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 11, 79, 14);
		panel.add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(117, 8, 125, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(265, 11, 68, 14);
		panel.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(343, 8, 125, 20);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 46, 62, 14);
		panel.add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(117, 44, 125, 20);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setBounds(265, 46, 84, 14);
		panel.add(lblDateOfBirth);
		
		txtDOB = new JTextField();
		txtDOB.setBounds(343, 44, 125, 17);
		panel.add(txtDOB);
		txtDOB.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(10, 87, 110, 14);
		panel.add(lblPhoneNumber);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(117, 84, 125, 20);
		panel.add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(265, 87, 46, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(343, 84, 125, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblCreateUsername = new JLabel("Create UserName:");
		lblCreateUsername.setBounds(10, 136, 116, 14);
		panel.add(lblCreateUsername);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(117, 131, 125, 20);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblCreatePassword = new JLabel("Create Password:");
		lblCreatePassword.setBounds(10, 177, 116, 14);
		panel.add(lblCreatePassword);
		
		CreatePassword = new JPasswordField();
		CreatePassword.setBounds(117, 174, 125, 20);
		panel.add(CreatePassword);
		
		JCheckBox chckbxShowpassword = new JCheckBox("Show Password");
		chckbxShowpassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					// If the Button is Select it will show Password
					if(chckbxShowpassword.isSelected()){
						CreatePassword.setEchoChar((char)0);
					}else {
				// If the Button is UnSelect it will not show Password
						CreatePassword.setEchoChar('*');
					}	
				}
			});
		chckbxShowpassword.setBounds(156, 197, 97, 23);
		panel.add(chckbxShowpassword);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(343, 128, 133, 31);
		panel.add(btnCreateAccount);
	}
}
