import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	
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
		
		textField = new JTextField();
		textField.setBounds(548, 148, 146, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(472, 186, 75, 16);
		getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(548, 181, 146, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnForgotUsername = new JButton("Forgot Username?");
		btnForgotUsername.setBounds(422, 353, 156, 29);
		getContentPane().add(btnForgotUsername);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setBounds(579, 353, 152, 29);
		getContentPane().add(btnForgotPassword);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(530, 232, 99, 35);
		getContentPane().add(btnSubmit);
		
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