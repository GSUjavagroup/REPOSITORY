import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class CollectingData extends JFrame {


	private JTextField textField_1;
	


	public CollectingData() {


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


		
		JLabel lblFirstName = new JLabel("Enter #:");
		lblFirstName.setBounds(457, 128, 93, 16);
		getContentPane().add(lblFirstName);
		
		
		JButton btnRegister = new JButton("ENTER");
		btnRegister.setBounds(554, 175, 117, 29);
		getContentPane().add(btnRegister);
		
	}
	
	 private class ButtonListener implements ActionListener {
		    @Override 
		    public void actionPerformed(ActionEvent e) {
		      // Get values from text fields
		     
		      int number = Integer.parseInt(textField_1.getText());
		      


		     
		    }
		  }
	
	
	public static void main(String[] args) {


		CollectingData frame = new CollectingData();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		


	}
}






