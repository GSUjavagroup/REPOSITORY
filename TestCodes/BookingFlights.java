package testCodes;

import javax.swing.JFrame;

import mainGUIinterface.FlightTable;

public class BookingFlights {
	
	//This is probably how he wants all our pages to be called - this essentially is calling my file "FlightTable"
	//file located in database folder since it's pulling and pushing to MySQL
	
	public BookingFlights(){
		
	}
	
	public static void main(String[] args) {
		
		FlightTable  flightTable = new FlightTable ();
		flightTable.setVisible(true);
		flightTable.setSize(1200, 700);
		flightTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
