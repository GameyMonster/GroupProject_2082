package CollegeGUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtCourseName;
	private JTextField txtCourseID;
	private JTextField txtInstructor;
	private JTextField txtCredit;
	private JTextField txtDays;
	private JTextField txtTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(29, 58, 84, 14);
		contentPane.add(lblCourseName);
		
		txtCourseName = new JTextField();
		txtCourseName.setBounds(137, 55, 117, 20);
		contentPane.add(txtCourseName);
		txtCourseName.setColumns(10);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(29, 107, 84, 14);
		contentPane.add(lblCourseId);
		
		txtCourseID = new JTextField();
		txtCourseID.setBounds(137, 104, 117, 20);
		contentPane.add(txtCourseID);
		txtCourseID.setColumns(10);
		
		JLabel lblInstructor = new JLabel("Instructor Name");
		lblInstructor.setBounds(29, 153, 98, 14);
		contentPane.add(lblInstructor);
		
		txtInstructor = new JTextField();
		txtInstructor.setBounds(137, 150, 117, 20);
		contentPane.add(txtInstructor);
		txtInstructor.setColumns(10);
		
		JLabel lblCredits = new JLabel("Credits");
		lblCredits.setBounds(29, 198, 84, 14);
		contentPane.add(lblCredits);
		
		txtCredit = new JTextField();
		txtCredit.setBounds(137, 195, 117, 20);
		contentPane.add(txtCredit);
		txtCredit.setColumns(10);
		
		JLabel lblDays = new JLabel("Days");
		lblDays.setBounds(29, 242, 84, 14);
		contentPane.add(lblDays);
		
		txtDays = new JTextField();
		txtDays.setBounds(137, 239, 117, 20);
		contentPane.add(txtDays);
		txtDays.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(29, 281, 84, 14);
		contentPane.add(lblTime);
		
		txtTime = new JTextField();
		txtTime.setBounds(137, 278, 117, 20);
		contentPane.add(txtTime);
		txtTime.setColumns(10);
		
		JButton btnAddCourses = new JButton("Add Courses");
		btnAddCourses.setBounds(24, 358, 117, 23);
		contentPane.add(btnAddCourses);
		
		JButton btnDeleteCourses = new JButton("Delete Courses");
		btnDeleteCourses.setBounds(151, 358, 128, 23);
		contentPane.add(btnDeleteCourses);
		
		JButton btnPrintCourses = new JButton("Print Courses");
		btnPrintCourses.setBounds(289, 358, 130, 23);
		contentPane.add(btnPrintCourses);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(429, 358, 128, 23);
		contentPane.add(btnExit);
	}
}
