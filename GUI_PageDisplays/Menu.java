package mainGUIinterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.UIManager;


public class Menu extends JFrame {


	public Menu() {


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
			}
			
		});
		
	}


	public static void main(String[] args) {


		Menu frame = new Menu();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}


}


