package SocialSecurity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ValidSocial {
	
public static void main(String[] args) {
	List<String> input = new ArrayList<String>();
	String strSSN = JOptionPane.showInputDialog("Enter ssn: ");
	input.add("123-45-6789");
	input.add("9876-5-4321");
	input.add("666-65-4321 (attack)");
	input.add("000-65-4321 ");
	input.add("192-83-7465");

//SSN starting with 000 or 666 are invalid.
//SSN has to be in format of 3-2-4.
	
for (String ssn : input) {
	if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
		System.out.println("Hooray! Valid SSN: " + ssn);

	}
}
}
}
