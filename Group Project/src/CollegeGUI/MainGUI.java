package CollegeGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {
	private JTextField txtCourseName;
	private JTextField txtCourseId;
	private JTextField txtInstructor;
	private JTable table;

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
		setBounds(0, 0, 1000, 500);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(311, 55, 663, 342);
		getContentPane().add(panel);
		panel.setLayout(null);
		// Add JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 663, 342);
		panel.add(scrollPane);
		// Add the JTable w/JScroll Pane
		table = new JTable();

		// Able to Sort The Column
		table.setAutoCreateRowSorter(true);

		// Create the Names of the JTable
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Course Name", "Course ID", "Instructor Name", "Credits", "Days", "Time" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(82);
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setPreferredWidth(103);
		table.getColumnModel().getColumn(3).setPreferredWidth(91);
		table.getColumnModel().getColumn(4).setPreferredWidth(86);
		scrollPane.setViewportView(table);

		JLabel lblTitle = new JLabel("Courses Registration");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(365, 7, 297, 37);
		getContentPane().add(lblTitle);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourseName.setBounds(25, 81, 103, 17);
		getContentPane().add(lblCourseName);

		txtCourseName = new JTextField();
		txtCourseName.setBounds(170, 82, 122, 17);
		getContentPane().add(txtCourseName);
		txtCourseName.setColumns(10);

		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourseId.setBounds(25, 129, 75, 14);
		getContentPane().add(lblCourseId);

		txtCourseId = new JTextField();
		txtCourseId.setBounds(170, 129, 122, 17);
		getContentPane().add(txtCourseId);
		txtCourseId.setColumns(10);

		JLabel lblInstructorName = new JLabel("Instructor Name");
		lblInstructorName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInstructorName.setBounds(25, 167, 128, 14);
		getContentPane().add(lblInstructorName);

		txtInstructor = new JTextField();
		txtInstructor.setBounds(170, 167, 122, 17);
		getContentPane().add(txtInstructor);
		txtInstructor.setColumns(10);

		JLabel lblCredits = new JLabel("Credits");
		lblCredits.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCredits.setBounds(25, 211, 75, 14);
		getContentPane().add(lblCredits);
		// Add the number of Credits for JComboBox
		JComboBox CreditBox = new JComboBox();
		CreditBox.setModel(new DefaultComboBoxModel(new String[] { "Make A Selection", "1", "2", "3", "4", "5" }));
		CreditBox.setBounds(170, 211, 122, 18);
		getContentPane().add(CreditBox);

		JLabel lblDays = new JLabel("Days");
		lblDays.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDays.setBounds(25, 257, 46, 14);
		getContentPane().add(lblDays);

		// Add the Random Days to the JComboBox
		JComboBox DaysBox = new JComboBox();
		DaysBox.setModel(new DefaultComboBoxModel(new String[] { "Make A Selection", "M,T,W,TH,F", "M,T,TH", "M,W,F",
				"M,W", "M", "T,TH", "T,F", "T", "W,F", "W", "TH", "F", "SAT" }));
		DaysBox.setBounds(170, 257, 122, 18);
		getContentPane().add(DaysBox);

		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTime.setBounds(25, 311, 46, 14);
		getContentPane().add(lblTime);

		// Add the Random Time to the JComboBox
		JComboBox TimeBox = new JComboBox();
		TimeBox.setModel(new DefaultComboBoxModel(new String[] { "Make A Selection", "8:00am - 8:50am",
				"9:05am - 10:45am", "9:55am - 10:45am", "9:55am - 11:55am", "10:55am - 12:45pm", "11:00am - 12:40pm",
				"1:10pm - 3:00pm", "2:15pm - 5:05pm", "4:00pm - 5:30pm", "6:00pm - 8:50pm" }));
		TimeBox.setBounds(170, 311, 122, 18);
		getContentPane().add(TimeBox);

		// Student can add courses/record to the JTable
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Call the JTable to add the courses
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { txtCourseName.getText(), txtCourseId.getText(), txtInstructor.getText(),
						CreditBox.getSelectedItem(), DaysBox.getSelectedItem(), TimeBox.getSelectedItem(),

				});

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Course Registration Update Confirm", "Course Registration",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAddCourse.setBounds(44, 408, 114, 23);
		getContentPane().add(btnAddCourse);

		// Student should able to delete the course
		JButton btnDeleteCourse = new JButton("Delete Course");
		btnDeleteCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data To Delete", "Course Registration",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select A Row To Delete", "Course Registration",
								JOptionPane.OK_OPTION);

					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDeleteCourse.setBounds(178, 408, 114, 23);
		getContentPane().add(btnDeleteCourse);

		// Student should able to print their courses
		JButton btnPrintCourse = new JButton("Print Course");
		btnPrintCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer Is Found", e.getMessage());
				}
			}
		});
		btnPrintCourse.setBounds(321, 408, 114, 23);
		getContentPane().add(btnPrintCourse);

		// Student can logout the system
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Exit?", "Course Registration",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnLogout.setBounds(847, 408, 114, 23);
		getContentPane().add(btnLogout);
	}
}
