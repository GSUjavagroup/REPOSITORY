import javax.swing.*;
public class Utilities {
	
	public static void setUserView(){
		//research UI manager with java swing: set look and feel
		
		try {
			UIManager.setLookAndFeel((UIManager.getSystemLookAndFeelClassName()));
		}
		catch(Exception e) {
			System.out.println("Error setting look/feel w/swing" + e);
		}
	}

}
