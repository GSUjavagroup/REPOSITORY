import java.awt.Container;

import javax.swing.*;

public class LoginPage extends JFrame {
	
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);
	
	JTextField TFUserName;
	JPasswordField TPPassword;
	
	JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
	JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");
	
	JButton BLogin;


}
