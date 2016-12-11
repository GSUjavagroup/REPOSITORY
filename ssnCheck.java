package AirlineReservationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ssnCheck {
	static String SSN_REGEX = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
	
	//How to validate SSN REGEX using Java?
	public static void main(String[]args) {
		List<String> ssnNumberList = new ArrayList<String>();
		
		//Valid SSN numbers
		ssnNumberList.add("345-54-7689");
		ssnNumberList.add("856-54-7582");
		
		//Invalid SSN numbers
		ssnNumberList.add("000-45-7689");
		ssnNumberList.add("85-345-7582");
		ssnNumberList.add("668-4577698");
		
		Pattern pattern = Pattern.compile(SSN_REGEX);
		
		for (String ssnNumber : ssnNumberList) {
			Matcher matcher = pattern.matcher(ssnNumber);
			if(matcher.matches()) {
				System.out.println(ssnNumber + " = valid SSN number");
			}
			else {
				System.out.println(ssnNumber + " = Invalid SSN number");
			}
		}
	}
}
