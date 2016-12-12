package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import polymorphObj.Admin;
import polymorphObj.Customer;


public class SendData {
	//use this class for sending data to MySQL for the first time - use updateData for updates
	//copy/paste in the test method: sendData send = new sendData();
	
	public SendData(){
		
	}
	
	//code to send customer object data to MySQL
	public void postCust(Customer a) throws Exception{
		
		int userType = a.getUserType(); 				//userType 			1
		String username = a.getUsername(); 				//username			2
		String password = a.getPassword(); 				//password			3
		String firstName = a.getFirstName();			//firstName			4
		String middleInitial = a.getMiddleInitial();	//middleInitial		5
		String lastName = a.getLastName();				//lastName			6
		String address = a.getAddress();				//address			7
		String city = a.getCity();						//city				8
		int zip = a.getZip();							//zip				9
		String state = a.getState();					//state				10
		String email = a.getEmail();					//email				11
		int ssn = a.getSsn();							//ssn				12
		String secQ = a.getSecQ();						//secQ				13
		String secA = a.getSecA();						//secA				14

		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			
			String query = " insert into user (userType, username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA)"
			        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt		(1, userType);
		    preparedStmt.setString	(2, username);
		    preparedStmt.setString	(3, password);
		    preparedStmt.setString	(4, firstName);
		    preparedStmt.setString	(5, middleInitial);
		    preparedStmt.setString	(6, lastName);
		    preparedStmt.setString	(7, address);
		    preparedStmt.setString	(8, city);
		    preparedStmt.setInt		(9, zip);
		    preparedStmt.setString	(10, state);
		    preparedStmt.setString	(11, email);
		    preparedStmt.setInt		(12, ssn);
		    preparedStmt.setString	(13, secQ);
		    preparedStmt.setString	(14, secA);

		    // execute the preparedstatement
		    preparedStmt.execute();
		      
		    con.close();
			
			
		}catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
				
		}
			
	}
	
	//code to send admin object data to MySQL
	public void postAdmin(Admin a) throws Exception{
			
		int userType = a.getUserType(); 				//userType 			1
		String username = a.getUsername(); 				//username			2
		String password = a.getPassword(); 				//password			3
		String firstName = a.getFirstName();			//firstName			4
		String middleInitial = a.getMiddleInitial();	//middleInitial		5
		String lastName = a.getLastName();				//lastName			6
		String address = a.getAddress();				//address			7
		String city = a.getCity();						//city				8
		int zip = a.getZip();							//zip				9
		String state = a.getState();					//state				10
		String email = a.getEmail();					//email				11
		int ssn = a.getSsn();							//ssn				12
		String secQ = a.getSecQ();						//secQ				13
		String secA = a.getSecA();						//secA				14

		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
				
			String query = " insert into user (userType, username, password, firstName, middleInitial, lastName, address, city, zip, state, email, ssn, secQ, secA)"
				        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt		(1, userType);
			preparedStmt.setString	(2, username);
			preparedStmt.setString	(3, password);
			preparedStmt.setString	(4, firstName);
			preparedStmt.setString	(5, middleInitial);
			preparedStmt.setString	(6, lastName);
			preparedStmt.setString	(7, address);
			preparedStmt.setString	(8, city);
			preparedStmt.setInt		(9, zip);
			preparedStmt.setString	(10, state);
			preparedStmt.setString	(11, email);
			preparedStmt.setInt		(12, ssn);
			preparedStmt.setString	(13, secQ);
			preparedStmt.setString	(14, secA);

			// execute the preparedstatement
			preparedStmt.execute();
			      
			con.close();
				
				
		}catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
					
		}
				
	}		
	
	
	//code to send flight data to MySQL
	public void postFlight(int flightID, String flightNum, String departure, String arrival, int depTime, int arrTime, int duration, String gate, int capacity, int cost){
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
				//change to flights table
			String query = " insert into flights (flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost)"
				        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt		(1, flightID);
			preparedStmt.setString	(2, flightNum);
			preparedStmt.setString	(3, departure);
			preparedStmt.setString	(4, arrival);
			preparedStmt.setInt		(5, depTime);
			preparedStmt.setInt		(6, arrTime);
			preparedStmt.setInt		(7, duration);
			preparedStmt.setString	(8, gate);
			preparedStmt.setInt		(9, capacity);
			preparedStmt.setInt		(10, cost);
	
			// execute the preparedstatement
			preparedStmt.execute();
			      
			con.close();
				
				
		}catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
					
		}
		
	}

	
	//standard connection method used in other dbms codes; matt & shahzad will need to change username/password
	public static Connection getConnection() throws Exception{
		//import connection from java.sql and add try/catch 
		try{
			String driver = "com.mysql.jdbc.Driver";
			//string url is where the database is located over the Internet 
			String url = "jdbc:mysql://localhost:3306/AirlineReservation";
					//formula for local is default 3306 port + database name
					//if not using local host then put IP address of server connecting to
			String username = "root"; //default username
			String password = "5rujiruz"; //whatever you set your password to on installation
			//default username is root and use password set in terminal setup
			Class.forName(driver);
			//driver variable created above is used
			
			Connection conn = DriverManager.getConnection(url, username, password);
					//import driver manager and use built in method getConnection
			
			System.out.println("Connected");
			return conn;
		} catch (Exception e) {
			System.out.println(e); //make sure we add a catch for failed connections
		}
		
		return null;
		//leave as null and return connection in the try statement above
	}

}
