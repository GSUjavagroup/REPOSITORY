package PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//phoneNo_REGEX

public class validPhone {
public static void main(String[]args) {

List <String> input = new ArrayList<String>();
String strPhoneNum = JOptionPane.showInputDialog("Enter phone number: ");
Boolean validPhoneNum = true;

if(strPhoneNum.length() != 10) {
validPhoneNum = false;
JOptionPane.showMessageDialog(null, "invalid phoneNum","Alert", JOptionPane.ERROR_MESSAGE);
}

try {
	strPhoneNum = strPhoneNum();
} catch (NumberFormatException e) {
	validPhoneNum = false;
}

if(validPhoneNum == true) {
	input.add(strPhoneNum);
}
else {
JOptionPane.showMessageDialog(null, "invalid phoneNum", "Alert", JOptionPane.ERROR_MESSAGE);
}

for (String currentPhoneNum : input) {
	JOptionPane.showMessageDialog(null, "valid phoneNum", "Hooray", JOptionPane.INFORMATION_MESSAGE);
	System.out.println("Hooray! valid phoneNum: " + currentPhoneNum);
}

//Output = Hooray! valid phoneNum: 123-456-7890.
}

private static String strPhoneNum() {
	return null;
}

private static boolean validatePhoneNumber(String phoneNo) {
		
//validate phone numbers of format "1234567890"
	if (phoneNo.matches("\\d{10}"))
	return true;


	//validating phone number with -, . or spaces
	else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
	return true;

	//validating phone number with extension length from 3 to 5
	else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) 
	return true;

	//validating phone number where area code is in braces ()
	else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) 
	return true;

	//return false if nothing matches the input
	else { 
	JOptionPane.showMessageDialog(null, "invalid phoneNum","Alert", JOptionPane.ERROR_MESSAGE);
	return false;
	}
}
}

