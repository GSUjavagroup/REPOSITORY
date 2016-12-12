package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//copy and paste this to test line: DeleteData delete = new DeleteData();

public class DeleteData {
	//this class is used to delete data from user, flights, and confirmation tables in MySQL
	
	//delete data from the user table using primary key username
	public static void deleteUser(String username){
		
		try{
			Connection conn = getConnection(); //establish connection
			
			PreparedStatement st = conn.prepareStatement("DELETE FROM user WHERE username = ?");
			//prepared statement needs to be updated for correct table name and argument type
			st.setString(1,username);
			//username is String value
			st.executeUpdate(); 
		      
		    conn.close();
			System.out.println("record has been deleted");
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	//delete data from flights table using primary key flightID
	public static void deleteFlight(int flightID){
		
		try{
			Connection conn = getConnection(); //establish connection
			
			PreparedStatement st = conn.prepareStatement("DELETE FROM flights WHERE flightID = ?");
			//update prepared statement for flights table and header flightID
			st.setInt(1,flightID);
			//fightID is int value
			st.executeUpdate(); 
		      
		    conn.close();
			System.out.println("record has been deleted");
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	//delete data from confirmation table using primary key confirmID
	public static void deleteConfirm(String confirmID){
		
		try{
			Connection conn = getConnection(); //establish connection
			
			PreparedStatement st = conn.prepareStatement("DELETE FROM confirmation WHERE confirmID = ?");
			//update prepared statement for confirmation table and header confirmID
			st.setString(1,confirmID);
			//confirmID is String value
			st.executeUpdate(); 
		      
		    conn.close();
			System.out.println("record has been deleted");
			
		}catch(Exception e){
			System.out.println(e);
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
