package mainGUIinterface;
//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Confirmation extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	static Confirmation frame; //initalize for frame close 
	private JTable ConfirmationTable;
	
	public Confirmation() throws Exception {

		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);

		JLabel lblRegPage = new JLabel("Congratulations!");
		lblRegPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);
		lblRegPage.setForeground(Color.red);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton btnMain = new JButton("Return to Main Menu");
		btnMain.setBackground(new Color(255, 0, 0));
		btnMain.setBounds(539, 542, 182, 30);
		getContentPane().add(btnMain);
		
		
		
		
		
		//confirmation panel needs to pull the array list row from database
		//first pull the row to display
		

//        getContentPane().add(scrollPane);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        pack();
//        setVisible(true);
		
		
		//firework display code
		JLabel lblCongratsPic = new JLabel("");
		lblCongratsPic.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/firework.jpg")).getImage();
		lblCongratsPic.setIcon(new ImageIcon(img));
		lblCongratsPic.setBounds(322, 92, 611, 150);
		getContentPane().add(lblCongratsPic);
		
		JLabel lblNewLabel = new JLabel("Please save or print confirmation below:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(322, 264, 611, 16);
		getContentPane().add(lblNewLabel);
		
	
			
		//PULL FROM MYSQL CONFIRMATION TABLE
		ConfirmationTable = new JTable();
		ConfirmationTable.setBounds(129, 326, 927, 106);
		getContentPane().add(ConfirmationTable);
		
		JScrollPane scrollPane1 = new JScrollPane(ConfirmationTable);
		scrollPane1.setBounds(129, 326, 927, 106);
		add(scrollPane1);
		
		//DISPLAY THE FREAKING CONFIRMATION TABLE 
		Connection conn = getConnection();
 	   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM confirmation;" );
 	   ResultSet result = stmt.executeQuery();
     
 	   ResultSetMetaData rsmetadata = result.getMetaData();
 	   int columns = 5;	//----------------------------------------- Laura manually put it column count because last one was getting cut off!					
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
 	   
 	  ConfirmationTable.setModel(dtm);
 	  
 	  JLabel lblConfirmation = new JLabel("CONFIRMATION #");
 	  lblConfirmation.setBounds(129, 303, 127, 16);
 	  getContentPane().add(lblConfirmation);
 	  
 	  JLabel lblFlightid = new JLabel("FlightID:");
 	  lblFlightid.setBounds(332, 303, 61, 16);
 	  getContentPane().add(lblFlightid);
 	  
 	  JLabel lblUsername = new JLabel("Username");
 	  lblUsername.setBounds(577, 303, 88, 16);
 	  getContentPane().add(lblUsername);
 	  
 	  JLabel lblCostusd = new JLabel("Cost (USD):");
 	  lblCostusd.setBounds(799, 303, 93, 16);
 	  getContentPane().add(lblCostusd);
		
	
		
		btnMain.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.dispose(); //close frame
			}
			
		});
		
		
		
		


	}
	       
	//CONNECT TO DATABASE
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
	
	public static void main(String[] args) throws Exception {


		Confirmation frame = new Confirmation();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}


