package mainGUIinterface;
//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

import database.SendData;
import polymorphObj.Flight;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import javax.swing.SwingConstants;

public class CreateFlight extends JFrame {
	
	//must call code to send to database 
	SendData send = new SendData();
	
	JTextField[] jtf = {new JTextField(), new JTextField(), new JTextField(),
						new JTextField(), new JTextField(), new JTextField(),
						new JTextField(), new JTextField(), new JTextField(),
						new JTextField()};
	
	JButton clear;
	
	//initialize all String variables to capture in JTextField 
	static String flightIDSTRING;	//0 NEED TO CAST TO INT
	static String flightNum;		//1
	static String departure;		//2
	static String arrival;			//3
	static String depTimeSTRING; 	//4 NEED TO CAST TO INT
	static String arrTimeSTRING;	//5 NEED TO CASE TO INT
	static String durationSTRING;	//6 NEED TO CAST TO INT 
	static String gate;				//7
	static String capacitySTRING;	//8 NEED TO CAST TO INT
	static String costSTRING;		//9 NEED TO CAST TO INT
	
	static CreateFlight frame; //initalize for frame close 
	
	//frame code
	public CreateFlight() {
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);

		JLabel lblRegPage = new JLabel("Administration: Insert Flight Data");
		lblRegPage.setBounds(411, 50, 420, 47);
		getContentPane().add(lblRegPage);

		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.white);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));

		// flightID field 
		jtf[0].setBounds(538, 123, 229, 26);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);
		//flightIDSTRING = jtf[0].getText();			//CAPTURED DATA
		//int flightID = Integer.parseInt(flightIDSTRING);

		// flightNum field
		jtf[1].setBounds(538, 149, 229, 26);
		getContentPane().add(jtf[1]);
		jtf[1].setColumns(10);
		//flightNum = jtf[1].getText();				//CAPTURED DATA

		// departure field 
		jtf[2].setBounds(538, 173, 229, 26);
		getContentPane().add(jtf[2]);
		jtf[2].setColumns(10);
		//departure = jtf[2].getText();				//CAPTURED DATA

		// arrival field
		jtf[3].setBounds(538, 196, 229, 26);
		getContentPane().add(jtf[3]);
		jtf[3].setColumns(10);
		//arrival = jtf[3].getText();					//CAPTURED DATA

		// depTime field
		jtf[4].setBounds(610, 259, 156, 26);
		getContentPane().add(jtf[4]);
		jtf[4].setColumns(10);
		//depTimeSTRING = jtf[4].getText();			//CAPTURED DATA
		//int depTime = Integer.parseInt(depTimeSTRING );
		
		// arrTime	field
		jtf[5].setColumns(10);
		jtf[5].setBounds(610, 287, 156, 26);
		getContentPane().add(jtf[5]);
		//arrTimeSTRING = jtf[5].getText();			//CAPTURED DATA
		//int arrTime = Integer.parseInt(arrTimeSTRING );
		
		// duration field
		jtf[6].setBounds(610, 310, 156, 26);
		getContentPane().add(jtf[6]);
		jtf[6].setColumns(10);
		//durationSTRING = jtf[6].getText();			//CAPTURED DATA
		//int duration = Integer.parseInt(durationSTRING );
		
		// gate field
		jtf[7].setBounds(610, 335, 156, 26);
		getContentPane().add(jtf[7]);
		jtf[7].setColumns(10);
		//gate = jtf[7].getText();					//CAPTURED DATA

		// capacity field
		jtf[8].setBounds(610, 359, 156, 26);
		getContentPane().add(jtf[8]);
		jtf[8].setColumns(10);
		//capacitySTRING = jtf[8].getText();			//CAPTURED DATA
		//int capacity = Integer.parseInt(capacitySTRING );
		
		// cost field
		jtf[9].setBounds(610, 410, 156, 26);
		getContentPane().add(jtf[9]);
		jtf[9].setColumns(10);
		//costSTRING = jtf[9].getText();				//CAPTURED DATA
		//int cost= Integer.parseInt(costSTRING);
		
		JLabel lblFirstName = new JLabel("Flight ID:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setBounds(443, 126, 93, 16);
		getContentPane().add(lblFirstName);

		JLabel lblMiddleInitial = new JLabel("Flight Number:");
		lblMiddleInitial.setForeground(Color.WHITE);
		lblMiddleInitial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMiddleInitial.setBounds(419, 154, 117, 16);
		getContentPane().add(lblMiddleInitial);

		JLabel lblLastName = new JLabel("Departure City:");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setBounds(429, 178, 105, 16);
		getContentPane().add(lblLastName);

		JLabel lblStreetAddress = new JLabel("Arrival City:");
		lblStreetAddress.setForeground(Color.WHITE);
		lblStreetAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStreetAddress.setBounds(432, 206, 104, 16);
		getContentPane().add(lblStreetAddress);

		JLabel lblSocialSecurityNumber = new JLabel("Departure Time:");
		lblSocialSecurityNumber.setForeground(Color.WHITE);
		lblSocialSecurityNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSocialSecurityNumber.setBounds(431, 268, 105, 16);
		getContentPane().add(lblSocialSecurityNumber);

		JLabel lblEmailAddress = new JLabel("Arrival Time:");
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmailAddress.setBounds(457, 292, 81, 16);
		getContentPane().add(lblEmailAddress);

		JLabel lblUsername = new JLabel("Duration:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(461, 312, 75, 16);
		getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Gate:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(471, 340, 67, 16);
		getContentPane().add(lblPassword);

		JLabel lblConfirmPassword = new JLabel("Capacity:");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(457, 368, 81, 16);
		getContentPane().add(lblConfirmPassword);

		JLabel lblSecurityQuestion = new JLabel("Cost:");
		lblSecurityQuestion.setForeground(Color.WHITE);
		lblSecurityQuestion.setBounds(507, 414, 42, 16);
		getContentPane().add(lblSecurityQuestion);

		clear = new JButton("Clear All");
		clear.setBounds(432, 461, 117, 29);
		getContentPane().add(clear);
		
		clear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0; i < jtf.length; i++) {
					jtf[i].setText("");
				}
			}
			
		});
			
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(568, 461, 117, 29);
		getContentPane().add(btnMainMenu);				
		
		JButton btninsertFlight = new JButton("Insert Flight");
		btninsertFlight.setBounds(704, 461, 145, 29);
		getContentPane().add(btninsertFlight);
		
		JButton btnBackToAdmin = new JButton("Back to Admin Menu");
		btnBackToAdmin.setBounds(540, 519, 173, 29);
		getContentPane().add(btnBackToAdmin);
		
		
	
		//------------------------------------------------------------------BUTTON ACTIONS
		
		//ACTION FOR GOING TO MAIN MENU
		btnMainMenu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.dispose(); //close frame
			}
			
		});
		
		//ACTION FOR GOING BACK TO ADMIN MENU
		btnBackToAdmin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AdminMenu newWindow = new AdminMenu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.dispose(); //close frame
			}
			
		});
		
		//ACTION FOR INSERTING FLIGHT
		btninsertFlight.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				//call error message codes
				boolean errors = false;
				
				flightIDSTRING = jtf[0].getText();
				flightNum = jtf[1].getText();
				departure = jtf[2].getText();
				arrival = jtf[3].getText();	
				depTimeSTRING = jtf[4].getText();
				arrTimeSTRING = jtf[5].getText();
				durationSTRING = jtf[6].getText();
				gate = jtf[7].getText();
				capacitySTRING = jtf[8].getText();
				costSTRING = jtf[9].getText();
				
				//parse codes:
				int flightID = Integer.parseInt(flightIDSTRING);
				int depTime = Integer.parseInt(depTimeSTRING );
				int arrTime = Integer.parseInt(arrTimeSTRING );
				int duration = Integer.parseInt(durationSTRING );
				int capacity = Integer.parseInt(capacitySTRING );
				int cost= Integer.parseInt(costSTRING);			
			
				//create flight object
				Flight myFlight = new Flight(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost);
//				//public Flight(int flightID, String flightNum, String departure, String arrival, int depTime, int arrTime, int duration, String gate, int capacity, int cost){
				
				
				try {
					send.postFlight(myFlight);
					System.out.println("Successful send!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if (errors){
					//displays the code for errors - get with shahzhad 
					JOptionPane.showMessageDialog (null, "Text Entry Error", "Title", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					//successful flight update - need display
					JOptionPane.showMessageDialog (null, "Flight Info Added to Database", "Title", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			}
	});
		//new background image added
				JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
				backgroundImage.setBounds(1, 1, 1198, 696);
				getContentPane().add(backgroundImage);

	}
	
	public static void main(String[] args) throws Exception{


		CreateFlight frame = new CreateFlight();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
}


