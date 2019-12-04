package CollegeGUI;
import java.awt.BorderLayout;

import College.CreatingPasswordUsername;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
	private ArrayList<CreatingPasswordUsername> userFiles = new ArrayList();
	private int[] counterFile = new int[1];
	private int counter = 0;

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
		
		//password length
		passwordField = new JPasswordField();
		passwordField.setBounds(279, 163, 118, 17);
		contentPane.add(passwordField);
		
		//check box for password
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
				String userName = txtUser.getText().toString();
				char[] password1 = passwordField.getPassword();
				
				//Making the char into a string for password
				String password = new String(password1);
				
				//Goes to creatingpasswordusername and checks to see if the user name and password meets the
				//circumstances 
				CreatingPasswordUsername createFile = new CreatingPasswordUsername(userName, password);
				boolean validOrInvalid = createFile.checkAccount();
				
				
				try {
					if(validOrInvalid == true) {
						
						//Serializable putting the objects into a file
						try {
							userFiles.add(createFile);
							
							File f = new File("userFiles.txt");
							FileOutputStream fos = new FileOutputStream(f);
							ObjectOutputStream oos = new ObjectOutputStream(fos);
							oos.writeObject(userFiles);
							
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						
						JOptionPane.showMessageDialog(rootPane, "Account Is Created!");
						
					}else {
						JOptionPane.showMessageDialog(rootPane, "Your password is invalid please make another password.");
					}
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(rootPane, "Error?!");
				}
//				try {
//					FileWriter writer = new FileWriter("Student.txt", true);
//					writer.write(userName);
//					writer.write(System.getProperty("line.separator"));
//					writer.write(password);
//					writer.write(System.getProperty("line.separator"));
//					writer.close();
//					JOptionPane.showMessageDialog(rootPane, "Account Is Created!");
//				} catch (Exception e1) {
//					JOptionPane.showMessageDialog(rootPane, "Error?!");
//				}
//				
//				System.exit(0);
			}
			
		});
		btnConfirm.setBounds(157, 214, 89, 23);
		contentPane.add(btnConfirm);
	}
}