package SocialSecurity;
//SSN using ArrayList. Parse strSSN to Integer.
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ValidSocial {
	
public static void main(String[] args) {
	List<Integer> input = new ArrayList<Integer>();
	String strSSN = JOptionPane.showInputDialog("Enter ssn: "); 
	Boolean validSSN = true;
	if(strSSN.length()!= 9) {
		validSSN = false;
}
int intSSN = -1; //dummy. placeholder value.

try {
intSSN = Integer.parseInt(strSSN);  // 12345345
} catch (NumberFormatException e) {
	validSSN = false;
}

if(validSSN == true) {
		input.add(intSSN);
}
else {
JOptionPane.showMessageDialog(null, "invalid ssn","Alert", JOptionPane.ERROR_MESSAGE);
}

//SSN starting with 000 or 666 are invalid.
//SSN has to be in format of 3-2-4.
	
for (Integer currentSsn : input) {
System.out.println("Hooray! Valid SSN: " + currentSsn);
JOptionPane.showMessageDialog(null, "valid ssn!", "Hooray", JOptionPane.INFORMATION_MESSAGE);
}
}

public boolean isSSN(String userInput) {
	if (userInput.length() != 9) {
		return false;
}


try {
	int value = Integer.parseInt(userInput);
	return true;
	
}

catch (NumberFormatException e) {
return false;
}
}
}


