package CollegeGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import College.CreatingPasswordUsername;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class LoginGUI{

	JFrame frame;
	private JTextField txtUser;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	/**
	 * @wbp.nonvisual location=51,19
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	private JCheckBox chckbxShowPassword;
	private ArrayList<CreatingPasswordUsername> userFiles = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
		// Read the Student Txt if found
		// Read the Username and Password
		Writer writer = null;
		File check = new File("Student.txt");
		if (check.exists()) {

			// Checks if the file exists. It will not add anything if the file does exist.
		} else {
			try {
				File texting = new File("Student.txt");
				writer = new BufferedWriter(new FileWriter(texting));
				writer.write("message");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Login Form");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblUser = new JLabel("Username");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUser.setBounds(113, 39, 90, 24);
		frame.getContentPane().add(lblUser);

		txtUser = new JTextField();
		txtUser.setBounds(112, 67, 186, 20);
		frame.getContentPane().add(txtUser);
		txtUser.setColumns(10);

		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(116, 114, 87, 14);
		frame.getContentPane().add(lblPassword);

		JButton btnSignIn = new JButton("Sign In");
		//sign in button listener
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String puname = txtUser.getText();
				char[] password1 = passwordField.getPassword();
				String ppaswd = new String(password1);
				
				
				try {
					File f = new File("userFile.txt");
					FileInputStream fis = new FileInputStream(f);
					ObjectInputStream ois = new ObjectInputStream(fis);
					userFiles = (ArrayList<CreatingPasswordUsername>) ois.readObject();
				}catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				
				
				
				for(int x = 0; x < userFiles.size(); x++) {
					
					String stringOfPassword = userFiles.get(x).getPassword();
					String stringOfUserName = userFiles.get(x).getUsername();
					stringOfUserName = stringOfUserName.toLowerCase();
					puname = puname.toLowerCase();
			
					if(puname.equals(stringOfUserName) && ppaswd.equals(stringOfPassword)) {
						MainGUI menu = new MainGUI();
						menu.setVisible(true);
						break;
					}else if(puname.equals("") && ppaswd.equals("")) {
						JOptionPane.showMessageDialog(null, "Please insert Username and Password");
						break;
					}else if(x == userFiles.size() - 1) {
						JOptionPane.showMessageDialog(null, "Wrong Username / Password");
						txtUser.setText("");
						passwordField.setText("");
						txtUser.requestFocus();
					}
				}
				
			}
		});
		btnSignIn.setBounds(52, 190, 135, 23);
		frame.getContentPane().add(btnSignIn);

		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			// If user didn't have account it will create one
			public void actionPerformed(ActionEvent e) {
				// Open the JFrame of the Account GUI
				AccountGUI frame = new AccountGUI();
				frame.setVisible(true);
				
			}
		});
		btnCreateAccount.setBounds(222, 190, 135, 23);
		frame.getContentPane().add(btnCreateAccount);

		passwordField = new JPasswordField();
		passwordField.setBounds(110, 135, 188, 22);
		frame.getContentPane().add(passwordField);

		chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// If the Button is Select it will show Password
				if (chckbxShowPassword.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					// If the Button is UnSelect it will not show Password
					passwordField.setEchoChar('*');
				}

			}
		});
		chckbxShowPassword.setBounds(201, 160, 97, 23);
		frame.getContentPane().add(chckbxShowPassword);
	}

	
}
