package MiddleInitial;

import javax.swing.JOptionPane;

public class validMiddleInitial {
	
	
public String getInitial(String fullName) { // Shahzad F Irani
String[] split = fullName.split(" "); // { “Shahzad”, “F”, “Irani” }
return split[1];
	}

}
