package mainGUIinterface;
//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
import polymorphObj.Admin;
import polymorphObj.Customer;

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

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

//Buttons = clear all, main menu, register customer, register admin
public class Registration extends JFrame {
	
	static Registration frame; //initalize for frame close 
	
	//must call code to send to database 
	SendData send = new SendData();
	
	JTextField[] jtf = {new JTextField(), new JTextField(), new JTextField(),
						new JTextField(), new JTextField(), new JTextField(),
						new JTextField(), new JTextField(), new JTextField(),
						new JTextField(), new JTextField(), new JTextField(),
						new JTextField()};
	
	String[] states = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
			"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
			"NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
			"WY" };
	
	String[] securQuest = { "What is your Mother's Maiden Name?", "Who is your favorite actor/actress?",
			"What was your first pet's name?", "What city were you born in?", "What is your favorite class at GSU?",
			"What is your favorite color?" };

	JComboBox comboBox_1 = new JComboBox(states);
	JComboBox comboBox_2 = new JComboBox(securQuest);
	JButton clear;
	
	//changing variable names to match object and database variables
	//String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) throws IllegalArgumentException{
	
	
	static String firstName;		//3
	static String middleInitial;	//4
	static String lastName;			//5
	static String address;			//6
	static String city; 			//7
	static String state;			//9
	static String zipSTRING;				//8 NEED TO CAST TO INT 
	static String ssnSTRING;				//11 NEED TO CAST TO INT
	static String email;			//10
	static String username;			//1
	static String initialPassword;
	static String password;			//2
	static String secQ;				//13
	static String secA;				//14
	
	//USE IN ADMIN MOUSE EVENT ONLY 
	static String security;
	static String code = "3270";
	
	private JTextField textField;
	private JTextField textField_1;
	
	public Registration() {
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);

		JLabel lblRegPage = new JLabel("Registration Page");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);

		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.white);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));

		// First Name Text Field
		jtf[0].setBounds(538, 123, 229, 26);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);

		// Middle Initial Text Field
		jtf[1].setBounds(538, 149, 28, 26);
		getContentPane().add(jtf[1]);
		jtf[1].setColumns(10);

		// Last Name Text Field
		jtf[2].setBounds(538, 173, 229, 26);
		getContentPane().add(jtf[2]);
		jtf[2].setColumns(10);

		// Street Address Text Field
		jtf[3].setBounds(538, 196, 229, 26);
		getContentPane().add(jtf[3]);
		jtf[3].setColumns(10);

		// City Text Field
		jtf[4].setBounds(446, 226, 104, 26);
		getContentPane().add(jtf[4]);
		jtf[4].setColumns(10);

		// Zip Code Text Field
		jtf[5].setBounds(734, 226, 82, 26);
		getContentPane().add(jtf[5]);
		jtf[5].setColumns(10);

		// SSN Text Field
		jtf[6].setBounds(610, 259, 156, 26);
		getContentPane().add(jtf[6]);
		jtf[6].setColumns(10);

		// Email Address Text Field
		jtf[7].setColumns(10);
		jtf[7].setBounds(610, 287, 156, 26);
		getContentPane().add(jtf[7]);

		// Username Text Field
		jtf[8].setBounds(610, 310, 156, 26);
		getContentPane().add(jtf[8]);
		jtf[8].setColumns(10);

		// Initial Password Text Field
		jtf[9].setBounds(610, 335, 156, 26);
		getContentPane().add(jtf[9]);
		jtf[9].setColumns(10);

		// Confirm Password Text Field
		jtf[10].setBounds(610, 359, 156, 26);
		getContentPane().add(jtf[10]);
		jtf[10].setColumns(10);


		// Answer to Security Question Text Field
		jtf[11].setBounds(610, 410, 156, 26);
		getContentPane().add(jtf[11]);
		jtf[11].setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(457, 128, 93, 16);
		getContentPane().add(lblFirstName);

		JLabel lblMiddleInitial = new JLabel("Middle Initial:");
		lblMiddleInitial.setForeground(Color.WHITE);
		lblMiddleInitial.setBounds(443, 154, 93, 16);
		getContentPane().add(lblMiddleInitial);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBounds(457, 178, 77, 16);
		getContentPane().add(lblLastName);

		JLabel lblStreetAddress = new JLabel("Street Address:");
		lblStreetAddress.setForeground(Color.WHITE);
		lblStreetAddress.setBounds(432, 201, 104, 16);
		getContentPane().add(lblStreetAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(Color.WHITE);
		lblCity.setBounds(413, 231, 37, 16);
		getContentPane().add(lblCity);

		JLabel lblState = new JLabel("State:");
		lblState.setForeground(Color.WHITE);
		lblState.setBounds(558, 231, 37, 16);
		getContentPane().add(lblState);

		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setForeground(Color.WHITE);
		lblZipCode.setBounds(670, 231, 61, 16);
		getContentPane().add(lblZipCode);

		JLabel lblSocialSecurityNumber = new JLabel("Social Security Number:");
		lblSocialSecurityNumber.setForeground(Color.WHITE);
		lblSocialSecurityNumber.setBounds(456, 264, 156, 16);
		getContentPane().add(lblSocialSecurityNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setBounds(510, 292, 98, 16);
		getContentPane().add(lblEmailAddress);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(538, 315, 75, 16);
		getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(538, 340, 75, 16);
		getContentPane().add(lblPassword);

		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(483, 364, 130, 16);
		getContentPane().add(lblConfirmPassword);

		JLabel lblSecurityQuestion = new JLabel("Security Question:");
		lblSecurityQuestion.setForeground(Color.WHITE);
		lblSecurityQuestion.setBounds(485, 387, 123, 16);
		getContentPane().add(lblSecurityQuestion);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setBounds(547, 415, 61, 16);
		getContentPane().add(lblAnswer);

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
				
		JButton adminRegister = new JButton("Register Admin");
		adminRegister.setBounds(595, 538, 125, 29);
		getContentPane().add(adminRegister);
		adminRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//catch errors that shahzad writes
				boolean errors = false;
				
				//capture data
				firstName = jtf[0].getText();
				middleInitial = jtf[1].getText();
				lastName = jtf[2].getText();
				address = jtf[3].getText();
				city = jtf[4].getText();
				state = comboBox_1.getSelectedItem().toString();
				zipSTRING = jtf[5].getText();
				ssnSTRING = jtf[6].getText();
				email = jtf[7].getText();
				username = jtf[8].getText();
				initialPassword = jtf[9].getText();
				password = jtf[10].getText();
				secQ = comboBox_2.getSelectedItem().toString();
				secA = jtf[11].getText();
				security = jtf[12].getText();
				
				int zip = Integer.parseInt(zipSTRING);
				int ssn = Integer.parseInt(ssnSTRING);
				
				//need to verify security code before allowing for admin object creation 
				if (Objects.equals(security, code)){
					
					//valid security code so admin access granted - create object and put in database
					
					Admin myAdmin = new Admin(username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA);
					//(String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) 
					
					try {
						send.postAdmin(myAdmin);
						System.out.println("Successful send!");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (errors){
						//displays the code for errors
						JOptionPane.showMessageDialog (null, "Text Entry Error", "Title", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						//successful registration and go to registration page
						RegistrationComplete newWindow = new RegistrationComplete();
						newWindow.setVisible(true);
						newWindow.setVisible(true);
						newWindow.setSize(1200, 700);
						newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						//frame.dispose(); //close frame
					}
				}
				else {
					//invalid login and no object created and nothing sent to database
					JOptionPane.showMessageDialog (null, "Invalid Security Key", "Title", JOptionPane.INFORMATION_MESSAGE);
					
				}
			
				
			}
		});
		
		
		comboBox_1.setVisible(true);
		comboBox_1.setBounds(595, 227, 70, 27);
		getContentPane().add(comboBox_1);
		
		comboBox_2.setVisible(true);
		comboBox_2.setBounds(610, 383, 328, 27);
		getContentPane().add(comboBox_2);
		
		JButton custRegister = new JButton("Register Customer");
		custRegister.setBounds(704, 461, 145, 29);
		getContentPane().add(custRegister);
		
		JLabel lblSecurityKey = new JLabel("Security Key:");	//newly added label for security key
		lblSecurityKey.setForeground(Color.WHITE);
		lblSecurityKey.setBounds(519, 510, 93, 16);
		getContentPane().add(lblSecurityKey);
		
		jtf[12] = new JTextField();					//newly added field for security key
		jtf[12].setBounds(624, 504, 134, 28);
		getContentPane().add(jtf[12]);
		jtf[12].setColumns(10);
		
		
		
		custRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//match names: String username, String password, String firstName, String middleInitial, 
				//String lastName, String address, String city, int zip, String state, String email, 
				//int ssn, String secQ, String secA) throws IllegalArgumentException
				
				
				
				
				//call error message codes
				boolean errors = false;
				
				firstName = jtf[0].getText();
				middleInitial = jtf[1].getText();
				lastName = jtf[2].getText();
				address = jtf[3].getText();
				city = jtf[4].getText();
				state = comboBox_1.getSelectedItem().toString();
				zipSTRING = jtf[5].getText();
				ssnSTRING = jtf[6].getText();
				email = jtf[7].getText();
				username = jtf[8].getText();
				initialPassword = jtf[9].getText();
				password = jtf[10].getText();
				secQ = comboBox_2.getSelectedItem().toString();
				secA = jtf[11].getText();
				
				int zip = Integer.parseInt(zipSTRING);
				int ssn = Integer.parseInt(ssnSTRING);
				
			
				
				//CALL ERROR REPORTING MESSAGES HERE FOR PHONE, SSN VALID ENTRY 
				
				Customer myCustomer = new Customer(username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA);
				//(String username, String password, String firstName, String middleInitial, String lastName, String address, String city, int zip, String state, String email, int ssn, String secQ, String secA) 
				
				try {
					send.postCust(myCustomer);
					System.out.println("Successful send!");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if (errors){
					//displays the code for errors
					JOptionPane.showMessageDialog (null, "Text Entry Error", "Title", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					//successful registration and go to registration page
					RegistrationComplete newWindow = new RegistrationComplete();
					newWindow.setVisible(true);
					newWindow.setVisible(true);
					newWindow.setSize(1200, 700);
					newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//frame.dispose(); //close frame
				}
				
			}
		});
		//new background image added
				JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
				backgroundImage.setBounds(1, 1, 1198, 696);
				getContentPane().add(backgroundImage);

	}
	
	public static void main(String[] args) throws Exception{


		Registration frame = new Registration();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		


	}
}


