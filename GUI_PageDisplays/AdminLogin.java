//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
package mainGUIinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.Validate;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class AdminLogin extends JFrame {
	//Admin login is only way to access admin
	
	public String acctiveUser;
	
	//use for capturing login data on Submit button action listener
	JTextField[] jtf = {new JTextField(), new JTextField(), new JTextField()};

	
	//declare variables for submit button action
	static String username;
	static String password;
	static String security;
	static String code = "3270";
	
	//call our validation method
	Validate val = new Validate();

	private JPanel contentPane;
	static AdminLogin frame; //initalize for frame close 


	/**
	 * Create the frame.
	 */
	public AdminLogin() {
		
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Admin Login");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);

		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.WHITE);

		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
	
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(470, 153, 75, 16);
		getContentPane().add(lblUsername);
		
		//textField = new JTextField();
		//captures username
		jtf[0].setBounds(548, 148, 146, 26);
		getContentPane().add(jtf[0]);
		jtf[0].setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(472, 186, 75, 16);
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
				//frame.dispose(); //close frame
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
				//frame.dispose(); //close frame
			}
			
		});
		
		
		JButton subLogin = new JButton("Submit");
		subLogin.setBounds(533, 306, 99, 35);
		getContentPane().add(subLogin);
		subLogin.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				//capture the login information
				username = jtf[0].getText();
				password = jtf[1].getText();
				security = jtf[2].getText(); //captures the security key entered 
				
				System.out.println(username + " " + password + " " + security);
				
				//create loop for checking the security code is accurate 
				if (Objects.equals(security, code)){
					System.out.println("secure admin");
					
					//proceed to checking the username and password
					//check if valid username and password 
					if (val.Validate(username, password)){
						//if boolean value is true then allow button to go to next page
						//System.out.println("boolean is true");
						
						//acctiveUser = username;
						
						AdminMenu newWindow = new AdminMenu();
						newWindow.setVisible(true);
						newWindow.setVisible(true);
						newWindow.setSize(1200, 700);
						newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						//frame.dispose(); //close frame
						
						//System.out.println(acctiveUser);
					}
					else {
						//have an error dialog box pop up
						JOptionPane.showMessageDialog (null, "Invalid Login", "Title", JOptionPane.INFORMATION_MESSAGE);
						//System.out.println("boolean is false");
					}
					
				}
				else {
					//error dialog box here
					JOptionPane.showMessageDialog (null, "Admin Access Denied", "Title", JOptionPane.INFORMATION_MESSAGE);
					//System.out.println("not an amdin");
				}
				
				
				
				
			}
		});
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(568, 461, 117, 29);
		getContentPane().add(btnMainMenu);
		
		JLabel label = new JLabel("Username:");
		label.setBounds(470, 153, 75, 16);
		getContentPane().add(label);
		
		JLabel lblSecurityKey = new JLabel("Security Key:");
		lblSecurityKey.setForeground(Color.WHITE);
		lblSecurityKey.setBounds(470, 237, 91, 16);
		getContentPane().add(lblSecurityKey);
		
		
			
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
		
		//new background image added
				JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
				backgroundImage.setBounds(1, 1, 1198, 696);
				getContentPane().add(backgroundImage);

	}

	
	public static void main(String[] args) {


		AdminLogin frame = new AdminLogin();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}
