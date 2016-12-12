package mainGUIinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class RegistrationComplete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationComplete frame = new RegistrationComplete();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationComplete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblRegistrationComplete = new JLabel("Registration Complete!");
		lblRegistrationComplete.setFont(new Font("Futura", Font.BOLD, 30));
		lblRegistrationComplete.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRegistrationComplete, BorderLayout.NORTH);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.setBackground(Color.YELLOW);
		contentPane.add(btnReturnToMain, BorderLayout.SOUTH);
		
		//action to return to main menu
		btnReturnToMain.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Menu newWindow = new Menu();
				newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			
		});
		
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/thumbs.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 33, 90, 150);
		//frame.getContentPane().add(label);
		
		contentPane.add(label, BorderLayout.CENTER);
	}

}
