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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ForgotUsername extends JFrame {

	JFrame window = new JFrame();
	private JTextField textField_1;
	static ForgotUsername frame; //initalize for frame close 

	public ForgotUsername() {


		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Forgot Username Page");
		lblRegPage.setBounds(510, 50, 300, 47);
		getContentPane().add(lblRegPage);


		lblRegPage.setForeground(Color.WHITE);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));


		// Email Address Text Field
		textField_1 = new JTextField();
		textField_1.setBounds(600, 175, 229, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFirstName = new JLabel("Enter Email Address:");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(457, 180, 130, 16);
		getContentPane().add(lblFirstName);
		
		JButton btnSubmit = new JButton("Enter");
		btnSubmit.setBounds(645, 232, 117, 30);
		getContentPane().add(btnSubmit);
		
		JButton btnMain = new JButton("Main Menu");
		btnMain.setBounds(515, 232, 117, 30);
		getContentPane().add(btnMain);

//-----------------------------------------------------------------BUTTON ACTIONS		
		// BUTTON ACTION FOR MAIN MENU
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
		
		//BUTTON ACTION FOR ENTER
		btnSubmit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (valid email){
					//dialoge box says that username has been emailed
					JOptionPane.showMessageDialog (null, "Your username has been emailed!", "Title", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else {
					//dialogue box says that the email address could not be found
					JOptionPane.showMessageDialog (null, "We did not find that email in our system", "Title", JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
			
		});
		
		//new background image added
		JLabel backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
		backgroundImage.setBounds(1, 1, 1198, 696);
		getContentPane().add(backgroundImage);
			
	}


	public static void main(String[] args) {


		ForgotUsername frame = new ForgotUsername();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}