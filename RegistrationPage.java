import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class RegistrationPage extends JFrame {

	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	public RegistrationPage() {

		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);

		JLabel lblRegPage = new JLabel("Registration Page");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);

		// changing color of text. (must import color from awt)
		lblRegPage.setForeground(Color.white);

		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));

		// First Name Text Field
		textField_1 = new JTextField();
		textField_1.setBounds(538, 123, 229, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		// Middle Initial Text Field
		textField_2 = new JTextField();
		textField_2.setBounds(538, 149, 28, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		// Last Name Text Field
		textField_3 = new JTextField();
		textField_3.setBounds(538, 173, 229, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		// Street Address Text Field
		textField_4 = new JTextField();
		textField_4.setBounds(538, 196, 229, 26);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		// City Text Field
		textField_5 = new JTextField();
		textField_5.setBounds(446, 226, 104, 26);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		// Zip Code Text Field
		textField_6 = new JTextField();
		textField_6.setBounds(734, 226, 82, 26);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		// SSN Text Field
		textField_7 = new JTextField();
		textField_7.setBounds(610, 259, 156, 26);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);

		// Email Address Text Field
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(610, 287, 156, 26);
		getContentPane().add(textField_8);

		// Username Text Field
		textField_9 = new JTextField();
		textField_9.setBounds(610, 310, 156, 26);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);

		// Initial Password Text Field
		textField_10 = new JTextField();
		textField_10.setBounds(610, 335, 156, 26);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);

		// Confirm Password Text Field
		textField_11 = new JTextField();
		textField_11.setBounds(610, 359, 156, 26);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);

		// Answer to Security Question Text Field
		textField_12 = new JTextField();
		textField_12.setBounds(610, 410, 156, 26);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);

		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(457, 128, 93, 16);
		getContentPane().add(lblFirstName);

		JLabel lblMiddleInitial = new JLabel("Middle Initial:");
		lblMiddleInitial.setBounds(443, 154, 93, 16);
		getContentPane().add(lblMiddleInitial);

		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(457, 178, 77, 16);
		getContentPane().add(lblLastName);

		JLabel lblStreetAddress = new JLabel("Street Address:");
		lblStreetAddress.setBounds(432, 201, 104, 16);
		getContentPane().add(lblStreetAddress);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(413, 231, 37, 16);
		getContentPane().add(lblCity);

		JLabel lblState = new JLabel("State:");
		lblState.setBounds(558, 231, 37, 16);
		getContentPane().add(lblState);

		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setBounds(670, 231, 61, 16);
		getContentPane().add(lblZipCode);

		JLabel lblSocialSecurityNumber = new JLabel("Social Security Number:");
		lblSocialSecurityNumber.setBounds(456, 264, 156, 16);
		getContentPane().add(lblSocialSecurityNumber);

		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(510, 292, 98, 16);
		getContentPane().add(lblEmailAddress);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(538, 315, 75, 16);
		getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(538, 340, 75, 16);
		getContentPane().add(lblPassword);

		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setBounds(483, 364, 130, 16);
		getContentPane().add(lblConfirmPassword);

		JLabel lblSecurityQuestion = new JLabel("Security Question:");
		lblSecurityQuestion.setBounds(485, 387, 123, 16);
		getContentPane().add(lblSecurityQuestion);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setBounds(547, 415, 61, 16);
		getContentPane().add(lblAnswer);

		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.setBounds(432, 461, 117, 29);
		getContentPane().add(btnClearAll);

		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setBounds(568, 461, 117, 29);
		getContentPane().add(btnMainMenu);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(704, 461, 117, 29);
		getContentPane().add(btnRegister);

		String[] states = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
				"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
				"NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
				"WY" };

		// State List
		JComboBox comboBox_1 = new JComboBox(states);
		comboBox_1.setVisible(true);
		comboBox_1.setBounds(595, 227, 70, 27);
		getContentPane().add(comboBox_1);

		String[] securQuest = { "What is your Mother's Maiden Name?", "Who is your favorite actor/actress?",
				"What was your first pet's name?", "What city were you born in?", "What is your favorite class at GSU?",
				"What is your favorite colour?" };

		// Security Question List
		JComboBox comboBox_2 = new JComboBox(securQuest);
		comboBox_2.setVisible(true);
		comboBox_2.setBounds(610, 383, 328, 27);
		getContentPane().add(comboBox_2);

	}

	public static void main(String[] args) {

		RegistrationPage frame = new RegistrationPage();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
