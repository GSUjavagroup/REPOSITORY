package AirlineReservationSystem;
import javax.swing.JOptionPane;

public class DialogDemo {
public static void main(String[]args) {
		
	String strNoun;
	String strVerb;
	String strVerbDefine; //Verb definition

	//Getting the noun
	strNoun = JOptionPane.showInputDialog("Enter a noun: ");

	//Getting the verb
	strVerb = JOptionPane.showInputDialog("Enter a verb: (Ex: eat, sleep)");

	//Getting the definition of the verb
	strVerbDefine = JOptionPane.showInputDialog("What is the definition of the verb?");

	//show user their new word
	JOptionPane.showMessageDialog(null, " Search " + " - " + strNoun +
			" - " + strVerb + " - " +strVerbDefine + " in a " + strNoun);

	//closing the program
	System.exit(0);
}
}

