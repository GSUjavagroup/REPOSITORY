package testCodes;

import database.DeleteData;
import database.SendData;

public class PopulatingData {
	public static void main(String[]args){
		
		DeleteData delete = new DeleteData();
		SendData send = new SendData();
		
		//first delete all row in flights table
		//delete.deleteFlight(5);
		
		//replace variable data from website: http://www.flightstats.com/go/FlightStatus/flightStatusByAirport.do?airportQueryType=1&airportCode=ATL
//		int flightID = 1;
//		String flightNum = "2609";
//		String departure = "Charlotte";
//		String arrival = "Atlanta";
//		int depTime = 1045;
//		int arrTime = 1155;
//		int duration = 1;
//		String gate = "B25";
//		int capacity = 200;
//		int cost = 175;
		
//		int flightID = 2;
//		String flightNum = "2012";
//		String departure = "Chicago";
//		String arrival = "Orlando";
//		int depTime = 1500;
//		int arrTime = 1800;
//		int duration = 3;
//		String gate = "D13";
//		int capacity = 150;
//		int cost = 320;
		
//		int flightID = 3;
//		String flightNum = "2012";
//		String departure = "Washington";
//		String arrival = "Houston";
//		int depTime = 1200;
//		int arrTime = 1700;
//		int duration = 5;
//		String gate = "A15";
//		int capacity = 200;
//		int cost = 265;
		
//		int flightID = 4;
//		String flightNum = "5834";
//		String departure = "Atlanta";
//		String arrival = "Miami";
//		int depTime = 700;
//		int arrTime = 900;
//		int duration = 2;
//		String gate = "B22";
//		int capacity = 100;
//		int cost = 80;
		
		int flightID = 5;
		String flightNum = "5834";
		String departure = "Detroit";
		String arrival = "Greenville";
		int depTime = 1100;
		int arrTime = 1600;
		int duration = 5;
		String gate = "C12";
		int capacity = 250;
		int cost = 425;
		
		//next let's populate new flight data
		send.postFlight(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost);
		
	}

}
