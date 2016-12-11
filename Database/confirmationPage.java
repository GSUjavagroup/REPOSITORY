package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.security.SecureRandom;
import java.math.BigInteger;

import userInfo.Admin;
import userInfo.Customer;

public class confirmationPage {
	static selectData select = new selectData(); //call select data methods 
	private static SecureRandom random = new SecureRandom(); //used for generating random string for confirmID
	
	//copy/paste into test: confirmationPage confirm = new confirmationPage();
	
	public confirmationPage(){
		//flightID is primary; username is primary 
		//construct data to pull data and populate in confirmation table
		
	}
	
	public static void insertConfirm(ArrayList<String> array) throws Exception{
		//insert data into MySQL
		getConnection();
		String col1 = array.get(0);	//confirmID
		String col2 = array.get(1);	//flightID
		String col3 = array.get(2);	//username
		String col4 = array.get(3);	//cost
		
		try{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO confirmation(confirmID, flightID, username, cost) "
					+ "VALUES('"+col1+"', '"+col2+"', '"+col3+"', '"+col4+"') ");
			
			//now run our statement
			posted.executeUpdate(); //Query is receiving info; Update is adding info
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Confirmation Page Updated");
		}
		
	}
	
	public static  ArrayList<String> selectConfirm(String username, int flightID) throws Exception{
		//select data from two tables
		
		ArrayList<String> userArray = select.selectUser(username);
		ArrayList<String> flightArray = select.selectFlight(flightID);
		
		String col1 = (String) new BigInteger(130, random).toString(32); //random alphanumeric
		String col2 = flightArray.get(0);	//this is flightID
		String col3 = userArray.get(1); 	//this is username
		String col4 = flightArray.get(9);	//this is cost
		
		ArrayList< String > confirmArray = new ArrayList< String >();
		confirmArray.add(col1);
		confirmArray.add(col2);
		confirmArray.add(col3);
		confirmArray.add(col4);
		
		return confirmArray;
	}
	
	
	//standard connection method from all dbms codes
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

