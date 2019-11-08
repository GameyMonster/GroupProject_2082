

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField txtUser;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	/**
	 * @wbp.nonvisual location=51,19
	 */
	private final JLabel label = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	private JCheckBox chckbxShowPassword;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
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
				if(chckbxShowPassword.isSelected()){
					passwordField.setEchoChar((char)0);
				}else {
			// If the Button is UnSelect it will not show Password
					passwordField.setEchoChar('*');
				}	
			}
		});
		chckbxShowPassword.setBounds(201, 160, 97, 23);
		frame.getContentPane().add(chckbxShowPassword);
	}
}
