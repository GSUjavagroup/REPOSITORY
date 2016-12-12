package mainGUIinterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import database.FlightTable;
import database.Validate;

import javax.swing.JTextField;
import javax.swing.JButton;


public class Login extends JFrame {
	//copy/paste to use activeUser: Login login = new Login();
	
	//call our validation method
	Validate val = new Validate();
	
	private JTextField textField;
	private JTextField textField_1;
	
	//use for capturing login data on Submit button action listener
	JTextField[] jtf = {new JTextField(), new JTextField()};

	
	//declare variables for submit button action
	static String username;
	static String password;
	

	
	public Login() {
	
		//String acctiveUser = jtf[0].getText(); //set active user for booking page 
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Login Page");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);


		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.black);


		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(470, 153, 75, 16);
		getContentPane().add(lblUsername);
		
		//textField = new JTextField();
		jtf[0].setBounds(548, 148, 146, 26);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(472, 186, 75, 16);
		getContentPane().add(lblPassword);
		
		//textField_1 = new JTextField();
		jtf[1].setBounds(548, 181, 146, 26);
		getContentPane().add(jtf[1]);
		jtf[1].setColumns(10);
		
		JButton btnForgotUsername = new JButton("Forgot Username?");
		btnForgotUsername.setBounds(422, 353, 156, 29);
		getContentPane().add(btnForgotUsername);
					
		btnForgotUsername.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ForgotUsername newWindow = new ForgotUsername();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setBounds(579, 353, 152, 29);
		getContentPane().add(btnForgotPassword);
		
		btnForgotPassword.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ForgotPassword newWindow = new ForgotPassword();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		
		JButton subLogin = new JButton("Submit");
		subLogin.setBounds(530, 232, 99, 35);
		getContentPane().add(subLogin);
		subLogin.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				//capture the login information
				username = jtf[0].getText();
				password = jtf[1].getText();
		
				//System.out.println(username + " " + password);
			
				
				if (val.Validate(username, password)){
					//if boolean value is true then allow button to go to next page
					//System.out.println("boolean is true");
					
					//FlightTable is in database folder for now
					
					FlightTable newWindow = new FlightTable();
					newWindow.setVisible(true);
					newWindow.setVisible(true);
					newWindow.setSize(1200, 700);
					newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//System.out.println(acctiveUser);
				}
				else {
					//have an error dialog box pop up
					JOptionPane.showMessageDialog (null, "Invalid Login", "Title", JOptionPane.INFORMATION_MESSAGE);
					
					//System.out.println("boolean is false");
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
			}
			
		});
		
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(523, 622, 117, 29);
		getContentPane().add(btnAdminLogin);
		
		btnAdminLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				AdminLogin newWindow = new AdminLogin();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		


	}
	




	public static void main(String[] args) {


		Login frame = new Login();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}
}
