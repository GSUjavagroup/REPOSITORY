package mainGUIinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.DeleteData;
import database.FlightTable;
import database.Validate;
import testCodes.FlightBooking;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class AdminMenu extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	//use for capturing login data on Submit button action listener
	JTextField[] jtf = {new JTextField(), new JTextField(), new JTextField()};

	
	//declare variables for submit button action
	static String dUser;	//[0]
	static String dFlightSTRING;	//[1] will need to parse to int
	static String findConfirm;	//[2]
	
	
	//call our validation method
	Validate val = new Validate();		//use for verifying database data
	DeleteData delete = new DeleteData();		//use for deleting data in MySQL
	
	private JPanel contentPane;
	private JTextField textField_CONFIRMATION;



	/**
	 * Create the frame.
	 */
	public AdminMenu() {
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Admin Menu Options");
		lblRegPage.setBounds(568, 51, 260, 47);
		getContentPane().add(lblRegPage);


		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.black);


		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		//textField = new JTextField();
		//captures username
		jtf[0].setBounds(548, 148, 146, 26);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);
		
		JLabel lblPassword = new JLabel("Delete Flight (ID):");
		lblPassword.setBounds(422, 186, 125, 16);
		getContentPane().add(lblPassword);
		
		//textField_1 = new JTextField();
		//captures Password
		jtf[1].setBounds(548, 181, 146, 26);
		getContentPane().add(jtf[1]);
		jtf[1].setColumns(10);
		
		//textField_2 = new JTextField();
		//captures Security Key
		jtf[2].setBounds(568, 231, 134, 28);
		getContentPane().add(jtf[2]);
		jtf[2].setColumns(10);
		
	
		
		JLabel lblDeleteUser = new JLabel("Delete User (Username):");
		lblDeleteUser.setBounds(379, 153, 166, 16);
		getContentPane().add(lblDeleteUser);
		
		JLabel lblSecurityKey = new JLabel("Find Confirmation (Username):");
		lblSecurityKey.setBounds(342, 237, 219, 16);
		getContentPane().add(lblSecurityKey);
		
		JButton btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setBounds(747, 140, 117, 29);
		getContentPane().add(btnDeleteUser);
		
		JButton btnDeleteFlight = new JButton("Delete Flight");
		btnDeleteFlight.setBounds(747, 181, 117, 29);
		getContentPane().add(btnDeleteFlight);
		
		JButton btnFindBooking = new JButton("Find Booking");
		btnFindBooking.setBounds(747, 232, 117, 29);
		getContentPane().add(btnFindBooking);
		
		JButton btnBookFlight = new JButton("Book Flight");
		btnBookFlight.setBounds(422, 461, 117, 29);
		getContentPane().add(btnBookFlight);
		
		JButton btnLoginScreen = new JButton("Login Screen");
		btnLoginScreen.setBounds(772, 461, 117, 29);
		getContentPane().add(btnLoginScreen);
		
		JButton btnReturnMainMenu = new JButton("Return to Main Menu");
		btnReturnMainMenu.setBounds(568, 461, 166, 29);
		getContentPane().add(btnReturnMainMenu);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.setBounds(270, 461, 117, 29);
		getContentPane().add(btnClearAll);
		
		JLabel lblConfirmation = new JLabel("Confirmation #:");
		lblConfirmation.setBounds(876, 237, 99, 16);
		getContentPane().add(lblConfirmation);
		
		JPanel confirmationPanel = new JPanel();
		confirmationPanel.setBounds(987, 232, 236, 34);
		getContentPane().add(confirmationPanel);
		
		JLabel lblDeleteConfirmation = new JLabel("Delete Confirmation (#):");
		lblDeleteConfirmation.setBounds(379, 284, 151, 16);
		getContentPane().add(lblDeleteConfirmation);
		
		textField_CONFIRMATION = new JTextField();
		textField_CONFIRMATION.setBounds(542, 278, 196, 28);
		getContentPane().add(textField_CONFIRMATION);
		textField_CONFIRMATION.setColumns(10);
		
		JButton btnDeleteBooking = new JButton("Delete Booking");
		btnDeleteBooking.setBounds(747, 279, 125, 29);
		getContentPane().add(btnDeleteBooking);
		
		JButton btnCreateFlight = new JButton("Create Flight");
		btnCreateFlight.setBounds(923, 461, 117, 29);
		getContentPane().add(btnCreateFlight);
		
		//---------------------------------------------------------------------------------------BUTTON ACTIONS
		
		//Button action for DELETE USER
		btnDeleteUser.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				//capture the username data in index 0 for username
				dUser = jtf[0].getText();
	
				try {
					if (val.Validate(dUser)){
						//if boolean value is true the user exists and proceed with deleting
						//execute delete code for this user
						delete.deleteUser(dUser);
						
						JOptionPane.showMessageDialog (null, "CONFIRMED: User Deleted", "Title", JOptionPane.INFORMATION_MESSAGE);
						
					}
					else {
						//else boolean false means there is no user by that name
						JOptionPane.showMessageDialog (null, "No Username Found", "Title", JOptionPane.INFORMATION_MESSAGE);
						
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		//Button action for DELETE FLIGHT
		btnDeleteFlight.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				//capture the flight data in index 1 but need to parse
				dFlightSTRING = jtf[1].getText();
				int flightID = Integer.parseInt(dFlightSTRING);
	
				try {
					if (val.Validate(flightID)){
						//if boolean value is true the user exists and proceed with deleting
						//execute delete code for this user
						delete.deleteFlight(flightID);
						
						JOptionPane.showMessageDialog (null, "CONFIRMED: Flight Deleted", "Title", JOptionPane.INFORMATION_MESSAGE);
						
					}
					else {
						//else boolean false means there is no user by that name
						JOptionPane.showMessageDialog (null, "No Flight Found", "Title", JOptionPane.INFORMATION_MESSAGE);
						
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		//Button action for MAIN MENU		
		btnReturnMainMenu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		//Button action for LOGIN SCREEN
		btnLoginScreen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Login newWindow = new Login();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		//Button action for Flight Booking
		btnBookFlight.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				FlightTable newWindow = new FlightTable();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		//Button action for CLEAR ALL
		btnClearAll.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0; i < jtf.length; i++) {
					jtf[i].setText("");
				}
			}
			
		});
		

	}


	//run the code 
	public static void main(String[] args) {


		AdminMenu frame = new AdminMenu();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}
