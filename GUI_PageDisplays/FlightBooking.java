package mainGUIinterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableModel;

import database.TableDisplay;
import database.ConfirmationTable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlightBooking extends JFrame{
	private JTextField enterUsername;
	
	ConfirmationTable confirm = new ConfirmationTable(); //calling to our confirmation page to use database codes
	
	
	//String[] header = { "FLIGHT ID", "FLIGHT #", "TO", "FROM", "DEPARTURE TIME", "ARRIVAL TIME", "DURATION", "GATE", "CAPACITY" ,"COST" };
	//Object header[] = { "FLIGHT ID", "FLIGHT #", "TO", "FROM", "DEPARTURE TIME", "ARRIVAL TIME", "DURATION", "GATE", "CAPACITY" ,"COST" };
	
	JTextField[] jtf = {new JTextField(), new JTextField()};
	private JTextField flightIDText;
	
	//declare variables
	static String flightString;
	static String username;
	
	public FlightBooking() {
			
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Flight Booking Page");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);	
		lblRegPage.setForeground(Color.blue);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		JTable table = new JTable();
		
		//supress scrolling for now
//		JScrollPane scrollPane = new JScrollPane(table);
//		scrollPane.setBounds(245,118,788,100);
//		add(scrollPane);
		
		JButton btnSubmit = new JButton("Book");
		btnSubmit.setBounds(843, 561, 117, 30);
		getContentPane().add(btnSubmit);
		//call the active user from login page to pull the username in the action listener
		//use the database + confirmation page code to generate new entry for flight confirmaiton
		
		//call database code inside mouse event and add code for error dialog box
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				flightString = jtf[0].getText();
				username = jtf[1].getText();
				
				int flightID = Integer.parseInt(flightString);
				
				boolean errors = false;
				//if there are errors
				if (errors){
					//error dialoge box
				}
				else {
					//populate panel data:
					try {
						ArrayList<String> array = confirm.selectConfirm(username, flightID);
						System.out.println("array created");
						confirm.insertConfirm(array);
						System.out.println("sent to table");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
					
					//navigate to confirmaiton page
					Confirmation newWindow = new Confirmation();
					newWindow.setVisible(true);
					newWindow.setVisible(true);
					newWindow.setSize(1200, 700);
					newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
			
		});
		
		
		JButton btnMain = new JButton("Return to Main Menu");
		btnMain.setBounds(243, 576, 174, 30);
		getContentPane().add(btnMain);
		btnMain.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		
		String[] timeSearch = { "TIME SEARCH", "0001", "0100", "0200", "0300", "0400", "0500", "0600", "0700", "0800", "0900", "1000", "1100", 
				"1200", "1300", "1400", "1500", "1600", "1700", "1800", "1900", "2000", "2100", "2200", "2300","2400"};


		// Security Question List
		JComboBox comboBox_2 = new JComboBox(timeSearch);
		comboBox_2.setVisible(true);
		comboBox_2.setBounds(243, 493, 158, 27);
		getContentPane().add(comboBox_2);
		
		JPanel flightPanel = new JPanel();
		flightPanel.setBounds(289, 109, 671, 360);
		getContentPane().add(flightPanel);
		
		JLabel lblSelectYourFlight = new JLabel("Enter your flightID and your username below to Book");
		lblSelectYourFlight.setBounds(621, 497, 339, 16);
		getContentPane().add(lblSelectYourFlight);
		
		JLabel lblDesierdFlightid = new JLabel("Desierd FlightID:");
		lblDesierdFlightid.setBounds(530, 539, 117, 16);
		getContentPane().add(lblDesierdFlightid);
		
		//ENTER FLIGHT ID
		jtf[0] = new JTextField();
		jtf[0].setBounds(659, 525, 134, 28);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);

		
		JLabel lblMyUsername = new JLabel("My Username:");
		lblMyUsername.setBounds(551, 567, 96, 16);
		getContentPane().add(lblMyUsername);
		
		//ENTER USERNAME TO BOOK FLIGHT
		jtf[1] = new JTextField();
		jtf[1].setBounds(674, 561, 134, 28);
		getContentPane().add(jtf[1]);
			
		
	}
	
	public static void main(String[] args) {


		FlightBooking frame = new FlightBooking();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		TableDisplay  flightTable = new TableDisplay ();
//		flightTable.setVisible(true);
//		flightTable.setSize(1200, 700);
//		flightTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	
}






