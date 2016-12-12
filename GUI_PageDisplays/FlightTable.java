package database;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import mainGUIinterface.Confirmation;

import javax.swing.JTable;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

//this code is for pulling the flight data into a JTable for the booking page

public class FlightTable extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//use for capturing entered data
	JTextField[] jtf = {new JTextField()};
	
	
	static int selectedRow;
	static String username;	//assign to get textfield jtf[0]
	
	//call our database code:
	ConfirmationTable confirm = new ConfirmationTable();
	
	//validate username:
	Validate val = new Validate();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public FlightTable() {
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);
		
//		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
//				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scrollPane.setBounds(45, 118, 1100, 100);
//		add(scrollPane);
		//AUTO_RESIZE_LAST_COLUMN
		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		JTable table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		getContentPane().add(table);
		table.setBounds(6,108,1155,100);
		table.setVisible(true);
	     {
	   
	    	 //CODE TO DISPLAY CURRENT FLIGHT DATA FROM MYSQL
	       try {
	    	   Connection conn = getConnection();
	    	   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM flights;" );
	    	   ResultSet result = stmt.executeQuery();
	        
	    	   ResultSetMetaData rsmetadata = result.getMetaData();
	    	   int columns = 11;	//----------------------------------------- Laura manually put it column count because last one was getting cut off!					
	    	   DefaultTableModel dtm = new DefaultTableModel();
	    	   @SuppressWarnings("rawtypes")
			Vector column_name = new Vector();
	    	   @SuppressWarnings("rawtypes")
			Vector data_rows = new Vector();

	    	   for(int i =1; i < columns; i++) {
	    		   column_name.addElement(rsmetadata.getColumnName(i));
	    	   }
	    	   dtm.setColumnIdentifiers(column_name);

	    	   while (result.next()) {
	    		   data_rows = new Vector();
	    		   for(int j = 1; j < columns; j++) {
	    			   data_rows.addElement (result.getString(j));
	    		   }
	    		   dtm.addRow(data_rows);
	    	   }
	    	   
	    	   table.setModel(dtm);
	    	   
	    	   JLabel lblNewLabel = new JLabel("New label");
	    	   lblNewLabel.setBounds(170, 171, 61, 16);
	    	   getContentPane().add(lblNewLabel);
	    	   
	    	   JLabel lblFlightBooking = new JLabel("Flight Booking");
	    	   lblFlightBooking.setForeground(Color.WHITE);
	    	   lblFlightBooking.setFont(new Font("Lucida Grande", Font.BOLD, 40));
	    	   lblFlightBooking.setHorizontalAlignment(SwingConstants.CENTER);
	    	   lblFlightBooking.setBounds(345, 6, 476, 48);
	    	   getContentPane().add(lblFlightBooking);
	    	   
	    	   JLabel lblPleaseSelectYour = new JLabel("Please Select Your Flight Below:");
	    	   lblPleaseSelectYour.setHorizontalAlignment(SwingConstants.CENTER);
	    	   lblPleaseSelectYour.setForeground(Color.WHITE);
	    	   lblPleaseSelectYour.setBounds(442, 52, 282, 16);
	    	   getContentPane().add(lblPleaseSelectYour);
	    	   
	    	   JLabel lblNewLabel_1 = new JLabel("After Selecting Your Flight, Enter Your Username & Click Book");
	    	   lblNewLabel_1.setForeground(Color.WHITE);
	    	   lblNewLabel_1.setBounds(341, 241, 401, 16);
	    	   getContentPane().add(lblNewLabel_1);
	    	   
	    	   JLabel lblUsername = new JLabel("USERNAME:");
	    	   lblUsername.setFont(new Font("Lucida Grande", Font.BOLD, 13));
	    	   lblUsername.setForeground(Color.WHITE);
	    	   lblUsername.setBounds(341, 269, 83, 16);
	    	   getContentPane().add(lblUsername);
	    	   
	    	   jtf[0] = new JTextField();
	    	   jtf[0].setBounds(436, 263, 289, 28);
	    	   getContentPane().add(jtf[0]);
	    	   jtf[0].setColumns(10);
	    	   
	    	   JButton btnMainMenu = new JButton("Main Menu");
	    	   btnMainMenu.setBounds(219, 333, 117, 29);
	    	   getContentPane().add(btnMainMenu);
	    	   
	    	   JButton btnLogin = new JButton("Login");
	    	   btnLogin.setBounds(401, 333, 117, 29);
	    	   getContentPane().add(btnLogin);
	    	   
	    	   //LABELS THAT GO AVOVE THE TABLE
	    	   JLabel lblFlightId = new JLabel("Flight ID");
	    	   lblFlightId.setBounds(6, 91, 61, 16);
	    	   getContentPane().add(lblFlightId);
	    	   
	    	   JLabel lblFlight = new JLabel("Flight #");
	    	   lblFlight.setBounds(112, 91, 61, 16);
	    	   getContentPane().add(lblFlight);
	    	   
	    	   JLabel lblFrom = new JLabel("FROM:");
	    	   lblFrom.setBounds(227, 91, 61, 16);
	    	   getContentPane().add(lblFrom);
	    	   
	    	   JLabel lblTo = new JLabel("TO:");
	    	   lblTo.setBounds(341, 91, 61, 16);
	    	   getContentPane().add(lblTo);
	    	   
	    	   JLabel lblDepartsAt = new JLabel("Departs At:");
	    	   lblDepartsAt.setBounds(452, 91, 76, 16);
	    	   getContentPane().add(lblDepartsAt);
	    	   
	    	   JLabel lblArrivesAt = new JLabel("Arrives At:");
	    	   lblArrivesAt.setBounds(567, 91, 66, 16);
	    	   getContentPane().add(lblArrivesAt);
	    	   
	    	   JLabel lblDuration = new JLabel("Duration:");
	    	   lblDuration.setBounds(681, 91, 61, 16);
	    	   getContentPane().add(lblDuration);
	    	   
	    	   JLabel lblGate = new JLabel("Gate:");
	    	   lblGate.setBounds(798, 91, 61, 16);
	    	   getContentPane().add(lblGate);
	    	   
	    	   JLabel lblCapacity = new JLabel("Capacity:");
	    	   lblCapacity.setBounds(913, 91, 61, 16);
	    	   getContentPane().add(lblCapacity);
	    	   
	    	   JLabel lblCost = new JLabel("Cost:");
	    	   lblCost.setBounds(1030, 91, 61, 16);
	    	   getContentPane().add(lblCost);
	    	   result.close();
	    	  
	    	   
	    	   JButton btnBook = new JButton("BOOK");
	    	   btnBook.setBounds(731, 263, 117, 29);
	    	   getContentPane().add(btnBook);
	    	   
	    	   //SELECT ROW VALUES TO SEND TO DB WHEN YOU CLICK BOOK -------------------------------------------- MOUSE EVENT
	    	   btnBook.addActionListener(new ActionListener() {

	   			public void actionPerformed(ActionEvent e) {
	   				
	   				//first part of action is to capture the username entered
	   				username = jtf[0].getText();
	  
	   				//assign selected row value to capture flight info 
	   				selectedRow = table.getSelectedRow();		//Rows start at 0 just like an array!

	   				//System.out.print(selectedRow + "\n"); //------------------------------------ successfully printing the row!
	  		
	   				TableModel book = table.getModel();
	   				Object flightID = book.getValueAt(selectedRow, 0);			//selected row from mouse, column index at 0 
	   				Object flightNum = book.getValueAt(selectedRow, 1);
	   				Object departure = book.getValueAt(selectedRow, 2);
	   				Object arrival = book.getValueAt(selectedRow, 3);
	   				Object depTime = book.getValueAt(selectedRow, 4);
	   				Object arrTime = book.getValueAt(selectedRow, 5);
	   				Object duration = book.getValueAt(selectedRow, 6);
	   				Object gate = book.getValueAt(selectedRow, 7);
	   				Object capacity = book.getValueAt(selectedRow, 8);
	   				Object cost = book.getValueAt(selectedRow, 9);
	   				
	   				//need to cast our flightID object to an int?
	   				String flightSTRING = flightID.toString();
	   				int flight = Integer.parseInt(flightSTRING);
	   				ArrayList<String> array = new ArrayList<String>();
	   				
	   				//check if username is valid
	   				try {
						if (val.Validate(username)){
							System.out.println("valid username");
							//proceed with populatig data into confirmation table
							
							//first select needed data into an array
							array = confirm.selectConfirm(username, flight);
							
							//next we send the data to the confirmation table in MySQL
							confirm.insertConfirm(array);
							
							//navigate to confirmaiton page
							Confirmation newWindow = new Confirmation();
							newWindow.setVisible(true);
							newWindow.setVisible(true);
							newWindow.setSize(1200, 700);
							newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							
							
						} else {
							//print invalid user dialoge box
							JOptionPane.showMessageDialog (null, "Invalid Username", "Title", JOptionPane.INFORMATION_MESSAGE);
						}
					} catch (HeadlessException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	   				
	   				//System.out.println("username is " + username + "and flightID is " + flight);
	   				
//	   				System.out.print("ROW: " + selectedRow + "\n" + "flightID: "  + "\n" + "flightNum: " + flightNum + "\n" + "departure: "
//	   						+ departure + "\n" + "arrival: " + arrival+ "\n" + "duration: " + duration+ "\n" + "gate: " + gate+ "\n" + "caoacity: " 
//	   						+ capacity+ "\n" + "cost: " + cost);
	   			}
	   		});
	    	   
	    	   //CHANGE MATTS CODE FROM POSTGRESQL TO MYSQL
	    
	    	   
	    	   
	    	   
	    	   
	    	   stmt.close();
	    	   conn.close();
	    	   
	       } catch ( Exception e ) {
	         System.out.print(e);
	         System.exit(0);
	       }
	       System.out.println("Operation done successfully");
	     }
	}
	
	//PASTE CONNECTION CODE
	public static Connection getConnection() throws Exception{
		
		try{
			String driver = "com.mysql.jdbc.Driver";
			//string url is where the database is located over the Internet 
			String url = "jdbc:mysql://localhost:3306/AirlineReservation";
					//formula for local is default 3306 port + database name
					//if not using local host then put IP address of server connecting to
			String username = "root"; //default username
			String password = "5rujiruz"; //whatever you set your password to on installation
			//default username is root and use password set in terminal setup
			Class.forName(driver);
			//driver variable created above is used
			
			Connection conn = DriverManager.getConnection(url, username, password);
					//import driver manager and use built in method getConnection
			
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e); //make sure we add a catch for failed connections
		}
		
		return null;
		//leave as null and return connection in the try statement above
	}
	
	
	
	
	public static void main(String[] args) {	

		FlightTable  frame = new FlightTable ();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

