package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertFlightData {
	public static void main(String[]args) throws Exception{
		postFlight1();
		postFlight2();
		postFlight3();
		postFlight4();
		postFlight5();
		postFlight6();
		postFlight7();
		postFlight8();
		postFlight9();
		postFlight10();
		postFlight11();
	}
	

	public static void postFlight1() throws Exception{
		//create variables 
		final String flightNum = "AA6594";
		final String departure = "Las Vegas";
		final String arrival = "Atlanta";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "C52";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			//next make a prepared statement; args are SQL code; INSERT INTO "tablename" + fields to insert
			//SQL code: firstName, lastName (column headers) VALUES(' ')
			//inserting variables into values: single quote bc it's String, ending quote string + variable + ending quote, add variable same syntax
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight2() throws Exception{
		//create variables 
		final int flightID = 2;
		final String flightNum = "GF5222";
		final String departure = "Cleveland";
		final String arrival = "Pittsburgh";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "A84";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	public static void postFlight3() throws Exception{
		//create variables 
		final int flightID = 3;
		final String flightNum = "LH6639";
		final String departure = "Pittsburgh";
		final String arrival = "Phoenix";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "B23";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight4() throws Exception{
		//create variables 
		final int flightID = 4;
		final String flightNum = "CX7121";
		final String departure = "Nashville";
		final String arrival = "Miami";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "K46";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight5() throws Exception{
		//create variables 
		final int flightID = 5;
		final String flightNum = "VA872";
		final String departure = "Bakersfield";
		final String arrival = "Houston";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "L98";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight6() throws Exception{
		//create variables 
		final int flightID = 6;
		final String flightNum = "BD193";
		final String departure = "Aurora";
		final String arrival = "Charleston";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "D77";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	public static void postFlight7() throws Exception{
		//create variables 
		final int flightID = 7;
		final String flightNum = "AA343";
		final String departure = "Houston";
		final String arrival = "New York";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "M12";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight8() throws Exception{
		//create variables 
		final int flightID = 8;
		final String flightNum = "BA211";
		final String departure = "Detroit";
		final String arrival = "Los Angeles";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "D35";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight9() throws Exception{
		//create variables 
		final int flightID = 9;
		final String flightNum = "HG845";
		final String departure = "San Jose";
		final String arrival = "San Francisco";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "A74";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight10() throws Exception{
		//create variables 
		final int flightID = 10;
		final String flightNum = "LS602";
		final String departure = "New York";
		final String arrival = "Cleveland";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "G34";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
	public static void postFlight11() throws Exception{
		//create variables 
		final int flightID = 11;
		final String flightNum = "OR0434";
		final String departure = "Phoenix";
		final String arrival = "San Jose";
		final int depTime = 800;
		final int arrTime = 1100;
		final int duration = 3;
		final String gate = "L49";
		final int capacity = 150;
		final int cost = 200;
		
		try{
			//inside try statement: 1st: establish connection
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO flights(flightID, flightNum, departure, arrival, depTime, arrTime, duration, gate, capacity, cost) "
					+ "VALUES('"+flightID+"','"+flightNum+"', '"+departure+"', '"+arrival+"', '"+depTime+"', '"+arrTime+"', '"+duration+"', '"+gate+"', '"+capacity+"', '"+cost+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Insert Completed");
		}
	}
	
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
