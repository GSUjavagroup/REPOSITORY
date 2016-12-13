package EmailAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class validEmail {

public static void main(String[] args) {
	try {
		
//String myEmail = "shahzad093@blogspot.com";
String myEmail = JOptionPane.showInputDialog("Enter your email: ");
String strEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
Boolean b = myEmail.matches(strEmail);

if (b == false) {
	System.out.println("Invalid email address");
	JOptionPane.showMessageDialog(null,  "invalid email", "Alert", JOptionPane.ERROR_MESSAGE);
}

else if(b == true){
	System.out.println("Valid email address");
	JOptionPane.showMessageDialog(null, "valid email");
}
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}

