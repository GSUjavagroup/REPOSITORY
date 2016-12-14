package testCodes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;


public class TestTable extends JFrame {


	static int selectedRow;


	TestTable() {


		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JTable table = new JTable();


		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(45, 118, 1100, 100);
		add(scrollPane);


		JButton btnSubmit = new JButton("Enter");
		btnSubmit.setBounds(645, 232, 117, 30);
		getContentPane().add(btnSubmit);


		btnSubmit.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {


				selectedRow = table.getSelectedRow();


				System.out.print(selectedRow + "\n");

				TableModel ewww = table.getModel();
				Object id = ewww.getValueAt(selectedRow, 0);
				Object name = ewww.getValueAt(selectedRow, 1);
				Object age = ewww.getValueAt(selectedRow, 2);
				Object address = ewww.getValueAt(selectedRow, 3);
				System.out.print("ROW: " + selectedRow + "\n" + "ID: " + id + "\n" + "Name: " + name + "\n" + "Age: "
						+ age + "\n" + "Address: " + address);
			}
		});
		{
			Connection c = null;
			Statement stmt = null;
			try {
				Class.forName("org.postgresql.Driver");
				c = DriverManager
						.getConnection("jdbc:postgresql://localhost:5432/",
								"postgres", "postgresql123");
				c.setAutoCommit(false);
				System.out.println("Opened database successfully");
				stmt = c.createStatement();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY;");
				ResultSetMetaData rsmetadata = rs.getMetaData();
				int columns = rsmetadata.getColumnCount();
				DefaultTableModel dtm = new DefaultTableModel();
				Vector column_name = new Vector();
				Vector data_rows = new Vector();
				
				for (int i = 1; i < columns; i++) {
					column_name.addElement(rsmetadata.getColumnName(i));

				}
				dtm.setColumnIdentifiers(column_name);
				while (rs.next()) {
					data_rows = new Vector();
					for (int j = 1; j < columns; j++) {
						data_rows.addElement(rs.getString(j));
					}
					dtm.addRow(data_rows);
				}
				table.setModel(dtm);
				rs.close();
				stmt.close();
				c.close();
			} catch (Exception e) {
				System.err.println(e);
				System.exit(0);
			}
			System.out.println("Operation done successfully");


		}


	}


	public static void main(String[] args) {


		TestTable frame = new TestTable();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}


