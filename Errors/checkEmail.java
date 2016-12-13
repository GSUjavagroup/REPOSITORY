package EmailAddress;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class checkEmail {

	
public static boolean checkEmail (String emailAd) {
	
if(emailAd.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
	return true;

//return false if nothing matches the input
else { 
	JOptionPane.showMessageDialog(null, "invalid email","Alert", JOptionPane.ERROR_MESSAGE);
	return false;
}
}
}
