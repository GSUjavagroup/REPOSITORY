package PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

//phoneNo_REGEX
public class phoneCheck {
public static void main(String[]args) {
	
	String phoneNumber = JOptionPane.showInputDialog("Enter a phone number: ");
	System.out.println("Phone number 1234567890 validation result: " + validatePhoneNumber("1234567890"));
	System.out.println("Phone number 123-456-7890 validation result: " + validatePhoneNumber("123-456-7890"));
	System.out.println("Phone number 123-456-7890 x1234 validation result: " + validatePhoneNumber("123-456-7890 x1234"));
	System.out.println("Phone number 123-456-7890 ext1234 validation result: " + validatePhoneNumber("123-456-7890 ext1234"));
	System.out.println("Phone number (123)-456-7890 validation result: " + validatePhoneNumber("(123)-456-7890"));
	System.out.println("Phone number 123.456.7890 validation result: " + validatePhoneNumber("123.456.7890"));
	System.out.println("Phone number 123 456 7890 validation result: " + validatePhoneNumber("123 456 7890"));
	JOptionPane.showMessageDialog(null, "valid phoneNum", "Title", JOptionPane.INFORMATION_MESSAGE);
}

private static boolean validatePhoneNumber(String phoneNo) {
	//validate phone numbers of format "1234567890"
	if (phoneNo.matches("\\d{10}")) return true;
	//validating phone number with -, . or spaces
	else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
	//validating phone number with extension length from 3 to 5
	else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
	//validating phone number where area code is in braces ()
	else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
	//return false if nothing matches the input
	else return false;
}
}

