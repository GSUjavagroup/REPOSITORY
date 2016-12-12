package database;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

//this code is for pulling the flight data into a JTable for the booking page

public class TableDisplay extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TableDisplay() {
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);
		
		
		JTable table = new JTable();
		getContentPane().add(table);
		table.setBounds(40,118,1100,100);
		table.setVisible(true);
	     {
	   

	       try {
	    	   Connection conn = getConnection();
	    	   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM flights;" );
	    	   ResultSet result = stmt.executeQuery();
	        
	    	   ResultSetMetaData rsmetadata = result.getMetaData();
	    	   int columns = rsmetadata.getColumnCount();
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
	    	   result.close();
	    	   stmt.close();
	    	   conn.close();
	    	   
	       } catch ( Exception e ) {
	         System.out.print(e);
	         System.exit(0);
	       }
	       System.out.println("Operation done successfully");
	     }
	}

	
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

		TableDisplay  frame = new TableDisplay ();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

