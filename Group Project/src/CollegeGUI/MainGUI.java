package CollegeGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {
	private JTable table;
	private JTable table_1;
	private String firstName, lastName, email, DOB, userName;
	private JTextField textField;
	


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
	
	public MainGUI(String userName, String firstName, String lastName, String email, String DOB) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setDOB(DOB);
		setUserName(userName);
	}

	/**
	 * Create the frame.
	 */
	public MainGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 600);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("Courses Registration");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(526, 11, 297, 37);
		getContentPane().add(lblTitle);

		// Student can logout the system
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Exit?", "Course Registration",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					dispose();
				}
			}
		});
		btnLogout.setBounds(1214, 524, 114, 23);
		getContentPane().add(btnLogout);

		JScrollPane Main_scrollPane = new JScrollPane();
		Main_scrollPane.setBounds(10, 108, 629, 381);
		getContentPane().add(Main_scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Course ID", "Course Name", "Instructor", "Credits", "Day", "Time" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		Main_scrollPane.setViewportView(table);

		JScrollPane Course_scrollPane = new JScrollPane();
		Course_scrollPane.setBounds(665, 108, 663, 381);
		getContentPane().add(Course_scrollPane);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"ART 1024", "2D Drawing", "Jesus Fuller", "2.0", "W", "9:30am - 11:00am"},
				{"ART 1031", "Photography I", "Brendan Mcdonald", "2.0", "T,TH", "7:00pm - 9:00pm"},
				{"ART 1055", "Watercolor", "Regina Stephens", "2.0", "M,T,W,TH,F", "9:55am - 11:55am"},
				{"BIOL 1024", "Human Biology", "Elizabeth Pierce", "3.0", "W", "4:50pm - 5:40pm"},
				{"COMM 1021", "Public Speaking", "Kelly Sandoval", "1.0", "M,T,W,TH,F", "3:20pm - 4:35pm"},
				{"COMM 2071", "Communication and Gender", "Olive Hamilton", "2.0", "M,T,W,TH", "7:45am - 8:35am"},
				{"CSCI 1020", "Intro PC & Info System", "Anne Weaver", "4.0", "T,TH", "3:35pm - 5:15pm"},
				{"CSCI 1081", "Programming Fundamentals", "Jody Frank", "5.0", "T,TH", "11:00am - 11:50am"},
				{"CSCI 2061", "Python for Programmer", "Malcolm Fox", "4.0", "M", "12:05pm - 12:55pm"},
				{"CSCI 2082", "Data Structure & Algorithm", "Emma Henderson", "4.0", "M,T,W,TH,F", "1:10pm - 3:10pm"},
				{"ENGL 0090", "Writing/Grammer", "Freda Thompson", "5.0", "F", "10:50am - 12:05pm"},
				{"ENGL 2026", "Creative Writing", "Ernesto Mckenzie", "3.0", "M,T,W,TH", "8:50am - 9:40am"},
				{"ESCI 1055", "Meteorlogy Lab", "Bessie Swanson", "1.0", "M", "9:00am - 10:15am"},
				{"HIS 1035", "Minnesota History", "Alfred Patton", "1.0", "F", "9:30am - 10:45am"},
				{"HUM 1045", "American Film", "Elsa Welch", "1.0", "F", "8:00am - 9:15am "},
				{"MATH 1025", "Statistic", "Jerome Woods", "4.0", "M", "8:00pm - 9:50pm"},
				{"MATH 1061", "College Algebra", "Brittany Clarke", "4.0", "TH", "10:30am - 12:10pm"},
				{"MATH 1081", "Calculus I", "Phillip Cooper", "5.0", "T,TH", "11:00am - 12:15pm "},
				{"MUSC 2051", "World Music", "Bradford Watson", "5.0", "M,T,W,TH", "2:15pm - 3:30pm"},
				{"PHIL 1025", "Intro to Eastern Philosophy", "Heidi Bailey", "4.0", "M,W", "12:45pm - 2:00pm"},
				{"PHYS 1030", "Astronomy ", "Kenny Carson", "3.0", "T,TH", "8:15am - 9:40am"},
				{"PHYS 1081", "Intro Physics I", "Delores Quinn", "3.0", "M,W,F", "7:45am - 8:35am"},
				{"SOC 1020", "Intro Sociology", "Eduardo Anderson", "2.0", "M,W,F", "6:00pm - 9:50pm"},
				{"THTR 1081", "World of Drama", "Albert Gill", "4.0", "M,W,F", "9:55am - 10:45am"},
			
			},
			new String[] {
				"Course ID", "Course Name", "Instructor", "Credits", "Day", "Time"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(64);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(139);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(95);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(100);

		// Sort the JTable
		table.setAutoCreateRowSorter(true);
		table_1.setAutoCreateRowSorter(true);

		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table_1.getModel());
		table_1.setRowSorter(sorter);
		List<RowSorter.SortKey> sortKeys = new ArrayList<>();

		int columnIndexToSort = 1;
		sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

		sorter.setSortKeys(sortKeys);
		sorter.sort();

		Course_scrollPane.setViewportView(table_1);

		// Add Courses
		JButton btnAddCourses = new JButton("Add Courses");
		btnAddCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableModel model1 = table_1.getModel();
				int[] index = table_1.getSelectedRows();
				// Size of the Objects
				Object[] row = new Object[6];
				DefaultTableModel model2 = (DefaultTableModel) table.getModel();
				for (int i = 0; i < index.length; i++) {
					// Display The Rows
					row[0] = model1.getValueAt(index[i], 0);
					row[1] = model1.getValueAt(index[i], 1);
					row[2] = model1.getValueAt(index[i], 2);
					row[3] = model1.getValueAt(index[i], 3);
					row[4] = model1.getValueAt(index[i], 4);
					row[5] = model1.getValueAt(index[i], 5);
					model2.addRow(row);
				}

			}
		});
		btnAddCourses.setBounds(22, 520, 119, 30);
		getContentPane().add(btnAddCourses);
		// Delete Courses
		JButton btnDeleteCourses = new JButton("Delete Courses");
		btnDeleteCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data Is Being Deleted", "Student Registration",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select A Row To Delete", "Student Rgistration",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDeleteCourses.setBounds(174, 520, 127, 30);
		getContentPane().add(btnDeleteCourses);
		// User can Print the Courses
		JButton btnPrintCourses = new JButton("Print Courses");
		btnPrintCourses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException arg0) {
					System.err.format("No Printer is Found", arg0.getMessage());
				}
			}
		});
		btnPrintCourses.setBounds(333, 520, 133, 30);
		getContentPane().add(btnPrintCourses);
		
		textField = new JTextField();
		textField.setBounds(1113, 77, 119, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		//Search Button
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		btnSearch.setBounds(1239, 76, 89, 23);
		getContentPane().add(btnSearch);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Course ID", "Course Name", "Instructor", "Credits", "Days", "Time"}));
		comboBox.setBounds(1008, 77, 97, 20);
		getContentPane().add(comboBox);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}