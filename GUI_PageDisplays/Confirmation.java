package mainGUIinterface;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Confirmation extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	
	public Confirmation() {


		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Congratulations!");
		lblRegPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);
		lblRegPage.setForeground(Color.red);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		JButton btnMain = new JButton("Return to Main Menu");
		btnMain.setBackground(new Color(255, 0, 0));
		btnMain.setBounds(539, 542, 182, 30);
		getContentPane().add(btnMain);
		
		//confirmation panel needs to pull the array list row from database
		//first pull the row to display
		
//		JList<String> displayList = new JList<>(wordlist.toArray(new String[0]));
//		JPanel confirmPanel = new JPanel(displayList);
//		confirmPanel.setBounds(322, 301, 611, 229);
//		getContentPane().add(confirmPanel);
//		
//		
//        
//
//        getContentPane().add(scrollPane);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        pack();
//        setVisible(true);
		
		
		//firework display code
		JLabel lblCongratsPic = new JLabel("");
		lblCongratsPic.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/firework.jpg")).getImage();
		lblCongratsPic.setIcon(new ImageIcon(img));
		lblCongratsPic.setBounds(322, 92, 611, 150);
		getContentPane().add(lblCongratsPic);
		
		JLabel lblNewLabel = new JLabel("Please save or print confirmation below:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(322, 264, 611, 16);
		getContentPane().add(lblNewLabel);
		
		
		btnMain.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		
		


	}
	
	public static void main(String[] args) {


		Confirmation frame = new Confirmation();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}


