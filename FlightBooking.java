

import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JLabel;






public class FlightBooking extends JFrame{
	
	Object header[] = { "FLIGHT", "TO", "FROM", "DEPARTURE TIME", "ARRIVAL TIME", "DURATION", "GATE", "FLIGHT COST" };
	
	Object flightInfo[][] = {
			// 25 Different Flights.
			{ "AA6594", "Atlanta", "Las Vegas", "0800", "1100", "3 Hours", "C52", "$5,000 USD"},
			{ "GF5222", "Dallas", "Cleveland", "0800", "1100", "3 Hours", "A84", "$5,000 USD" },
			{ "LH6639", "Phoenix", "Pittsbugh", "0800", "1100", "3 Hours", "B23", "$5,000 USD" },
			{ "CX7121", "Miami", "Nashville", "0800", "1100", "3 Hours", "K46", "$5,000 USD" },
			{ "VA872", "Houston", "Bakersfield", "0800", "1100", "3 Hours", "L98" , "$5,000 USD"},
			{ "BD193", "Charleston", "Aurora", "0800", "1100", "3 Hours", "D77", "$5,000 USD" },
			{ "AA343", "New York", "Houston", "0800", "1100", "3 Hours", "M12", "$5,000 USD" },
			{ "BA211", "Los Angeles", "Detroit", "0800", "1100", "3 Hours", "D35", "$5,000 USD" },
			{ "HG845", "San Franciso", "San Jose", "0800", "1100", "3 Hours", "A74" , "$5,000 USD"},
			{ "LS602", "Cleveland", "New York", "0800", "1100", "3 Hours", "F92", "$5,000 USD" },
			{ "BV284", "Chicago", "Miami", "0800", "1100", "3 Hours", "G34", "$5,000 USD" },
			{ "OR0434", "San Jose", "Phoenix", "0800", "1100", "3 Hours", "L49" , "$5,000 USD"},
			{ "LO283", "Jacksonville", "Providence", "0800", "1100", "3 Hours", "A94" , "$5,000 USD"},
			{ "WE2323", "Fort Worth", "Seattle", "0800", "1100", "3 Hours", "B66", "$5,000 USD" },
			{ "DS091", "Detroit", "Miami", "0800", "1100", "3 Hours", "C55" , "$5,000 USD"},
			{ "LK122", "Boston", "Dallas", "0800", "1100", "3 Hours", "D33", "$5,000 USD" },
			{ "LF754", "Nashville", "Charleston", "0800", "1100", "3 Hours", "F77", "$5,000 USD" },
			{ "QZ4344", "Portland", "Reno", "0800", "1100", "3 Hours", "G56" , "$5,000 USD"},
			{ "LU1198", "Tucson", "Glendale", "0800", "1100", "3 Hours", "G57" , "$5,000 USD"},
			{ "MS323", "Fresno", "San Franciso", "0800", "1100", "3 Hours", "I87" , "$5,000 USD"},
			{ "AP111", "Oakland", "Chicago", "0800", "1100", "3 Hours", "J88" , "$5,000 USD"},
			{ "LK092", "Bakersfield", "Irving", "0800", "1100", "3 Hours", "K99", "$5,000 USD" },
			{ "SA434", "Aurora", "Jacksonville", "0800", "1100", "3 Hours", "L32", "$5,000 USD" },
			{ "PU878", "Pittsbugh", "Fort Worth", "0800", "1100", "3 Hours", "P21", "$5,000 USD" },
			{ "JH373", "Atlanta", "Fort Lauderdale", "0800", "1100", "3 Hours", "B43", "$5,000 USD" }};
			
	
	public FlightBooking() {
			
		getContentPane().setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		getContentPane().setLayout(null);


		JLabel lblRegPage = new JLabel("Flight Booking Page");
		lblRegPage.setBounds(510, 50, 260, 47);
		getContentPane().add(lblRegPage);	
		lblRegPage.setForeground(Color.blue);
		lblRegPage.setFont(new Font("Arial", Font.BOLD, 24));
		
		JTable table = new JTable(flightInfo, header);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(245,118,788,100);
		add(scrollPane);
		
		JButton btnSubmit = new JButton("Book");
		btnSubmit.setBounds(630, 232, 117, 30);
		getContentPane().add(btnSubmit);
		
		JButton btnMain = new JButton("Main Menu");
		btnMain.setBounds(500, 232, 117, 30);
		getContentPane().add(btnMain);
		
		
		String[] timeSearch = { "TIME SEARCH", "0001", "0100", "0200", "0300", "0400", "0500", "0600", "0700", "0800", "0900", "1000", "1100", 
				"1200", "1300", "1400", "1500", "1600", "1700", "1800", "1900", "2000", "2100", "2200", "2300","2400"};


		// Security Question List
		JComboBox comboBox_2 = new JComboBox(timeSearch);
		comboBox_2.setVisible(true);
		comboBox_2.setBounds(245, 270, 158, 27);
		getContentPane().add(comboBox_2);
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {


		FlightBooking frame = new FlightBooking();
		frame.setVisible(true);
		frame.setSize(1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	
}






