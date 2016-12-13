package MiddleInitial;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class validMiddleInitial {
	
//public String getInitial(String fullName) { // Shahzad F Irani
//String[] split = fullName.split(" "); // { “Shahzad”, “F”, “Irani” }
//return split[1];
	//}

//strCheckInitial

	public static boolean checkInitial(String middleInitial) {
	
	if (middleInitial.length() == 1 ){
		return true;
	}
	else {
JOptionPane.showMessageDialog(null, "invalid middleInitial", "Alert", JOptionPane.ERROR_MESSAGE);
		return false;
	}
}
}

