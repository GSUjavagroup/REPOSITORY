import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ForgotPassword extends JFrame {

	private JTextField textField_1;
	

	public ForgotPassword() {

		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);

		JLabel lblRegPage = new JLabel("Forgot Password Page");
		lblRegPage.setBounds(510, 50, 300, 47);
		getContentPane().add(lblRegPage);

		lblRegPage.setForeground(Color.black);

		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));

		// Email Address Text Field
		textField_1 = new JTextField();
		textField_1.setBounds(600, 175, 229, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		
		JLabel lblFirstName = new JLabel("Enter Username:");
		lblFirstName.setBounds(457, 180, 130, 16);
		getContentPane().add(lblFirstName);

		
		JButton btnSubmit = new JButton("Enter");
		btnSubmit.setBounds(645, 232, 117, 30);
		getContentPane().add(btnSubmit);
		
		JButton btnMain = new JButton("Main Menu");
		btnMain.setBounds(515, 232, 117, 30);
		getContentPane().add(btnMain);
		
			
	}

	public static void main(String[] args) {

		ForgotPassword frame = new ForgotPassword();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}