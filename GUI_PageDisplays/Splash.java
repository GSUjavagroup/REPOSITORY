package mainGUIinterface;
//CIS 3270 Group Project: Laura Hornor, Matt Healy, Shahzad Irani
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

//START ON THIS SCREEN
//Splash screen will have 10 second timer before going to main menu 
public class Splash extends JFrame {
	
	Splash() {
		
		getContentPane().setBackground(SystemColor.window);
		getContentPane().setLayout(null);
		
		JProgressBar bar = new JProgressBar();
		bar.setBounds(540, 610, 146, 20);
		getContentPane().add(bar);
		
		bar.setMaximum(1000);
	    bar.setMinimum(0);
	    bar.setValue(3);
	    
	    for(int i=0;i<=600;i++){
	    	
	           bar.setValue(i);


	       }
	    
	    
		JLabel title = new JLabel("Welcome to Java Airlines!");
		title.setBounds(440, 70, 400, 29);
		getContentPane().add(title);
		title.setForeground(Color.red);
		title.setFont(new Font("Arial", Font.BOLD, 28));
		
		
		//call the pic from image folder 
		JLabel label = new JLabel(new ImageIcon(getClass().getResource("/AirPic.png")));
		label.setBounds(160, 150, 937, 403);
		getContentPane().add(label);
		
		
	
		ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	Menu newWindow = new Menu();
			    newWindow.setVisible(true);
				newWindow.setVisible(true);
				newWindow.setSize(1200, 700);
				newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	
            }
        };
        
        //Matts timer code
        Timer timer = new Timer(5000 ,taskPerformer);
        timer.setRepeats(false);
        timer.start();


        
	}
	
	
	//run the GUI
	public static void main(String[] args) {
		
		Splash frame = new Splash();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
}


