package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import database.Validate;
import flights.FlightBooking;

import javax.swing.JTextField;
import javax.swing.JButton;


public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	//use for capturing login data on Submit button action listener
	JTextField[] jtf = {new JTextField(), new JTextField()};

	
	//declare variables for submit button action
	static String username;
	static String password;
	
	//call our validation method
	Validate val = new Validate();
	
	public Login() {
		
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
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setBounds(579, 353, 152, 29);
		getContentPane().add(btnForgotPassword);
		
		
		JButton subLogin = new JButton("Submit");
		subLogin.setBounds(530, 232, 99, 35);
		getContentPane().add(subLogin);
		subLogin.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				//capture the login information
				username = jtf[0].getText();
				password = jtf[1].getText();
				
				System.out.println(username + " " + password);
				
				if (val.Validate(username, password)){
					//if boolean value is true then allow button to go to next page
					System.out.println("boolean is true");
					
					FlightBooking newWindow = new FlightBooking();
					newWindow.setVisible(true);
					newWindow.setVisible(true);
					newWindow.setSize(1200, 700);
					newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}
				else {
					//have an error dialog box pop up
					System.out.println("boolean is false");
				}
				
//				FlightBooking newWindow = new FlightBooking();
//				newWindow.setVisible(true);
//				newWindow.setVisible(true);
//				newWindow.setSize(1200, 700);
//				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBounds(523, 622, 117, 29);
		getContentPane().add(btnAdminLogin);


	}
	
	public static void main(String[] args) {


		Login frame = new Login();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}
