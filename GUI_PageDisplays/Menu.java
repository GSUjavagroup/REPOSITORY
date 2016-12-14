package mainGUIinterface;
//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
//import java.awt.;" & "import java.awt.event.; for window closing?

public class Menu extends JFrame {
	
	static Menu frame; //will allow us to close frames when navigating now 
	//static JFrame frame;
	
	
	public Menu() {
		
		JFrame frame = new JFrame("Menu");
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		

		getContentPane().setBackground(UIManager.getColor("Desktop.background"));
		getContentPane().setLayout(null);

		JLabel lblMainMenu = new JLabel("MAIN MENU");
		lblMainMenu.setBounds(530, 160, 176, 47);
		getContentPane().add(lblMainMenu);


		// changing color of text. (must import color from awt)
		lblMainMenu.setForeground(Color.white);
		lblMainMenu.setFont(new Font("Arial", Font.BOLD, 24));

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(477, 251, 117, 29);
		getContentPane().add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Registration newWindow = new Registration();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.dispose();		//close the frame
				//close();
				
			}
			
		});


		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(594, 251, 117, 29);
		getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Login newWindow = new Login();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.dispose();
				//close();
				//Menu.dispose(); //new added close feature
			}
			
		});
		
		//new background image added
		JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
		backgroundImage.setBounds(1, 1, 1198, 696);
		getContentPane().add(backgroundImage);
		
	}
	
	public void close() {
		WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
	}
	//execute GUI display
	public static void main(String[] args) {


		Menu frame = new Menu();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.dispose();		//close the frame 

	}


}


