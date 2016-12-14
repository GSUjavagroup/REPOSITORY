package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import userInfo.Admin;
import userInfo.Customer;

public class selectData {
	
	public selectData(){
		//to be used for admin or customer data selection in MySQL
		//copy/ paste to test line: selectData select = new selectData();
		
	}
	public static <E> ArrayList< E > selectUser(String username) throws Exception{
		getConnection();	
		
		try{
			Connection conn = getConnection(); //establish connection
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user WHERE '"+username+"' = username");
			
			ResultSet result = stmt.executeQuery();
			
			//create a new array list to return to function
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()){ //basically saying while there's another result coming in
				array.add(result.getString("userType"));//arg can be column name or number
				array.add(result.getString("username"));
				array.add(result.getString("password"));
				array.add(result.getString("firstName"));
				array.add(result.getString("middleInitial"));
				array.add(result.getString("lastName"));
				array.add(result.getString("address"));
				array.add(result.getString("city"));
				array.add(result.getString("zip"));
				array.add(result.getString("state"));
				array.add(result.getString("email"));
				array.add(result.getString("ssn"));
				array.add(result.getString("secQ"));
				array.add(result.getString("secA"));
				
			}
			System.out.println("All records have been selected");
			return (ArrayList<E>) array;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return null;
	}
	
	public static <E> ArrayList< E > selectFlight(int flightID) throws Exception{
		getConnection();	
		
		try{
			Connection conn = getConnection(); //establish connection
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM flights WHERE '"+flightID+"' = flightID");
			
			ResultSet result = stmt.executeQuery();
			
			//create a new array list to return to function
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()){ //basically saying while there's another result coming in
				array.add(result.getString("flightID"));//arg can be column name or number
				array.add(result.getString("flightNum"));
				array.add(result.getString("departure"));
				array.add(result.getString("arrival"));
				array.add(result.getString("depTime"));
				array.add(result.getString("arrTime"));
				array.add(result.getString("duration"));
				array.add(result.getString("gate"));
				array.add(result.getString("capacity"));
				array.add(result.getString("cost"));
				
			}
			System.out.println("All records have been selected");
			return (ArrayList<E>) array;
		}catch(Exception e){
			System.out.println(e);
		}
		
		return null;
	}
	
	
	//standard connection method from other dbms; make sure matt shahzad updated password
	public static Connection getConnection() throws Exception{
		
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
